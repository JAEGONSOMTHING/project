package com.example.demo.comics;

import com.example.demo.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.net.CookieHandler;

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

}
