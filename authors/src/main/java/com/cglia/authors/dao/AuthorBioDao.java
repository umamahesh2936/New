package com.cglia.authors.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Author;
import com.cglia.authors.dto.AuthorBio;
import com.cglia.authors.repositoryconfiguration.AuthorBioRepository;
import com.cglia.authors.repositoryconfiguration.AuthorRepository;

@Repository
public class AuthorBioDao {
	@Autowired
	AuthorBioRepository repository;
	@Autowired
	AuthorDao dao;
	@Autowired
	AuthorRepository authorRepository;

	public String saveAuthorBio(AuthorBio bio, Integer id) {
		if (dao.getById(id) != null) {
			bio.setAuthor(dao.getById(id));
			repository.save(bio);
		}
		return "Bio saved Successfully";
	}

	public AuthorBio authorBioById(int id) {
		Optional<AuthorBio> optional = repository.findById(id);
		if (!optional.isEmpty()) {
			return optional.get();
		}
		return null;
	}

	public String deleteAuthorBiobyId(int id) {
		if (authorBioById(id) != null) {
			repository.deleteById(id);
			return "Successfully Deleted";
		}
		return "Data Not Found";
	}

	public Author getAuthorByBioId(int id) {
		Optional<AuthorBio> bio = repository.findById(id);
		Author author = dao.getById(bio.get().getAuthor().getAuthorId());
		return author;
	}
}
