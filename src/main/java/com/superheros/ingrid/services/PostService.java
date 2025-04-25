package com.superheros.ingrid.services;


import com.superheros.ingrid.entity.Post;
import com.superheros.ingrid.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void save(Post post){
        postRepository.save(post);
    }

    public void getAllPosts(){
        postRepository.findAll();
        return;
    }
    public void getPostById(Integer id){
        postRepository.findById(id);
        return;
    }

    public void updatePost(Integer id, Post post){
        postRepository.save(post);
    }

}
