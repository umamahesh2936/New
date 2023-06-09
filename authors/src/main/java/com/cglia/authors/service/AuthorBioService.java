package com.cglia.authors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.authors.dao.AuthorBioDao;
import com.cglia.authors.dto.AuthorBio;

@Service
public class AuthorBioService {
	@Autowired
	AuthorBioDao bioDao;

	public AuthorBio saveAuthorBio(AuthorBio bio, Integer id) {
		return bioDao.saveAuthorBio(bio, id);
	}

	public AuthorBio getById(int id) {
		return bioDao.authorByBioId(id);
	}

	public String deleteBio(int id) {
		return bioDao.deleteAuthorBiobyId(id);
	}

	public AuthorBio updateBio(AuthorBio bio) {
		return bioDao.saveAuthorBio(bio, bio.getAuthor().getAuthorId());
	}
}
