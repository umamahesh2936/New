package com.cglia.authors.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.authors.dto.Author;
import com.cglia.authors.dto.AuthorBio;
import com.cglia.authors.service.AuthorBioService;

@RestController
@RequestMapping("/bio")
public class AuthorBioConroller {

	@Autowired
	public AuthorBioService service;

	@PostMapping("/biography/{id}")
	public String authorBioSave(@RequestBody AuthorBio authorBio, @PathVariable Integer id) {
		return service.saveAuthorBio(authorBio, id);
	}

	@GetMapping("/biography/{id}")
	public AuthorBio getAuthorByBioId(@PathVariable int id) {
		return service.getById(id);
	}

	@PutMapping("/biography")
	public String updateAuhtorBio(@RequestBody AuthorBio bio) {
		return service.updateBio(bio);
	}

	@GetMapping("/biography/author/{id}")
	public Author authorByBioId(@PathVariable int id) {
		return service.getAuthorByBioId(id);
	}
}
