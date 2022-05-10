package com.example.demo.comics.Repository;

import com.example.demo.comics.entity.Comics;
import com.example.demo.comics.entity.Genre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComicsRepository extends JpaRepository<Comics, Long> {



    @Query("select c from Comics c where exists (select g from c.genres g where g= :genre)")
    Page<Comics> findComicsByGenres(Genre genre, Pageable pageable);

}