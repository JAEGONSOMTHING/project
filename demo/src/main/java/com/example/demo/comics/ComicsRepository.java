package com.example.demo.comics;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComicsRepository extends JpaRepository<Comics, Long> {
}
