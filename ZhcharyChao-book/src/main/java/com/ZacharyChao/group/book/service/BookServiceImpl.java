package com.ZacharyChao.group.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZacharyChao.group.book.entity.Book;
import com.ZacharyChao.group.book.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<Book> getAll() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}
	@Override
	public Book getInfo(String bid) {
		
		return bookRepository.findById(Long.valueOf(bid)).get();
	}

}
