package com.moviesapp.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "MOVIES")
@Data
public class Movie implements Serializable {
	private static final long serialVersionUID = 8008354054223876383L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private Integer year;

	private String imageUrl;

	private String certificate;

	private Integer runtime;

	private Float imdbRating;

	private String description;
}
