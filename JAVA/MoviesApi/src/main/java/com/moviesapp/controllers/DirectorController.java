package com.moviesapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  

import com.moviesapp.services.DirectorService;
import com.moviesapp.entities.Director;

@RestController(value = "/directors")
public class DirectorController {
    private static final Logger logger = LoggerFactory.getLogger(DirectorController.class); 

    @Autowired
    DirectorService directorService;

    @GetMapping("/directors")
    public List<Director> getDirectors() {
        logger.info("Request to http://localhost:3306/api/directors (GET)");
        return directorService.findAllDirectors();
    
    @GetMapping("/directors/{id}")
    public Director getDirectorsById(@PathVariable Long id) {
    	if (director)
    }
    }
}
