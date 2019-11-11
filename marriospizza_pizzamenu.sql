-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: marriospizza
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pizzamenu`
--

DROP TABLE IF EXISTS `pizzamenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizzamenu` (
  `Pizza_Nr` int(11) DEFAULT NULL,
  `Pizza_name` varchar(225) DEFAULT NULL,
<<<<<<< HEAD
  `Topping` varchar(255) DEFAULT NULL,
=======
  `Topping1` varchar(255) DEFAULT NULL,
  `Topping2` varchar(225) DEFAULT NULL,
  `Topping3` varchar(225) DEFAULT NULL,
  `Topping4` varchar(225) DEFAULT NULL,
  `Topping5` varchar(225) DEFAULT NULL,
  `Topping6` varchar(225) DEFAULT NULL,
  `Topping7` varchar(225) DEFAULT NULL,
>>>>>>> 08f7b775ae78364a5a6567126a39a11ce7a2f803
  `Pris` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzamenu`
--

LOCK TABLES `pizzamenu` WRITE;
/*!40000 ALTER TABLE `pizzamenu` DISABLE KEYS */;
INSERT INTO `pizzamenu` VALUES (1,'Vesuvio','Tomatsauce Ost Skinke og Oregano',57),(2,'Amerikaner','Tomatsauce Ost Oksefars og Oregano',53),(3,'Cacciatore','Tomatsauce Ost Opepperoni og Oregano',57),(4,'Carbona','Tomatsauce Ost Kødsauce Spaghetti Cocktailpølser og oregano',63),(5,'Dennis','Tomatsauce Ost Skinke Pepperoni Cocktailpølse og Oregano',65),(6,'Bertil','Tomatsauce Ost Bacon og Oregano',57),(7,'Silvia','Tomatsauce Ost Pepperoni Rød peber Løg Oliven og Oregano',61),(8,'Victoria','Tomatsauce Ost Skinke Ananas Champignon Løg og Oregano',61),(9,'Toronfo','Tomatsauce Ost Skinke Bacon Kebab Chili og Oregano',61),(10,'Capricciosa','Tomatsauce Ost Skinke Champignon og Oregano',61),(11,'Hawai','Tomatsauce Ost Skinke Ananas og Oregano',61),(12,'La Blissola','Tomatsauce Ost Skinke Rejer og Oregano',61),(13,'Venezia','Tomatsauce Ost Skinke Bacon og Oregano',61),(14,'Mafia','Tomatsauce Ost Pepperoni Bacon Løg og Oregano',61);
/*!40000 ALTER TABLE `pizzamenu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

<<<<<<< HEAD
-- Dump completed on 2019-11-11 11:32:31
=======
-- Dump completed on 2019-11-11 11:07:21
>>>>>>> 08f7b775ae78364a5a6567126a39a11ce7a2f803
