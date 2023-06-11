package com.gifted.rssfeed.service;

import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gifted.rssfeed.model.Item;
import com.gifted.rssfeed.repository.ItemRepository;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RssServiceImpl implements RssService {

	@Value("${consume.url}")
	private String consumeUrl;

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getItems() {
		log.info("Inside getItems method of RssService");
		saveFeeds();
		return itemRepository.findAll();
	}

	@Override
	public void saveFeeds() {
		log.info("Inside saveFeeds method of RssService");
		try {

			try (XmlReader reader = new XmlReader(new URL(consumeUrl))) {
				SyndFeed feed = new SyndFeedInput().build(reader);
				List<SyndEntry> latestFeeds = feed.getEntries().stream().limit(10).toList();
				List<Item> existFeeds = itemRepository.findAll();
				for (SyndEntry entry : latestFeeds) {
					Item item = Item.builder().title(entry.getTitle()).description(entry.getDescription().toString())
							.publication(entry.getPublishedDate()).build();
					if (existFeeds.stream().anyMatch(i -> i.getTitle().equals(entry.getTitle()))) {

						itemRepository.update(entry.getDescription().toString(), entry.getPublishedDate(),
								entry.getTitle());

					}

					else {
						itemRepository.save(item);

					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
