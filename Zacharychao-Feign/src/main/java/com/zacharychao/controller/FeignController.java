package com.zacharychao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zacharychao.client.BookClient;

@RestController
public class FeignController {
	@Autowired
	private BookClient bookClient;
	
	@GetMapping("/getBooks")
	public String getBooks() {
		return bookClient.getBooks();
	}
	
	@GetMapping("/getBook")
	public String getBookById(@RequestParam("id") String id) {
		return bookClient.getBookById(id);
	}
}
