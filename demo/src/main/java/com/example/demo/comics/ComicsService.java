package com.example.demo.comics;

import org.springframework.http.ResponseEntity;

public interface ComicsService {

    ResponseEntity showComicsByGenre();
    ResponseEntity showAllComics();

}
