package com.gifted.rssfeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gifted.rssfeed.model.Item;
import com.gifted.rssfeed.service.RssService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RssController {

	@Autowired
	private RssService rssService;

	@GetMapping("/items")
	public List<Item> getItems() {
		log.info("Inside getItems method of RssController");
		return rssService.getItems();

	}
}
