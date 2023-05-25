-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 25, 2023 at 05:30 PM
-- Server version: 8.0.27
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teste2`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidato`
--

DROP TABLE IF EXISTS `candidato`;
CREATE TABLE IF NOT EXISTS `candidato` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `bi` varchar(20) DEFAULT NULL,
  `historico` text,
  `municipio_id` int DEFAULT NULL,
  `votos` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `municipio_id` (`municipio_id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `candidato`
--

INSERT INTO `candidato` (`id`, `nome`, `bi`, `historico`, `municipio_id`, `votos`) VALUES
(12, 'Marino Ricardo', '110103040A', 'descricao do historico', 1, NULL),
(13, 'Marino Ricardo', '110103040A', 'descricao do historico', 1, NULL),
(14, 'Marino Ricardo2', '110103040A', 'descricao do historico', 1, NULL),
(15, 'Marino Ricardo2', '110103040A', 'descricao do historico', 5, NULL),
(16, 'Marino Ricardo1', '110103040A', 'descricao do historico', 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `municipio`
--

DROP TABLE IF EXISTS `municipio`;
CREATE TABLE IF NOT EXISTS `municipio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) DEFAULT NULL,
  `provincia` varchar(100) DEFAULT NULL,
  `quantRecenseados` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `municipio`
--

INSERT INTO `municipio` (`id`, `descricao`, `provincia`, `quantRecenseados`) VALUES
(1, 'Maputo', 'Maputo', 1000000),
(2, 'Matola', 'Maputo', 800000),
(3, 'Beira', 'Sofala', 500000),
(4, 'Nampula', 'Nampula', 600000),
(5, 'Chimoio', 'Manica', 300000),
(6, 'Nacala', 'Nampula', 400000),
(7, 'Quelimane', 'Zambézia', 450000),
(8, 'Tete', 'Tete', 250000),
(9, 'Xai-Xai', 'Gaza', 200000),
(10, 'Lichinga', 'Niassa', 180000),
(11, 'Pemba', 'Cabo Delgado', 220000),
(12, 'Inhambane', 'Inhambane', 280000),
(13, 'Cuamba', 'Niassa', 150000),
(14, 'Maxixe', 'Inhambane', 170000),
(15, 'Ressano Garcia', 'Maputo', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `voto`
--

DROP TABLE IF EXISTS `voto`;
CREATE TABLE IF NOT EXISTS `voto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `isBranco` int DEFAULT NULL,
  `isValido` int DEFAULT NULL,
  `dataVoto` date DEFAULT NULL,
  `candidato_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `candidato_id` (`candidato_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
