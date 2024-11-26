package com.moviesapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.moviesapp.services.DirectorService;
import com.moviesapp.entities.Director;

@RestController
public class DirectorController {
	private static final Logger logger = LoggerFactory.getLogger(DirectorController.class);

	@Autowired
	DirectorService directorService;

	@GetMapping("/directors")
	public List<Director> getDirectors() {
		logger.info("Request to http://localhost:3306/api/directors (GET)");
		return directorService.findAllDirectors();
	}

	@GetMapping("/directors/{id}")
	public Director getDirectorById(@PathVariable Long id) {
		logger.info("Request to get director with id " + id);

		Optional<Director> director = directorService.findDirectorById(id);
		if (director.isPresent()) {
			return director.get();
		} else {
			throw new RuntimeException("Director not found with id: " + id);
		}
	}

	@PostMapping("/directors/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Director addDirector(@RequestBody Director director) {
		logger.info("Adding director: " + director.getName());
		return directorService.addDirector(director);
	}
}
