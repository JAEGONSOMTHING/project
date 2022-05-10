package com.example.demo.comics.entity;

import com.example.demo.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    private Comics comics;

    @ManyToOne
    private User user;

    private double star;

    @CreatedDate
    private LocalDateTime createdAt;

    @Builder
    public Review(String content, Comics comics, User user, double star) {
        this.content = content;
        this.comics = comics;
        this.user = user;
        this.star = star;
    }

    @AllArgsConstructor
    @Getter
    public static class ReviewDto {
        private String content;
        private double star;

    }
}
