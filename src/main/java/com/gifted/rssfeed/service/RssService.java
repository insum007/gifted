package com.gifted.rssfeed.service;

import com.gifted.rssfeed.dto.RssResponse;

public interface RssService {

	public void saveFeeds();

	public RssResponse getItems(int page, int size, String sort, String direction);

}
