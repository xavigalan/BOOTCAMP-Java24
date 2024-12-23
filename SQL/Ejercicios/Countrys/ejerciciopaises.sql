-- MySQL Script generated by MySQL Workbench
-- Tue Oct 22 12:32:28 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ejerciciopaises` DEFAULT CHARACTER SET utf8 ;
USE `ejerciciopaises` ;

-- -----------------------------------------------------
-- Table `mydb`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejerciciopaises`.`country` (
  `country_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(50) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`country_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejerciciopaises`.`city` (
  `city_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(50) NULL,
  `last_update` TIMESTAMP NULL,
  `country_id` SMALLINT NOT NULL,
  PRIMARY KEY (`city_id`),
  INDEX `fk_city_country1_idx` (`country_id` ASC) VISIBLE,
  CONSTRAINT `fk_city_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `ejerciciopaises`.`country` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejerciciopaises`.`address` (
  `idaddress_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(50) NULL,
  `address2` VARCHAR(50) NULL,
  `district` VARCHAR(20) NULL,
  `postal_code` VARCHAR(20) NULL,
  `location` VARCHAR(20) NULL,
  `last_update` TIMESTAMP NULL,
  `city_id` SMALLINT NOT NULL,
  PRIMARY KEY (`idaddress_id`),
  INDEX `fk_address_city1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_address_city1`
    FOREIGN KEY (`city_id`)
    REFERENCES `ejerciciopaises`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
USE ejerciciopaises;
SELECT * FROM address;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `ejerciciopaises`.`country` (country, last_update) VALUES
('United States', NOW()),
('Canada', NOW()),
('Mexico', NOW()),
('Germany', NOW()),
('France', NOW()),
('Spain', NOW()),
('Italy', NOW()),
('United Kingdom', NOW()),
('Australia', NOW()),
('Japan', NOW()),
('China', NOW()),
('Brazil', NOW()),
('India', NOW()),
('South Africa', NOW()),
('Argentina', NOW()),
('Russia', NOW()),
('Netherlands', NOW()),
('Sweden', NOW()),
('Norway', NOW()),
('Finland', NOW());

INSERT INTO `ejerciciopaises`.`city` (city, last_update, country_id) VALUES
('New York', NOW(), 1),
('Toronto', NOW(), 2),
('Mexico City', NOW(), 3),
('Berlin', NOW(), 4),
('Paris', NOW(), 5),
('Madrid', NOW(), 6),
('Rome', NOW(), 7),
('London', NOW(), 8),
('Sydney', NOW(), 9),
('Tokyo', NOW(), 10),
('Beijing', NOW(), 11),
('São Paulo', NOW(), 12),
('Mumbai', NOW(), 13),
('Cape Town', NOW(), 14),
('Buenos Aires', NOW(), 15),
('Moscow', NOW(), 16),
('Amsterdam', NOW(), 17),
('Stockholm', NOW(), 18),
('Oslo', NOW(), 19),
('Helsinki', NOW(), 20);

INSERT INTO `ejerciciopaises`.`address` (address, address2, district, postal_code, location, last_update, city_id) VALUES
('123 Main St', NULL, 'Manhattan', '10001', 'Loc1', NOW(), 1),
('456 Queen St', NULL, 'Downtown', 'M5H 2N2', 'Loc2', NOW(), 2),
('789 Reforma Ave', NULL, 'Polanco', '11560', 'Loc3', NOW(), 3),
('321 Unter den Linden', NULL, 'Mitte', '10117', 'Loc4', NOW(), 4),
('654 Rue de Rivoli', NULL, '1st Arr.', '75001', 'Loc5', NOW(), 5),
('987 Gran Via', NULL, 'Centro', '28013', 'Loc6', NOW(), 6),
('159 Via del Corso', NULL, 'Centro Storico', '00186', 'Loc7', NOW(), 7),
('753 Oxford St', NULL, 'Westminster', 'W1D 1BS', 'Loc8', NOW(), 8),
('852 George St', 'Level 5', 'Sydney CBD', '2000', 'Loc9', NOW(), 9),
('951 Shinjuku', NULL, 'Shinjuku', '160-0022', 'Loc10', NOW(), 10),
('852 Tiananmen Square', NULL, 'Dongcheng', '100000', 'Loc11', NOW(), 11),
('741 Av. Paulista', NULL, 'Bela Vista', '01311-000', 'Loc12', NOW(), 12),
('369 Marine Drive', NULL, 'Marine Lines', '400020', 'Loc13', NOW(), 13),
('159 V&A Waterfront', NULL, 'Waterfront', '8002', 'Loc14', NOW(), 14),
('258 Av. 9 de Julio', NULL, 'Microcentro', '1043', 'Loc15', NOW(), 15),
('753 Red Square', NULL, 'Moscow Center', '101000', 'Loc16', NOW(), 16),
('864 Damrak', NULL, 'Amsterdam Center', '1012 JS', 'Loc17', NOW(), 17),
('456 Drottninggatan', NULL, 'Norrmalm', '111 51', 'Loc18', NOW(), 18),
('369 Karl Johans gate', NULL, 'Oslo City', '0154', 'Loc19', NOW(), 19),
('753 Mannerheimintie', NULL, 'Helsinki City', '00100', 'Loc20', NOW(), 20);

SELECT 
	a.address AS Dirrección,
	a.district AS Districto,
	a.postal_code AS Codigo_Postal,
	c.city AS Ciudad,
	co.country AS País
FROM 
	`ejerciciopaises`.`address` a
INNER JOIN 
    `ejerciciopaises`.`city` c ON a.city_id = c.city_id
INNER JOIN 
	`ejerciciopaises`.`country` co ON c.country_id = co.country_id;