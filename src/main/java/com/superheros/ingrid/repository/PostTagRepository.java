package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Post;
import com.superheros.ingrid.entity.PostTag;
import com.superheros.ingrid.entity.Tag;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface PostTagRepository extends CrudRepository<PostTag, Integer> {
    public List<PostTag> findByTag(Tag tag);
    public List<PostTag> findByPost(Post post);
}
