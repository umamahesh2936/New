package com.cglia.authors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.authors.dao.ReaderDao;
import com.cglia.authors.dto.Reader;

@Service
public class ReaderService {
	@Autowired
	ReaderDao dao;

//	public String addReader(Reader reader, int id) {
//		return dao.addReader(reader, id);
//	}
}
