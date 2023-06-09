package com.cglia.authors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.authors.dto.Author;
import com.cglia.authors.service.AuthorService;

@RequestMapping("/api")
@RestController
public class AuthorController {
	@Autowired
	private AuthorService service;

	@PostMapping("/author")
	public Author saveAuthor(@RequestBody Author author) {
		Author author2 = service.saveAuthor(author);
		if (author2 != null) {
			return author2;
		}
		return null;
	}

	@GetMapping("/get")
	public String get() {
		return "Welcome";
	}

	@DeleteMapping("/author")
	public String delete(int id) {
		return service.deleteAuthor(id);
	}

	@GetMapping("/author/{id}")
	public Author getAuthorById(@PathVariable int id) {
		return service.getAuthorById(id);
	}

	@GetMapping("/author")
	public List<Author> getAllAuthor() {
		return service.getAll();
	}
}
