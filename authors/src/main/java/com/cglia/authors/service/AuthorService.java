package com.cglia.authors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.authors.dao.AuthorDao;
import com.cglia.authors.dto.Author;

@Service
public class AuthorService {
	@Autowired
	AuthorDao dao;

	public String saveAuthor(Author author) {
		return dao.saveAuthor(author);
	}

	public String deleteAuthor(int id) {
		return dao.deleteAuthor(id);
	}

	public Author getAuthorById(int id) {
		return dao.getById(id);
	}

	public List<Author> getAll() {
		return dao.getAllAuthor();
	}
}
