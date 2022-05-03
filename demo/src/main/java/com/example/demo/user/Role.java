package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    USER("ROLE_USER", "유저"), ADMIN("ROLE_ADMIN", "관리자");


    private final String key;
    private final String description;


}
