-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 12 juil. 2021 à 19:48
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `askanbibanquedb`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

DROP TABLE IF EXISTS `agence`;
CREATE TABLE IF NOT EXISTS `agence` (
  `idagence` int(11) NOT NULL AUTO_INCREMENT,
  `nomagence` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) DEFAULT NULL,
  `datecreation` date DEFAULT NULL,
  `email` varchar(250) NOT NULL,
  `telephone` varchar(30) NOT NULL,
  PRIMARY KEY (`idagence`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `agence`
--

INSERT INTO `agence` (`idagence`, `nomagence`, `adresse`, `datecreation`, `email`, `telephone`) VALUES
(1, 'ToubaToul', 'Touba toul', '2021-06-03', '', ''),
(2, 'keur Massar', 'Keur Massar', '2021-06-06', '', ''),
(3, 'Guediawaye', 'Guediawaye', '2021-06-06', '', ''),
(7, 'dakar', 'dakar', '2021-06-16', '', ''),
(8, 'bbb', 'bbb', '2021-06-16', '', ''),
(9, 'PIKINE', 'PIKINE', '2021-06-15', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `agent`
--

DROP TABLE IF EXISTS `agent`;
CREATE TABLE IF NOT EXISTS `agent` (
  `idagent` int(11) NOT NULL AUTO_INCREMENT,
  `Idagence` int(11) DEFAULT NULL,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) DEFAULT NULL,
  `datenaissance` varchar(255) DEFAULT NULL,
  `telephone` varchar(254) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `genre` varchar(64) NOT NULL,
  `civilite` varchar(64) NOT NULL,
  `cni` varchar(200) NOT NULL,
  PRIMARY KEY (`idagent`),
  KEY `FK_Agence_Agent` (`Idagence`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `agent`
--

INSERT INTO `agent` (`idagent`, `Idagence`, `nom`, `prenom`, `adresse`, `datenaissance`, `telephone`, `email`, `genre`, `civilite`, `cni`) VALUES
(1, 2, 'Diouf', 'Fadel', 'Cite colobane', '2020-02-11', '77777777777', 'diouf@fallou', '', '', ''),
(4, 1, 'Niang', 'Matar', 'guediawaye', '2021-06-04', '765444444', 'matar@gmail.com', '', '', ''),
(5, 1, 'Ndiongue', 'Maps', 'maps@gmail.com', '2021-06-05', '76654433333', 'maps@gmail.com', '', '', ''),
(6, 1, 'fadji', 'diop', 'toul', '2021-06-04', '', 'fadel@fadji', '', '', ''),
(7, 2, 'diong', 'maps', 'keur massar', '2021-06-16', '765555555', 'mapenda@gmail.com', 'mascilun', 'Marie', ''),
(8, 3, 'Niang', 'Makhtar', 'Guediwaye', '2021-06-11', '78888888', 'matar@com', 'mas', 'celibataire', ''),
(9, 2, 'mapenda', 'sokhna', 'keur massar', '2021-06-15', NULL, NULL, '', '', ''),
(10, 1, 'ggggh', 'douf', 'toul', '2021-06-16', '777777', 'diouf@fallou', 'masculin', 'MariÃ©', '');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idclient` int(11) NOT NULL AUTO_INCREMENT,
  `idagent` int(11) DEFAULT NULL,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  `adresse` varchar(254) DEFAULT NULL,
  `datenaissance` varchar(255) DEFAULT NULL,
  `telephone` varchar(254) DEFAULT NULL,
  `email` varchar(254) DEFAULT NULL,
  `civilite` varchar(255) NOT NULL,
  `genre` varchar(25) NOT NULL,
  `cni` bigint(20) NOT NULL,
  PRIMARY KEY (`idclient`),
  KEY `FK_Agent_client` (`idagent`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idclient`, `idagent`, `nom`, `prenom`, `adresse`, `datenaissance`, `telephone`, `email`, `civilite`, `genre`, `cni`) VALUES
(86, 8, 'diouf', 'fallou', 'colobane', '08/03/2021', '7779999', 'diouffadel406@com', 'celibataire', 'feminin', 12345678),
(87, 8, 'faye', 'fallou', 'colobane', '08/03/2021 12:00 AM', '7779999', 'diouffadel406@com', 'marie', 'masculin', 12345678),
(88, 8, 'faye', 'fallou', 'colobane', '08/03/2021 12:00 AM', '7779999', 'diouffadel406@com', 'marie', 'masculin', 12345678),
(89, 8, 'fdel', 'diouf', 'dk', '07/06/2021', '77777', 'fadel@com', 'marie', 'masculin', 777777),
(90, 8, 'fdel', 'diouf', 'saint louis', '12/05/1990', '77777', 'faloud@diouf.com', 'marie', 'masculin', 777777),
(91, 8, 'fdel', 'diouf', 'Touba', '07/06/2021', '77777', 'faloud@diouf.com', 'marie', 'masculin', 777777),
(92, 8, 'fdel', 'diouf', 'Guediawaye', '07/06/2021', '77777', 'faloud@diouf.com', 'marie', 'masculin', 777777),
(105, 1, 'diouf', 'mbaye', 'colobane', '12-05-1990', '776777777', 'faloud.com', 'celibataire', 'masculin', 1642),
(111, 1, 'diouf', 'mbaye', 'colobane', '12-05-1990', '776777777', 'faloud.com', 'celibataire', 'masculin', 1642),
(123, 1, 'diouf', 'diouf', 'diouf', '12/05/1990', '77777', 'faloud.@com', 'marie', 'masculin', 777777),
(124, 1, 'diouf', 'diouf', 'diouf', '12/05/1990', '77777', 'faloud.@com', 'marie', 'masculin', 777777),
(125, 1, 'diouf', 'diouf', 'diouf', '12/05/1990', '77777', 'faloud.@com', 'marie', 'masculin', 777777),
(126, 5, 'fdel', 'diouf', 'diouf', '12/05/1990', '77777', 'faloud.@com', 'celibataire', 'feminin', 16422222222222),
(127, 8, 'fdel', 'diouf', 'Guediawaye', '07/06/2021', '77777', 'faloud@diouf.com', 'marie', 'masculin', 777777);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `idcompte` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) NOT NULL,
  `num_compte` varchar(254) DEFAULT NULL,
  `solde` double DEFAULT NULL,
  `datecreation` varchar(64) DEFAULT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `type_compte` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idcompte`),
  KEY `FK_Client_compte` (`idclient`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`idcompte`, `idclient`, `num_compte`, `solde`, `datecreation`, `active`, `type_compte`) VALUES
(48, 86, '7811551661', 772833, '2021-07-01', 1, NULL),
(49, 87, '4565290378', 9000, '2021-07-01', 1, NULL),
(50, 88, '5620638247', 5000, '2021-07-01', 1, NULL),
(51, 89, '3397256473', 499334, '2021-07-02', 0, NULL),
(52, 90, '3093895649', 500000, '2021-07-03', 1, NULL),
(53, 91, '8371187426', 499001, '2021-07-03', 1, NULL),
(54, 92, '3886925483', 166667, '2021-07-03', 1, NULL),
(56, 105, '8592884078', 50000, '2021-07-09', 0, 'courant'),
(57, 111, '9269245101', 50000, '2021-07-09', 1, 'courant'),
(68, 123, '0729982575', 500000, '2021-07-09', 0, 'courant'),
(69, 124, '7763295006', 500000, '2021-07-09', 1, 'courant'),
(70, 125, '0598262096', 500000, '2021-07-09', 1, 'courant'),
(71, 126, '1725714081', 500000, '2021-07-09', 0, 'courant');

-- --------------------------------------------------------

--
-- Structure de la table `operation`
--

DROP TABLE IF EXISTS `operation`;
CREATE TABLE IF NOT EXISTS `operation` (
  `idoperation` int(11) NOT NULL AUTO_INCREMENT,
  `idagent` int(11) NOT NULL,
  `idtype` int(11) NOT NULL,
  `idcompte` int(11) NOT NULL,
  `dateoperation` varchar(64) DEFAULT NULL,
  `credit` double DEFAULT NULL,
  `debite` double DEFAULT NULL,
  `envoie` double DEFAULT NULL,
  `recue` double DEFAULT NULL,
  PRIMARY KEY (`idoperation`),
  KEY `FK_Agent_Operation` (`idagent`),
  KEY `FK_Association_9` (`idtype`),
  KEY `FK_Compte_Opreration` (`idcompte`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `operation`
--

INSERT INTO `operation` (`idoperation`, `idagent`, `idtype`, `idcompte`, `dateoperation`, `credit`, `debite`, `envoie`, `recue`) VALUES
(1, 1, 2, 51, '2021-07-10', 333, NULL, NULL, NULL),
(2, 1, 3, 48, '2021-07-10', NULL, NULL, 4000, NULL),
(3, 1, 3, 49, '2021-07-10', NULL, NULL, NULL, 4000),
(4, 1, 2, 53, '2021-07-10', NULL, 333, NULL, NULL),
(5, 1, 2, 48, '2021-07-10', NULL, 333, NULL, NULL),
(6, 1, 2, 53, '2021-07-11', NULL, 333, NULL, NULL),
(7, 1, 2, 53, '2021-07-11', NULL, 333, NULL, NULL),
(8, 1, 2, 53, '2021-07-11', NULL, 333, NULL, NULL),
(9, 1, 2, 51, '2021-07-11', NULL, 333, NULL, NULL),
(10, 1, 3, 54, '2021-07-11', NULL, NULL, 100000, NULL),
(11, 1, 3, 48, '2021-07-11', NULL, NULL, NULL, 100000),
(12, 1, 3, 54, '2021-07-11', NULL, NULL, 4000, NULL),
(13, 1, 3, 48, '2021-07-11', NULL, NULL, NULL, 4000),
(14, 1, 3, 54, '2021-07-11', NULL, NULL, 333333, NULL),
(15, 1, 3, 48, '2021-07-11', NULL, NULL, NULL, 333333),
(16, 1, 3, 54, '2021-07-11', NULL, NULL, 333333, NULL),
(17, 1, 3, 48, '2021-07-11', NULL, NULL, NULL, 333333),
(18, 1, 1, 48, '2021-07-11', 500, NULL, NULL, NULL),
(19, 1, 1, 48, '2021-07-11', 500, NULL, NULL, NULL),
(20, 1, 1, 48, '2021-07-11', 500, NULL, NULL, NULL),
(21, 1, 1, 48, '2021-07-11', 500, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `idrole` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idrole`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`idrole`, `role`) VALUES
(1, 'superadmin'),
(2, 'admin'),
(3, 'agent'),
(4, 'client');

