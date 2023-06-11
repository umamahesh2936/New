package com.cglia.authors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.authors.dao.BooksDao;
import com.cglia.authors.dto.Author;
import com.cglia.authors.dto.Book;
import com.cglia.authors.dto.Reader;

@Service
public class BooksService {
	@Autowired
	BooksDao booksDao;

	public String saveBooks(Book book, int id) {
		return booksDao.save(book, id);
	}

	public String deleteBook(int id) {
		return booksDao.deleteBook(id);
	}

	public Book getBookById(int id) {
		return booksDao.getById(id);
	}

	public List<Book> getAllBooks() {
		return booksDao.getAllBooks();
	}

	public Author getAuthorByBookId(int id) {
		return booksDao.getAuthorByBookId(id);
	}

	public List<Reader> getAllReadersByBookId(int id) {
		return booksDao.getAllReadersByBookId(id);
	}
}
