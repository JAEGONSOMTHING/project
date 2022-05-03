package com.example.demo.comics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ComicsGenre {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Comics comics;

    @ManyToOne
    private Genre genre;
}