-- --------------------------------------------------------

--
-- Structure de la table `type`
--

DROP TABLE IF EXISTS `type`;
CREATE TABLE IF NOT EXISTS `type` (
  `idtype` int(11) NOT NULL AUTO_INCREMENT,
  `typeoperation` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idtype`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `type`
--

INSERT INTO `type` (`idtype`, `typeoperation`) VALUES
(1, 'depot'),
(2, 'retrait'),
(3, 'virement');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `idrole` int(11) NOT NULL,
  `idagent` int(11) DEFAULT NULL,
  `idclient` int(64) DEFAULT NULL,
  `username` varchar(254) DEFAULT NULL,
  `password` varchar(254) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`iduser`),
  KEY `FK_Role_User` (`idrole`),
  KEY `FK_User_Agent` (`idagent`),
  KEY `FK_user_client` (`idclient`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`iduser`, `idrole`, `idagent`, `idclient`, `username`, `password`, `active`) VALUES
(3, 1, 4, NULL, 'Matar@niang', 'passer', NULL),
(4, 2, 5, NULL, 'Maps@diongue', 'passer', NULL),
(5, 3, 1, NULL, 'fadel@diouf', 'passer', NULL),
(7, 1, 6, NULL, 'passer', 'passer', NULL),
(8, 1, 6, NULL, 'passer', 'passer', NULL),
(9, 2, 8, NULL, 'mahtar@matar', 'passer', NULL),
(12, 2, 9, NULL, 'maps', 'passer', NULL),
(13, 3, NULL, NULL, 'passer', 'passer', NULL),
(51, 1, NULL, 86, 'lamp2', 'passer', NULL),
(52, 1, NULL, 87, 'lamp2', 'passer', NULL),
(53, 1, NULL, 88, 'lamp2', 'passer', NULL),
(54, 1, NULL, 89, 'lamp2', 'passer', NULL),
(55, 1, NULL, 90, 'lamp2', 'passer', NULL),
(56, 1, NULL, 91, 'lamp2', 'passer', NULL),
(57, 1, NULL, 92, 'lamp2', 'passer', NULL),
(59, 1, NULL, 105, 'fadji@fadel', 'passer', NULL),
(60, 1, NULL, 111, 'fadji@fadel', 'passer', NULL),
(71, 1, NULL, 123, 'fadel@diouf', 'passer', NULL),
(72, 1, NULL, 124, 'fadel@diouf', 'passer', NULL),
(73, 1, NULL, 125, 'fadel@diouf', 'passer', NULL),
(74, 1, NULL, 126, 'fadel@diouf', 'passer', NULL),
(75, 3, 9, NULL, 'maps', 'passer', NULL);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `agent`
--
ALTER TABLE `agent`
  ADD CONSTRAINT `FK_Agence_Agent` FOREIGN KEY (`Idagence`) REFERENCES `agence` (`idagence`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `FK_Agent_client` FOREIGN KEY (`idagent`) REFERENCES `agent` (`idagent`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `FK_Client_compte` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `operation`
--
ALTER TABLE `operation`
  ADD CONSTRAINT `FK_Agent_Operation` FOREIGN KEY (`idagent`) REFERENCES `agent` (`idagent`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Association_9` FOREIGN KEY (`idtype`) REFERENCES `type` (`idtype`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Compte_Opreration` FOREIGN KEY (`idcompte`) REFERENCES `compte` (`idcompte`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_Role_User` FOREIGN KEY (`idrole`) REFERENCES `role` (`idrole`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_User_Agent` FOREIGN KEY (`idagent`) REFERENCES `agent` (`idagent`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_user_client` FOREIGN KEY (`idclient`) REFERENCES `client` (`idclient`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
