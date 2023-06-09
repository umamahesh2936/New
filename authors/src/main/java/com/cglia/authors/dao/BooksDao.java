package com.cglia.authors.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Book;
import com.cglia.authors.repositoryconfiguration.BookRepository;

@Repository
public class BooksDao {
	@Autowired
	BookRepository repository;
	@Autowired
	AuthorDao dao;

	public Book save(Book book, int id) {
		if (dao.getById(id) != null) {
			book.setAuthor(dao.getById(id));
			repository.save(book);
			return book;
		}
		return null;
	}
	
}
