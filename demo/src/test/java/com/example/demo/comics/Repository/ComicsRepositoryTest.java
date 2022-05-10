package com.example.demo.comics.Repository;

import com.example.demo.comics.entity.Comics;
import com.example.demo.comics.entity.Genre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ComicsRepositoryTest {
    @Autowired
    ComicsRepository comicsRepository;
    @Autowired
    GenreRepository genreRepository;

    @BeforeEach
    @Transactional
    void init(){
        Comics comics1 = new Comics("comics1", "picure1", "jaegon");
        Comics comics2 = new Comics("comics2", "picure2", "jaegon");
        Comics comics3 = new Comics("comics3", "picure3", "jaegon");
        Comics comics4 = new Comics("comics4", "picure4", "jaegon");
        Comics comics5 = new Comics("comics5", "picure5", "jaegon");

        comicsRepository.save(comics1);
        comicsRepository.save(comics2);
        comicsRepository.save(comics3);
        comicsRepository.save(comics4);
        comicsRepository.save(comics5);

        Genre genre1 = new Genre("love");
        Genre genre2 = new Genre("sports");
        Genre genre3 = new Genre("fight");
        genreRepository.save(genre1);
        genreRepository.save(genre2);
        genreRepository.save(genre3);

        comics1.addGenre(genre1);
        comics2.addGenre(genre2);
        comics3.addGenre(genre3);
        comics4.addGenre(genre1);
        comics5.addGenre(genre2);

    }
    @Test
    @Transactional
    @DisplayName("장르별 만화 조회 테스트")
    void findComicsByGenreTest(){
        Genre love = genreRepository.findGenreByGenreName("love").get();
        Genre sports = genreRepository.findGenreByGenreName("sports").get();
        Genre fight = genreRepository.findGenreByGenreName("fight").get();

        PageRequest pageRequest = PageRequest.of(0, 10);
        Page<Comics> loveComics = comicsRepository.findComicsByGenres(love, pageRequest);
        Page<Comics> sportsComics = comicsRepository.findComicsByGenres(sports, pageRequest);
        Page<Comics> fightComics = comicsRepository.findComicsByGenres(fight, pageRequest);
        assertTrue(loveComics.stream().filter( comics -> comics.getGenres().contains(love)).count()== loveComics.stream().count());
        assertTrue(sportsComics.stream().filter( comics -> comics.getGenres().contains(sports)).count()== sportsComics.stream().count());
        assertTrue(fightComics.stream().filter( comics -> comics.getGenres().contains(fight)).count()== fightComics.stream().count());
    }


}