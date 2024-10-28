-- MySQL Script to create database for students, courses, and professors
-- Create the database
CREATE SCHEMA IF NOT EXISTS `escuela` DEFAULT CHARACTER
SET
  utf8;

USE `escuela`;

-- -----------------------------------------------------
-- Table for storing students
-- -----------------------------------------------------
CREATE TABLE
  IF NOT EXISTS `estudiantes` (
    `estudiante_id` INT NOT NULL AUTO_INCREMENT,
    `nombre_estudiante` VARCHAR(45) NOT NULL,
    `primer_apellido` VARCHAR(45) NOT NULL,
    `segundo_apellido` VARCHAR(45),
    PRIMARY KEY (`estudiante_id`)
  ) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table for storing professors
-- -----------------------------------------------------
CREATE TABLE
  IF NOT EXISTS `profesores` (
    `profesor_id` INT NOT NULL AUTO_INCREMENT,
    `nombre_profesor` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`profesor_id`)
  ) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table for storing courses
-- -----------------------------------------------------
CREATE TABLE
  IF NOT EXISTS `cursos` (
    `curso_id` INT NOT NULL AUTO_INCREMENT,
    `nombre_curso` VARCHAR(45) NOT NULL,
    `profesor_id` INT NOT NULL,
    PRIMARY KEY (`curso_id`),
    CONSTRAINT `fk_cursos_profesores` FOREIGN KEY (`profesor_id`) REFERENCES `profesores` (`profesor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  ) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table for storing the relationship between students and courses
-- This table also stores the grade for each course
-- -----------------------------------------------------
CREATE TABLE
  IF NOT EXISTS `estudiantes_cursos` (
    `estudiante_id` INT NOT NULL,
    `curso_id` INT NOT NULL,
    `nota` DECIMAL(5, 2) NULL,
    PRIMARY KEY (`estudiante_id`, `curso_id`),
    CONSTRAINT `fk_estudiantes_cursos_estudiantes` FOREIGN KEY (`estudiante_id`) REFERENCES `estudiantes` (`estudiante_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT `fk_estudiantes_cursos_cursos` FOREIGN KEY (`curso_id`) REFERENCES `cursos` (`curso_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
  ) ENGINE = InnoDB;

INSERT INTO
  `profesores` (nombre_profesor)
VALUES
  ('Luis Fernández'),
  ('Clara Ruiz'),
  ('Sofia Martinez'),
  ('Jorge Garcia');

INSERT INTO
  `estudiantes` (
    nombre_estudiante,
    primer_apellido,
    segundo_apellido
  )
VALUES
  ('Andrés', 'Martinez', 'Soto'),
  ('Laura', 'García', 'Pérez'),
  ('Ricardo', 'López', 'Salazar'),
  ('Isabel', 'Torres', 'Cruz'),
  ('Samuel', 'Reyes', 'Mendoza');

INSERT INTO
  `cursos` (nombre_curso, profesor_id)
VALUES
  ('Física', 1),
  ('Química', 1),
  ('Literatura', 2),
  ('Geografía', 3),
  ('Biología', 4),
  ('Arte', 4);

INSERT INTO
  `estudiantes_cursos` (estudiante_id, curso_id, nota)
VALUES
  (1, 3, 9.5),
  (1, 4, 7.8),
  (2, 1, 8.0),
  (2, 5, 9.2),
  (3, 2, 6.5),
  (3, 6, 7.3),
  (4, 1, 8.7),
  (4, 3, 9.0),
  (5, 5, 8.8),
  (5, 6, 9.1);

-- Los alumnos que son enseñados por el profe_id 4 en este caso
USE escuela;

SELECT
  e.estudiante_id,
  e.nombre_estudiante,
  e.primer_apellido,
  e.segundo_apellido
FROM
  escuela.estudiantes AS e
  JOIN escuela.estudiantes_cursos AS ehc ON e.estudiante_id = ehc.estudiante_id
  JOIN escuela.cursos AS c ON ehc.curso_id = c.curso_id
WHERE
  c.profesor_id = 4;

-- Cursos totales de un profesor
SELECT
  p.profesor_id,
  p.nombre_profesor AS Profesor,
  COUNT(c.curso_id) AS TOTAL_CURSOS
FROM
  escuela.profesores AS p
  LEFT JOIN escuela.cursos AS c ON p.profesor_id = c.profesor_id
GROUP BY
  p.profesor_id,
  p.nombre_profesor;

-- Cursos totales de un estudiante
SELECT
  e.estudiante_id,
  e.nombre_estudiante AS Nombre,
  e.primer_apellido AS Apellido,
  COUNT(ec.curso_id) AS TOTAL_CURSOS
FROM
  escuela.estudiantes AS e
  LEFT JOIN escuela.estudiantes_cursos AS ec ON e.estudiante_id = ec.estudiante_id
GROUP BY
  e.estudiante_id,
  e.nombre_estudiante,
  e.primer_apellido;

USE escuela;

START TRANSACTION;

UPDATE estudiantes_cursos
SET
  nota = 6.0
WHERE
  estudiante_id = 1
  AND curso_id = 3;

ROLLBACK;

SELECT
  *
FROM
  estudiantes_cursos
WHERE
  estudiante_id = 1
  AND curso_id = 3;