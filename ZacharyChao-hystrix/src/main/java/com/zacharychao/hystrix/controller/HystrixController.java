package com.zacharychao.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zacharychao.hystrix.client.BookClient;
import com.zacharychao.hystrix.entity.User;
import com.zacharychao.hystrix.mapper.UserMapper;

@RestController
public class HystrixController {
	@Autowired
	private BookClient bookClient;
	
	@Autowired
	private UserMapper userMapper;
	
	@HystrixCommand(fallbackMethod="fallback")
	@GetMapping("/getBook")
	public String getBook(@RequestParam("id") String bid) {
		return bookClient.getBook(bid);
	}
	
	public String fallback(String bid) {
		return "fallback";
	}
	
	@GetMapping("/getAllBooks")
	@HystrixCommand(fallbackMethod = "fallback2")
	public String getAllBooks() {
		return bookClient.getBooks();
	}
	
	public String fallback2() {
		return "fallback2";
	}
	
	@GetMapping("/getUser")
	public User getUser(@RequestParam("uid") String id) {
		return userMapper.findById(id);
	}
	
	
}
