package com.ZacharyChao.group.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ZacharyChao.group.book.entity.Book;
import com.ZacharyChao.group.book.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping("/api/v1/books")
	public List<Book> books(){
		return bookService.getAll();
	}
	
	@GetMapping("/api/v1/book")
	public String getInfo(@RequestParam("bid") String bid) {
		return bookService.getInfo(bid).toString();
	}
}
