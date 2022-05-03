package com.example.demo.user;

import lombok.Getter;

@Getter
public enum OAuth2Provider {

    GOOGLE("google"), KAKAO("kakao");
    private String provider;

    OAuth2Provider(String provider) {
        this.provider = provider;
    }
}
