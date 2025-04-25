package com.superheros.ingrid.controllers;


import com.superheros.ingrid.entity.Author;
import com.superheros.ingrid.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        authorService.getAll();
        return List.of();
    }

    @PostMapping
    public void save(@RequestBody Author author) {
        authorService.save(author);
    }

}
