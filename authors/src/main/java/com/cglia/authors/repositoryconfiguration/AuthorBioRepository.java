package com.cglia.authors.repositoryconfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cglia.authors.dto.AuthorBio;

@EnableJpaRepositories
public interface AuthorBioRepository extends JpaRepository<AuthorBio, Integer> {
}
