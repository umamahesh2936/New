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
import com.cglia.authors.dto.Book;
import com.cglia.authors.dto.Reader;
import com.cglia.authors.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {
	@Autowired
	BooksService booksService;

	@PostMapping("/book/{id}")
	public String saveBook(@RequestBody Book book, @PathVariable int id) {
		return booksService.saveBooks(book, id);
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		return booksService.deleteBook(id);
	}

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return booksService.getBookById(id);
	}

	@GetMapping("/book")
	public List<Book> getAllBooks() {
		return booksService.getAllBooks();
	}

	@GetMapping("/book/author/{id}")
	public Author getAuthorByBookId(@PathVariable int id) {
		return booksService.getAuthorByBookId(id);
	}

	@GetMapping("/book/readers/{id}")
	public List<Reader> getAllReadersByBookId(@PathVariable int id) {
		return booksService.getAllReadersByBookId(id);

	}
}
