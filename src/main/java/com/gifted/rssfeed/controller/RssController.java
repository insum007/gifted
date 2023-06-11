package com.gifted.rssfeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gifted.rssfeed.model.Item;
import com.gifted.rssfeed.service.RssService;

@RestController
public class RssController {

	@Autowired
	private RssService rssService;

	@GetMapping("/items")
	public List<Item> getItems() {

		return rssService.getItems();

	}
}
