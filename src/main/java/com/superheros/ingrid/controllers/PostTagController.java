package com.superheros.ingrid.controllers;


import com.superheros.ingrid.entity.PostTag;
import com.superheros.ingrid.services.PostTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/posttag")
public class PostTagController {
    @Autowired
    private PostTagService postTagService;


    @GetMapping("/tag/{id}")
    public PostTag getPostTag(@PathVariable Integer id, PostTag postTag) {
        postTagService.findByTag(id);
        return null;
    }

    @GetMapping("/post/{id}")
    public List<PostTag> findByPost(@PathVariable Integer id, PostTag postTag) {
        postTagService.findByTag(id);
        return null;
    }

    @PostMapping
    public void addPostTag(@RequestBody PostTag postTag) {
        postTagService.save(postTag);
    }
}
