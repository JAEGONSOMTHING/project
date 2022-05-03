package com.example.demo.comics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    @GeneratedValue
    private Long id;

    private String genreName;

}
