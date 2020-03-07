package com.ZacharyChao.group.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ZacharyChao.group.book.entity.Book;
import com.ZacharyChao.group.book.service.BookService;

@RestController
@CrossOrigin
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping("/api/v1/books")
	public List<Book> books(){
		List<Book> all = bookService.getAll();
		return all;
	}
	
	@GetMapping("/api/v1/book")
	public String getInfo(@RequestParam("bid") String bid) {
		return bookService.getInfo(bid).toString();
	}
}
