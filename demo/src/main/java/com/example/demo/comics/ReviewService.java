package com.example.demo.comics;

import org.springframework.http.ResponseEntity;

public interface ReviewService {

    public ResponseEntity createReview();

    public ResponseEntity editReview();

    public ResponseEntity deleteReview();

    public ResponseEntity showSpecificReviews();

}
