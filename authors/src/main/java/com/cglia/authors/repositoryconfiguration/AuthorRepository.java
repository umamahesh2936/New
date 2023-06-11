package com.cglia.authors.repositoryconfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cglia.authors.dto.Author;

@EnableJpaRepositories
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	public Author findById(int id);
}
