package com.example.demo.comics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Comics {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String thumbNail;
    private String creator;


    private LocalDateTime createdAt;

}
