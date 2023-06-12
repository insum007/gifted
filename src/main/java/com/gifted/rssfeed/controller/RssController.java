package com.gifted.rssfeed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gifted.rssfeed.dto.RssResponse;
import com.gifted.rssfeed.service.RssService;
import com.gifted.rssfeed.utils.AppConstants;

import lombok.extern.slf4j.Slf4j;

/**
 * RssController
 * 
 * @author Musni
 *
 */
@RestController
@Slf4j
public class RssController {

	@Autowired
	private RssService rssService;

	/**
	 * This method for get all RSS Feeds
	 * 
	 * @param page
	 * @param size
	 * @param sort
	 * @param direction
	 * @return RssResponse
	 * 
	 */
	@GetMapping("/items")
	public RssResponse getItems(
			@RequestParam(value = "page", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int page,
			@RequestParam(value = "size", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int size,
			@RequestParam(value = "sort", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sort,
			@RequestParam(value = "direction", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String direction) {
		log.info("Inside getItems method of RssController");
		return rssService.getItems(page, size, sort, direction);

	}
}
