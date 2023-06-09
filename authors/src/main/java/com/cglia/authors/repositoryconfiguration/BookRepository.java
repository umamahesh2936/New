package com.cglia.authors.repositoryconfiguration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cglia.authors.dto.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
