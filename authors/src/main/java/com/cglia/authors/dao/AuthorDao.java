package com.cglia.authors.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Author;
import com.cglia.authors.dto.AuthorBio;
import com.cglia.authors.repositoryconfiguration.AuthorBioRepository;
import com.cglia.authors.repositoryconfiguration.AuthorRepository;
import com.cglia.authors.repositoryconfiguration.BookRepository;

@Repository
public class AuthorDao {
	@Autowired
	AuthorRepository repository;
	@Autowired
	BookRepository repository2;
	@Autowired
	AuthorBioRepository bioRepository;

	public String saveAuthor(Author author) {
		AuthorBio authorBio = author.getAuthorBios();

		if (author != null) {
			if (authorBio != null) {
				authorBio.setAuthor(author);
				bioRepository.save(authorBio);
			}
			repository.save(author);
			return "Data saved Successfully";
		}
		return null;
	}

	public String deleteAuthor(int id) {
		Author author = repository.findById(id);
		if (author != null) {
			repository.delete(author);
			return "Deleted Successfully";
		}
		return null;
	}

	public Author getById(int id) {
		Author author = repository.findById(id);
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
