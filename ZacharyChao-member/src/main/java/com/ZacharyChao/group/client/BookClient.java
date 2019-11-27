package com.ZacharyChao.group.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="book")
public interface BookClient {
	@GetMapping("/api/v1/book")
	public String getInfo(@RequestParam("bid")String bid);
}
