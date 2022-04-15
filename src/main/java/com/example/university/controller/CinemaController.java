package com.example.university.controller;

import com.example.university.model.Movie;
import com.example.university.service.impl.CinemaImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/movie")
public class CinemaController {
    private final CinemaImpl cinema;

    @GetMapping
    public List<Movie> getMovieList() {
        return cinema.getMovieList();
    }


}
