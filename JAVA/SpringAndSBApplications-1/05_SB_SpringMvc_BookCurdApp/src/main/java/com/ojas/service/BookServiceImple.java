package com.ojas.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ojas.entity.BookEntity;
import com.ojas.model.Book;
import com.ojas.repo.BookDaoRepository;

@Service
public class BookServiceImple implements BookService {
	@Autowired
	private BookDaoRepository bookRepo;

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		BookEntity bookEntity = new BookEntity();
		/*
		 * bookEntity.setBookId(book.getBookId());
		 */
		BeanUtils.copyProperties(book, bookEntity);
		BookEntity savedEntity = bookRepo.save(bookEntity);
		int count = 0;
		if (savedEntity != null)
			count = 1;
		return count;
	}

	@Override
	public List<Book> viewAllBooks() {
		// TODO Auto-generated method stub
		List<BookEntity> bookRecords = bookRepo.findAll();
		List<Book> bookInfo = new ArrayList<Book>();

		for (BookEntity bk : bookRecords) {
			Book book = new Book();
			/*
			 * book.setBookId(bk.getBookId()); book.setBookName(bk.getBookName());
			 * book.setAuthorName(bk.getAuthorName());
			 */
			BeanUtils.copyProperties(bk, book);
			bookInfo.add(book);
		}

		return bookInfo;
	}

}
