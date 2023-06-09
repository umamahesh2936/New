package com.cglia.authors.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Author;
import com.cglia.authors.repositoryconfiguration.AuthorRepository;
import com.cglia.authors.repositoryconfiguration.BookRepository;

@Repository
public class AuthorDao {
	@Autowired
	AuthorRepository repository;
	@Autowired
	BookRepository repository2;

	public Author saveAuthor(Author author) {
		if (author != null) {
			repository.save(author);
			if (!author.getBooks().isEmpty()) {
				repository2.saveAll(author.getBooks());
			}
			return author;
		}
		return null;
	}

	public String deleteAuthor(int id) {
		Optional<Author> author = repository.findById(id);
		if (author.get() != null) {
			repository.delete(author.get());
			return "Deleted Successfully";
		}
		return null;
	}

	public Author getById(int id) {
		Author author = repository.getById(id);
		if (author != null) {
			return author;
		}
		return author;
	}

	public String delete(int id) {
		if (getById(id) != null) {
			repository.deleteById(id);
			return "Deleted Successfully";
		}
		return null;
	}

	public List<Author> getAllAuthor() {
		return repository.findAll();
	}
}
