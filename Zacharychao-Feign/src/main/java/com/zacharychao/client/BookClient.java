package com.zacharychao.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="book",fallback=BookClient.BookClientImpl.class)
public interface BookClient {
	@GetMapping("/api/v1/books")
	public String getBooks();
	
	@GetMapping("/api/v1/book")
	public String getBookById(@RequestParam("bid") String id);
	@Component
	static class BookClientImpl implements BookClient{

		@Override
		public String getBooks() {
			
			return "----- success ------";
		}

		@Override
		public String getBookById(String id) {
			
			return "**** success ****";
		}
		
	}
}
