package com.cglia.authors.dao;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cglia.authors.dto.Book;
import com.cglia.authors.dto.Reader;
import com.cglia.authors.repositoryconfiguration.ReaderRepository;

@Repository
public class ReaderDao {
	@Autowired
	ReaderRepository readerRepository;
	@Autowired
	BooksDao booksDao;

//	public String addReader(Reader reader, int id) {
//		if (reader != null && booksDao.getById(id) != null) {
//			Set<Book> 
//			readerRepository.save(reader);
//			return "Reader Added Successfully";
//		}
//		return null;
//	}

}
