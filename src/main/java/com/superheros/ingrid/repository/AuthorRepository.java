package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
