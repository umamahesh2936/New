package com.cglia.authors.repositoryconfiguration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cglia.authors.dto.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Integer> {

}
