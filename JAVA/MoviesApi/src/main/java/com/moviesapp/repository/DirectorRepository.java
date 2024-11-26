package com.moviesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviesapp.entities.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
