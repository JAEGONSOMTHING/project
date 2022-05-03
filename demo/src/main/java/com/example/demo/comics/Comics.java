package com.example.demo.comics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comics {
    @Id
    @GeneratedValue
    private Long id;

    private String title;


}
