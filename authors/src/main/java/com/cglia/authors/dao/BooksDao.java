package com.cglia.authors.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Author;
import com.cglia.authors.dto.Book;
import com.cglia.authors.dto.Reader;
import com.cglia.authors.repositoryconfiguration.BookRepository;

@Repository
public class BooksDao {
	@Autowired
	BookRepository repository;
	@Autowired
	AuthorDao dao;

	public String save(Book book, int id) {
		if (dao.getById(id) != null) {
			book.setAuthor(dao.getById(id));
			repository.save(book);
			return "Book Saved Successfully";
		}
		return null;
	}

	public String deleteBook(int id) {
		if (repository.getById(id) != null) {
			repository.deleteById(id);
			return "Deleted Successfully";
		}
		return null;
	}

	public Book getById(int id) {
		return repository.getById(id);
	}

	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	public Author getAuthorByBookId(int id) {
		Author author = dao.getById(getById(id).getAuthor().getAuthorId());

		if (author instanceof Author) {
			return author;
		}
		return null;
	}

	public List<Reader> getAllReadersByBookId(int id) {
		Book book = repository.findById(id).get();
		List<Reader> list = new ArrayList(book.getReader());
		return list;
	}

}
