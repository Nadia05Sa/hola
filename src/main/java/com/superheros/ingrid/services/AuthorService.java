package com.superheros.ingrid.services;

import com.superheros.ingrid.entity.Author;
import com.superheros.ingrid.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public void save(Author author) {
        authorRepository.save(author);
    }

    public void getAll(){
        authorRepository.findAll();
    }
}
