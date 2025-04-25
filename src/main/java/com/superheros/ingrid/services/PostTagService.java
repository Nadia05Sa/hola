package com.superheros.ingrid.services;


import com.superheros.ingrid.entity.Post;
import com.superheros.ingrid.entity.PostTag;
import com.superheros.ingrid.repository.PostTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostTagService {
    @Autowired
    private PostTagRepository postTagRepository;

    public void save(PostTag postTag) {
        postTagRepository.save(postTag);
    }

    public List<PostTag> findByTag(Integer tag) {
        return null;
    }
    public List<PostTag> findByPost(Post post) {
        return null;
    }
}
