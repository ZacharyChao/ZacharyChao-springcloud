package com.zacharychao.hystrix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("book")
public interface BookClient {
	@GetMapping("/api/v1/book")
	public String getBook(@RequestParam("bid") String id);
	
	@GetMapping("/api/v1/books")
	public String getBooks() ;
}
