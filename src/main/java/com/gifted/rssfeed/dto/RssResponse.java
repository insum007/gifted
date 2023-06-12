package com.gifted.rssfeed.dto;

import java.util.List;

import com.gifted.rssfeed.model.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RssResponse {
	
	 private List<Item> content;
	    private int page;
	    private int size;
	    private long totalElements;
	    private int totalPages;
	    private boolean last;

}
