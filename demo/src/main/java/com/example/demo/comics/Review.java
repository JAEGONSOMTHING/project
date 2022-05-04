package com.example.demo.comics;

import com.example.demo.user.User;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.net.CookieHandler;
import java.time.LocalDateTime;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Comics comics;

    @ManyToOne
    private User user;

    private double star;

    @CreatedDate
    private LocalDateTime createdAt;


}
