-- Adminer 4.8.4 MySQL 9.1.0 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

CREATE DATABASE `bddappmusculation`;
USE `bddappmusculation`;

DROP TABLE IF EXISTS `contenueprogramme`;
CREATE TABLE `contenueprogramme` (
  `idProgramme` int NOT NULL,
  `idSeance` int NOT NULL,
  PRIMARY KEY (`idProgramme`,`idSeance`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

INSERT INTO `contenueprogramme` (`idProgramme`, `idSeance`) VALUES
(1,	1),
(2,	2),
(3,	4),
(4,	3);

DROP TABLE IF EXISTS `contenueseance`;
CREATE TABLE `contenueseance` (
  `idSeance` int NOT NULL,
  `idExercice` int NOT NULL,
  `nbrSerie` int NOT NULL,
  `nbrRepetition` int NOT NULL,
  PRIMARY KEY (`idSeance`,`idExercice`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

INSERT INTO `contenueseance` (`idSeance`, `idExercice`, `nbrSerie`, `nbrRepetition`) VALUES
(1,	1,	3,	8),
(1,	2,	3,	6),
(2,	2,	4,	10),
(2,	5,	3,	12),
(3,	1,	4,	10),
(3,	4,	3,	12),
(4,	3,	3,	15),
(4,	5,	3,	15);

DROP TABLE IF EXISTS `exercice`;
CREATE TABLE `exercice` (
  `idExercice` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `muscleSolicite` varchar(150) CHARACTER SET utf8mb4 NOT NULL,
  `detail` varchar(150) NOT NULL,
  PRIMARY KEY (`idExercice`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 ;

INSERT INTO `exercice` (`idExercice`, `nom`, `muscleSolicite`, `detail`) VALUES
(1,	'Squat	',	'Quadriceps, fessiers, ischio-jambiers',	'Descendre les hanches comme pour s\'asseoir'),
(2,	'Développé couché',	'Pectoraux, triceps, épaules',	'Allongé sur le dos, pousser la barre vers le haut'),
(3,	'Tirage dos',	'Dorsaux, biceps',	'Tirer une barre vers la poitrine'),
(4,	'Fentes alternées',	'Quadriceps, fessiers, ischio-jambiers',	'Faire un grand pas en avant et fléchir les genoux'),
(5,	'Élévation latérale',	'Épaules latérales',	'Lever les bras sur les côtés');

DROP TABLE IF EXISTS `programme`;
CREATE TABLE `programme` (
  `idProgramme` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `detail` varchar(50) NOT NULL,
  PRIMARY KEY (`idProgramme`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

INSERT INTO `programme` (`idProgramme`, `nom`, `detail`) VALUES
(1,	'Force générale',	'Programme axé sur l\'augmentation de la force'),
(2,	'Hypertrophie musculaire	',	'Programme axé sur la prise de masse musculaire'),
(3,	'Perte de poids',	'Programme combinant cardio et musculation'),
(4,	'Entraînement jambes',	'Programme ciblant principalement les membres infér');

DROP TABLE IF EXISTS `seance`;
CREATE TABLE `seance` (
  `idSeance` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `detail` varchar(150) NOT NULL,
  PRIMARY KEY (`idSeance`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

INSERT INTO `seance` (`idSeance`, `nom`, `detail`) VALUES
(1,	'Séance Force 1',	'Première séance du programme de force'),
(2,	'Séance Pectoraux/Triceps',	'Séance axée sur les pectoraux et les triceps'),
(3,	'Séance Jambes 1',	'Première séance du programme jambes'),
(4,	'Circuit Cardio 1',	'Premier circuit d\'entraînement cardio');

-- 2025-04-11 18:43:05
