package com.example.demo.comics;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicsGenreRepository extends JpaRepository<ComicsGenre,Long> {

}
