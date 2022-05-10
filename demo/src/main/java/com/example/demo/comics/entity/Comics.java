package com.example.demo.comics.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Entity
@ToString
@Getter
@NoArgsConstructor
public class Comics {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String thumbNail;
    private String creator;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Genre> genres= new HashSet<>();

    public Comics(String title, String thumbNail, String creator) {
        this.title = title;
        this.thumbNail = thumbNail;
        this.creator = creator;
    }

    public void addGenre(Genre genre){
        genres.add(genre);
    }


}
