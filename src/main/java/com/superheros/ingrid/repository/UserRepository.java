package com.superheros.ingrid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superheros.ingrid.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public Optional<UserEntity> findByUsername(String username);
}
