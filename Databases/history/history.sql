-- MySQL dump 10.13  Distrib 5.7.27, for Win64 (x86_64)
--
-- Host: localhost    Database: history
-- ------------------------------------------------------
-- Server version	5.7.27-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_1`
--

DROP TABLE IF EXISTS `admin_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_1` (
  `pickup` varchar(25) DEFAULT NULL,
  `dropoff` varchar(25) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_1`
--

LOCK TABLES `admin_1` WRITE;
/*!40000 ALTER TABLE `admin_1` DISABLE KEYS */;
INSERT INTO `admin_1` VALUES ('The Shire','Eriador',160);
/*!40000 ALTER TABLE `admin_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_2`
--

DROP TABLE IF EXISTS `admin_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_2` (
  `pickup` varchar(25) DEFAULT NULL,
  `dropoff` varchar(25) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_2`
--

LOCK TABLES `admin_2` WRITE;
/*!40000 ALTER TABLE `admin_2` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_3`
--

DROP TABLE IF EXISTS `admin_3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_3` (
  `pickup` varchar(25) DEFAULT NULL,
  `dropoff` varchar(25) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_3`
--

LOCK TABLES `admin_3` WRITE;
/*!40000 ALTER TABLE `admin_3` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_4`
--

DROP TABLE IF EXISTS `admin_4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_4` (
  `pickup` varchar(25) DEFAULT NULL,
  `dropoff` varchar(25) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_4`
--

LOCK TABLES `admin_4` WRITE;
/*!40000 ALTER TABLE `admin_4` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asas`
--

DROP TABLE IF EXISTS `asas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asas` (
  `pickup` varchar(25) DEFAULT NULL,
  `dropoff` varchar(25) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asas`
--

LOCK TABLES `asas` WRITE;
/*!40000 ALTER TABLE `asas` DISABLE KEYS */;
/*!40000 ALTER TABLE `asas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-14  0:18:54
