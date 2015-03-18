-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18-Mar-2015 às 18:20
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `unibh`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_aluno`
--

CREATE TABLE IF NOT EXISTS `tb_aluno` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `CPF` char(11) NOT NULL,
  `MATRICULA` int(11) NOT NULL,
  `DATA_ANIVERSARIO` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  UNIQUE KEY `CPF` (`CPF`),
  UNIQUE KEY `CPF_2` (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_professor`
--

CREATE TABLE IF NOT EXISTS `tb_professor` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `SALARIO` bigint(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
