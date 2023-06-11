package com.cglia.authors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.authors.dto.Reader;
import com.cglia.authors.service.ReaderService;

@RestController
@RequestMapping("/read")
public class ReaderController {
	@Autowired
	ReaderService readerService;

//	@PostMapping("/reader/{id}")
//	public String addReader(@RequestBody Reader reader, @PathVariable int id) {
//		return readerService.addReader(reader, id);
//
//	}
}
