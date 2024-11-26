package com.moviesapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviesapp.entities.Director;
import com.moviesapp.repository.DirectorRepository;

@Service
public class DirectorService {
	@Autowired
	DirectorRepository directorRepository;

	public List<Director> findAllDirectors() {
		return directorRepository.findAll();
	}
	
	public Optional<Director> findDirectorById(Long id) {
		return directorRepository.findById(id);
	}
}
