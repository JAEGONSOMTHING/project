package com.example.demo.comics.service;

import com.example.demo.comics.entity.Comics;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComicsService {

    public Page<Comics> showComics(){
        return null;
    }
}
