package com.moviesapp.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviesapp.entities.Movie;
import com.moviesapp.services.MovieService;

@RestController
public class MovieController {
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	MovieService movieService;

	@GetMapping("/movies")
	public List<Movie> getMovies() {
		logger.info("Request to http://localhost:3306/api/movies (GET)");
		return movieService.findAllMovies();
	}
}
