package com.superheros.ingrid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String date;
    @OneToOne(cascade = CascadeType.ALL)
    private Author author;

}
