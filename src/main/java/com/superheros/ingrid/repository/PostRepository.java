package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
