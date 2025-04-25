package com.superheros.ingrid.controllers;


import com.superheros.ingrid.entity.Post;
import com.superheros.ingrid.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Integer id) {
        postService.getPostById(id);
        return null;
    }

    @PostMapping
    public void save(@RequestBody Post post) {
        postService.save(post);
    }

    @PutMapping
    public Post updatePost(@RequestParam Post post, @PathVariable Integer id) {
        postService.updatePost(id, post);
        return null;
    }
}
