package com.superheros.ingrid.controllers;


import com.superheros.ingrid.entity.Tag;
import com.superheros.ingrid.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping
    public List<Tag> getAllTags() {
        tagService.getAllTags();
        return null;
    }

    @GetMapping("/{name}")
    public Tag getTag(@PathVariable String name) {
        tagService.getTagByName(name);
        return null;
    }

    @PostMapping
    public void addTag(@RequestBody Tag tag) {
        tagService.saveTag(tag);
    }

}
