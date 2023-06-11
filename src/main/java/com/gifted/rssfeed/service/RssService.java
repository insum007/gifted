package com.gifted.rssfeed.service;

import java.util.List;

import com.gifted.rssfeed.model.Item;

public interface RssService {


	public void saveFeeds();

	public List<Item> getItems();

}
