package com.example.demo.comics.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue
    private Long id;

    private String genreName;

    public Genre(String genreName) {
        this.genreName = genreName;
    }

}
