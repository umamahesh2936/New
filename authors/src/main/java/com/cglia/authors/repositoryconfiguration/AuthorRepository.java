package com.cglia.authors.repositoryconfiguration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cglia.authors.dto.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
