package com.superheros.ingrid.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class PostTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Tag tag;
    @ManyToOne
    private Post post;

}
