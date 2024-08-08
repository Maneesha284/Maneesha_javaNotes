package com.ojas.service;

import java.util.List;

import com.ojas.model.Book;

public interface BookService {

	int insert(Book book);
	List<Book> viewAllBooks();
	
}
