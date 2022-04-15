package com.example.university.repository;

import com.example.university.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findAll();

}
