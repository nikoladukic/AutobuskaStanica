/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 10.4.27-MariaDB : Database - autobuskastanica
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`autobuskastanica` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `autobuskastanica`;

/*Table structure for table `autobus` */

DROP TABLE IF EXISTS `autobus`;

CREATE TABLE `autobus` (
  `RegBrojVozila` varchar(100) NOT NULL,
  `MarkaAutobusa` varchar(100) NOT NULL,
  `GodinaProizvodnje` int(11) NOT NULL,
  `BrojMesta` int(11) NOT NULL,
  `VrstaAutobusa` bigint(11) NOT NULL,
  PRIMARY KEY (`RegBrojVozila`),
  KEY `autobus_ibfk_1` (`VrstaAutobusa`),
  CONSTRAINT `autobus_ibfk_1` FOREIGN KEY (`VrstaAutobusa`) REFERENCES `vrstaautobusa` (`VrstaAutobusaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `autobus` */

insert  into `autobus`(`RegBrojVozila`,`MarkaAutobusa`,`GodinaProizvodnje`,`BrojMesta`,`VrstaAutobusa`) values 
('KV-142-DF','Volvo',2001,40,200),
('KV-142-DH','Volvo',2002,55,100),
('KV-142-FH','Volvo',2019,64,200),
('KV-452-SD','Volvo',2001,54,100),
('KV-455-SE','MAN',2014,75,200),
('KV-778-DF','Mercedes',2005,24,300),
('kv143fn','volvo',1212,23,200);

/*Table structure for table `destinacijavoznje` */

DROP TABLE IF EXISTS `destinacijavoznje`;

CREATE TABLE `destinacijavoznje` (
  `RedniBroj` bigint(20) NOT NULL AUTO_INCREMENT,
  `VoznjaID` bigint(20) NOT NULL,
  `MestoID` int(10) NOT NULL,
  PRIMARY KEY (`VoznjaID`,`RedniBroj`),
  KEY `MestoID` (`MestoID`),
  KEY `RedniBroj` (`RedniBroj`),
  CONSTRAINT `destinacijavoznje_ibfk_1` FOREIGN KEY (`VoznjaID`) REFERENCES `voznja` (`VoznjaID`),
  CONSTRAINT `destinacijavoznje_ibfk_2` FOREIGN KEY (`MestoID`) REFERENCES `mesto` (`MestoID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `destinacijavoznje` */

insert  into `destinacijavoznje`(`RedniBroj`,`VoznjaID`,`MestoID`) values 
(11,28,32000),
(12,29,32000);

/*Table structure for table `korisnik` */

DROP TABLE IF EXISTS `korisnik`;

CREATE TABLE `korisnik` (
  `KorisnickoIme` varchar(100) NOT NULL,
  `Lozinka` varchar(100) NOT NULL,
  PRIMARY KEY (`KorisnickoIme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `korisnik` */

insert  into `korisnik`(`KorisnickoIme`,`Lozinka`) values 
('nikola','nikola');

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `MestoID` int(10) NOT NULL,
  `NazivMesta` varchar(100) NOT NULL,
  PRIMARY KEY (`MestoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `mesto` */

insert  into `mesto`(`MestoID`,`NazivMesta`) values 
(11000,'Beograd'),
(18000,'Prijepolje'),
(32000,'Cacak'),
(32150,'Ivanjica'),
(34000,'Kragujevac'),
(36000,'Kraljevo'),
(36400,'Novi Pazar');

/*Table structure for table `vozac` */

DROP TABLE IF EXISTS `vozac`;

CREATE TABLE `vozac` (
  `JMBG` varchar(100) NOT NULL,
  `Ime` varchar(100) NOT NULL,
  `Prezime` varchar(100) NOT NULL,
  `DatumRodjenja` datetime NOT NULL,
  `RadniStaz` int(11) unsigned NOT NULL,
  PRIMARY KEY (`JMBG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `vozac` */

insert  into `vozac`(`JMBG`,`Ime`,`Prezime`,`DatumRodjenja`,`RadniStaz`) values 
('0104983780056','Petar','Stefanovic','1983-04-01 14:40:42',3),
('0211978254525','Nikola','Sretenovic','1978-11-02 00:00:00',4),
('0504000785512','Veljko','Dukic','2000-05-04 00:00:00',3),
('0510985780025','Stefan','Petrovic','1985-05-10 00:00:00',12),
('1212969785878','Petar','Petrovic','1969-12-12 00:00:00',29);

/*Table structure for table `voznja` */

DROP TABLE IF EXISTS `voznja`;

CREATE TABLE `voznja` (
  `VoznjaID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DatumPolaska` date NOT NULL,
  `VremePolaska` time NOT NULL,
  `JMBG` varchar(100) NOT NULL,
  `RegBrojVozila` varchar(100) NOT NULL,
  PRIMARY KEY (`VoznjaID`),
  KEY `JMBG` (`JMBG`),
  KEY `RegBrojVozila` (`RegBrojVozila`),
  CONSTRAINT `voznja_ibfk_1` FOREIGN KEY (`JMBG`) REFERENCES `vozac` (`JMBG`),
  CONSTRAINT `voznja_ibfk_2` FOREIGN KEY (`RegBrojVozila`) REFERENCES `autobus` (`RegBrojVozila`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `voznja` */

insert  into `voznja`(`VoznjaID`,`DatumPolaska`,`VremePolaska`,`JMBG`,`RegBrojVozila`) values 
(28,'2023-07-02','10:00:00','0504000785512','KV-142-DH'),
(29,'2023-07-02','10:00:00','0504000785512','KV-142-DH');

/*Table structure for table `vrstaautobusa` */

DROP TABLE IF EXISTS `vrstaautobusa`;

CREATE TABLE `vrstaautobusa` (
  `VrstaAutobusaID` bigint(20) NOT NULL,
  `NazivVrsta` varchar(100) NOT NULL,
  PRIMARY KEY (`VrstaAutobusaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `vrstaautobusa` */

insert  into `vrstaautobusa`(`VrstaAutobusaID`,`NazivVrsta`) values 
(100,'Gradski autobus'),
(200,'Autobus na sprat'),
(300,'Kombi');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
