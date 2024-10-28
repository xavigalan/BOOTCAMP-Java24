DROP SCHEMA IF EXISTS `galancine`;

CREATE SCHEMA IF NOT EXISTS `galancine` DEFAULT CHARACTER SET utf8;
USE `galancine`;

CREATE TABLE IF NOT EXISTS `movies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `year` INT NOT NULL,
  `image_url` VARCHAR(255),
  `certificate` VARCHAR(45),
  `runtime` INT NOT NULL,
  `imdb_rating` FLOAT,
  `metascore` INT,
  `votes` INT,
  `gross` INT,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `directors`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45),
  `about` TEXT,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `stars`(
  `stars_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45),
  `about` TEXT,
  PRIMARY KEY (`stars_id`),
  CONSTRAINT unique_star_name UNIQUE (`name`)  -- Añadido constraint para evitar duplicados
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `genres`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45),
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `movies_directors` (
  `movies_id` INT NOT NULL,
  `directors_id` INT NOT NULL,
  PRIMARY KEY (`movies_id`, `directors_id`),
  FOREIGN KEY (`movies_id`) REFERENCES `movies`(`id`) ON DELETE CASCADE,
  FOREIGN KEY (`directors_id`) REFERENCES `directors`(`id`) ON DELETE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `movies_stars` (
  `movies_id` INT NOT NULL,
  `stars_id` INT NOT NULL,
  PRIMARY KEY (`movies_id`, `stars_id`),
  FOREIGN KEY (`movies_id`) REFERENCES `movies`(`id`) ON DELETE CASCADE,
  FOREIGN KEY (`stars_id`) REFERENCES `stars`(`stars_id`) ON DELETE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `movies_genres` (
  `movies_id` INT NOT NULL,
  `genres_id` INT NOT NULL,
  PRIMARY KEY (`movies_id`, `genres_id`),
  FOREIGN KEY (`movies_id`) REFERENCES `movies`(`id`) ON DELETE CASCADE,
  FOREIGN KEY (`genres_id`) REFERENCES `genres`(`id`) ON DELETE CASCADE
) ENGINE = InnoDB;

INSERT INTO `movies` (`title`, `year`, `image_url`, `certificate`, `runtime`, `imdb_rating`, `metascore`, `votes`, `gross`) VALUES
('The Shawshank Redemption', 1994, 'https://image.url/shawshank.jpg', 'R', 142, 9.3, 80, 2300000, 28341469),
('The Godfather', 1972, 'https://image.url/godfather.jpg', 'R', 175, 9.2, 100, 1600000, 134966411),
('The Dark Knight', 2008, 'https://image.url/darkknight.jpg', 'PG-13', 152, 9.0, 84, 2500000, 534858444),
('Pulp Fiction', 1994, 'https://image.url/pulpfiction.jpg', 'R', 154, 8.9, 94, 1800000, 107928762);

INSERT INTO `directors` (`name`, `about`) VALUES
('Frank Darabont', 'Director of acclaimed films such as The Shawshank Redemption and The Green Mile.'),
('Francis Ford Coppola', 'Famous for directing The Godfather trilogy and Apocalypse Now.'),
('Christopher Nolan', 'Known for directing The Dark Knight trilogy, Inception, and Interstellar.'),
('Quentin Tarantino', 'Known for unique, stylized films like Pulp Fiction and Kill Bill.');

INSERT INTO `stars` (`name`, `about`) VALUES
('Tim Robbins', 'American actor known for The Shawshank Redemption.'),
('Morgan Freeman', 'Veteran actor known for roles in The Shawshank Redemption and Million Dollar Baby.'),
('Marlon Brando', 'Legendary actor known for The Godfather and On the Waterfront.'),
('Al Pacino', 'Known for roles in The Godfather, Scarface, and many more.'),
('Christian Bale', 'Known for roles in The Dark Knight and American Psycho.'),
('Heath Ledger', 'Known for his role as The Joker in The Dark Knight.'),
('John Travolta', 'Known for Saturday Night Fever and Pulp Fiction.'),
('Samuel L. Jackson', 'Known for Pulp Fiction, Snakes on a Plane, and many Marvel films.');

INSERT INTO `genres` (`name`) VALUES
('Drama'),
('Crime'),
('Action'),
('Thriller');

INSERT INTO `movies_directors` (`movies_id`, `directors_id`) VALUES
(1, 1),  -- The Shawshank Redemption directed by Frank Darabont
(2, 2),  -- The Godfather directed by Francis Ford Coppola
(3, 3),  -- The Dark Knight directed by Christopher Nolan
(4, 4);  -- Pulp Fiction directed by Quentin Tarantino

INSERT INTO `movies_stars` (`movies_id`, `stars_id`) VALUES
(1, 1),  -- Tim Robbins in The Shawshank Redemption
(1, 2),  -- Morgan Freeman in The Shawshank Redemption
(2, 3),  -- Marlon Brando in The Godfather
(2, 4),  -- Al Pacino in The Godfather
(3, 5),  -- Christian Bale in The Dark Knight
(3, 6),  -- Heath Ledger in The Dark Knight
(4, 7),  -- John Travolta in Pulp Fiction
(4, 8);  -- Samuel L. Jackson in Pulp Fiction

INSERT INTO `movies_genres` (`movies_id`, `genres_id`) VALUES
(1, 1),  -- The Shawshank Redemption is a Drama
(2, 1),  -- The Godfather is a Drama
(2, 2),  -- The Godfather is a Crime film
(3, 3),  -- The Dark Knight is an Action film
(3, 4),  -- The Dark Knight is a Thriller
(4, 1),  -- Pulp Fiction is a Drama
(4, 2);  -- Pulp Fiction is a Crime film

/*
DELETE FROM `movies_stars`;
DELETE FROM `movies_directors`;
DELETE FROM `movies_genres`;
DELETE FROM `stars`;
DELETE FROM `directors`;
DELETE FROM `movies`;
DELETE FROM `genres`;
*/ 