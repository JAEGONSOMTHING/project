package com.example.demo.comics.Repository;

import com.example.demo.comics.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
