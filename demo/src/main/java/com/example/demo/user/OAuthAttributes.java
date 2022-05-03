package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


import java.util.EnumSet;
import java.util.Map;

@Getter
@AllArgsConstructor
@Builder
public class OAuthAttributes {

    private String name;
    private String email;
    private String picture;


    public static OAuthAttributes of(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equals(OAuth2Provider.KAKAO.getProvider())) {
            return ofKaKao(attributes);
        }
        else{
            return ofGoogle(attributes);
        }

    }

    private static OAuthAttributes ofKaKao(Map<String, Object> attributes) {
        Map<String,Object> att = (Map<String, Object>) attributes.get("kakao_account");
        Map<String,Object> profile = (Map<String, Object>) att.get("profile");


        return OAuthAttributes.builder()
                .name((String) profile.get("nickname"))
                .email((String) att.get("email"))
                .picture((String) profile.get("thumbnail_image_url"))
                .build();
    }

    private static OAuthAttributes ofGoogle( Map<String, Object> attributes) {
        return OAuthAttributes.builder()
                .name((String) attributes.get("name"))
                .email((String) attributes.get("email"))
                .picture((String) attributes.get("picture"))
                .build();
    }


    public User toEntity() {
        return User.builder()
                .name(name)
                .email(email)
                .picture(picture)
                .role(Role.USER)
                .build();
    }
}
