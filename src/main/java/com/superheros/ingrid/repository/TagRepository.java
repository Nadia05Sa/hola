package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Tag;
import com.superheros.ingrid.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TagRepository extends CrudRepository<Tag, Integer> {
    public Optional<Tag> findByName(String name);

}
