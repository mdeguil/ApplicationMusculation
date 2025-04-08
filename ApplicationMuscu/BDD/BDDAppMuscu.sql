-- Adminer 4.7.1 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP DATABASE IF EXISTS `bddappmusculation`;
CREATE DATABASE `bddappmusculation` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bddappmusculation`;

DROP TABLE IF EXISTS `exercice`;
CREATE TABLE `exercice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `muscleSolicite` varchar(50) NOT NULL,
  `detail` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


-- 2025-04-04 17:40:08
