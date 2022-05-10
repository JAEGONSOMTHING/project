package com.example.demo.comics.Repository;

import com.example.demo.comics.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre,Long> {

    Optional<Genre> findGenreByGenreName(String genreName);

}
