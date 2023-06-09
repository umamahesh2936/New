package com.cglia.authors.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.AuthorBio;
import com.cglia.authors.repositoryconfiguration.AuthorBioRepository;

@Repository
public class AuthorBioDao {
	@Autowired
	AuthorBioRepository repository;
	@Autowired
	AuthorDao dao;

	public AuthorBio saveAuthorBio(AuthorBio bio, Integer id) {
		if (dao.getById(id) != null) {
			bio.setAuthor(dao.getById(id));
			repository.save(bio);
		}
		return bio;
	}

	public AuthorBio authorByBioId(int id) {
		Optional<AuthorBio> optional = repository.findById(id);
		if (!optional.isEmpty()) {
			return optional.get();
		}
		return null;
	}

	public String deleteAuthorBiobyId(int id) {
		if (authorByBioId(id) != null) {
			repository.deleteById(id);
			return "Successfully Deleted";
		}
		return "Data Not Found";
	}
}
