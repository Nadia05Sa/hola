package com.superheros.ingrid.services;


import com.superheros.ingrid.entity.Tag;
import com.superheros.ingrid.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;

     public void getAllTags(){
        tagRepository.findAll();
        return;
     }

     public void getTagByName(String name){
         tagRepository.findByName(name);
     }

     public void saveTag(Tag tag){
         tagRepository.save(tag);
         return;
     }
}
