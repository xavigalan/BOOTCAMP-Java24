package com.moviesapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviesapp.entities.Movie;
import com.moviesapp.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
	}
	
	public Optional<Movie> findMovieById(Long id) {
		return movieRepository.findById(id);
	}
	
}
