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
-- Table structure for table `ordre`
--

DROP TABLE IF EXISTS `ordre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordre` (
  `Order_ID` int(11) DEFAULT NULL,
  `Customer_name` varchar(225) DEFAULT NULL,
  `Pizza` varchar(255) DEFAULT NULL,
  `Pris` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordre`
--

LOCK TABLES `ordre` WRITE;
/*!40000 ALTER TABLE `ordre` DISABLE KEYS */;
INSERT INTO `ordre` VALUES (1,'Artem','9',61),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','3',63),(1,'Artem','4',57),(1,'Artem','5',65),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','3',63),(1,'Artem','4',57),(1,'Artem','5',65),(1,'Artem','6',57),(1,'Artem','7',61),(1,'Artem','5',65),(1,'Artem','4',57),(1,'Artem','6',57),(1,'Artem','5',65),(1,'Artem','4',57),(1,'Artem','3',63),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','9',61),(1,'Artem','8',61),(1,'Artem','1',57),(1,'Artem','3',63),(1,'Artem','7',61),(1,'Artem','6',57),(1,'Artem','5',65),(1,'Artem','4',57),(1,'Artem','3',63),(1,'Artem','2',53),(1,'Artem','1',57),(1,'Artem','3',63),(1,'Jannich','5',65),(1,'Jannich','4',57),(1,'Artem','3',63),(1,'Artem','2',53),(1,'Artem','3',63),(1,'Artem','4',57),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','1',57),(1,'Artem','2',53),(2,'lolol','2',53),(1,'Artem','3',63),(1,'Artem','1',57),(1,'Artem','3',63),(1,'Artem','5',65),(1,'Karl','1',57),(1,'Artem','3',63),(1,'Artem','2',53),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','1',57),(1,'Artem','2',53),(1,'Artem','3',57),(1,'Artem','4',63),(1,'Artem','5',65),(1,'Artem','6',57),(1,'Artem','7',61),(1,'Artem','1',57),(1,'Artem','2',53),(1,'bob','8',61),(1,'bob','7',61),(1,'L�kker','3',57),(1,'L�kker','4',63),(1,'Bob','3',57),(1,'Bob','2',53),(1,'Artem','5',65),(1,'Artem','6',57),(1,'lol','1',57),(1,'lol','2',53),(2,'bob','4',63),(2,'bob','5',65),(2,'bob','6',57),(3,'Gertrud','9',61),(4,'Bobby','9',61),(4,'Bobby','5',65),(4,'Bobby','7',61),(1,'Artem','1',57),(1,'Artem','1',57),(1,'Bodil','1',57),(1,'Bodil','2',53),(2,'lsad','2',53),(2,'lsad','2',53),(1,'Artem','2',53),(1,'Artem','2',53),(1,'karl','1',57),(1,'karl','1',57),(1,'bob','1',57),(1,'bob','1',57),(1,'troll','1',57),(1,'troll','1',57),(1,'Artem','1',57),(1,'Artem','1',57),(1,'KLJAFLJAJFLAJLFKJ','1',57),(1,'KLJAFLJAJFLAJLFKJ','3',57),(1,'KLJAFLJAJFLAJLFKJ','5',65),(1,'KLJAFLJAJFLAJLFKJ','7',61),(1,'KLJAFLJAJFLAJLFKJ','9',61),(1,'KLJAFLJAJFLAJLFKJ','2',53),(1,'KLJAFLJAJFLAJLFKJ','4',63),(1,'KLJAFLJAJFLAJLFKJ','6',57),(1,'KLJAFLJAJFLAJLFKJ','8',61),(1,'asdasdasd','6',57),(1,'asdasdasd','6',57),(1,'tret','6',57),(1,'tret','6',57),(1,'kokr','6',57),(1,'kokr','6',57),(1,'Artem','7',61),(1,'Artem','7',61),(2,'qweqeqw','11',61),(2,'qweqeqw','11',61),(2,'qweqeqw','11',61),(2,'qweqeqw','11',61),(2,'qweqeqw','11',61),(1,'poerp','12',61),(1,'poerp','12',61),(1,'bob','1',57),(1,'bob','1',57),(1,'rte','9',61),(1,'jgj','6',57),(1,'jgj','6',57),(1,'qwe','3',57),(1,'qwe','4',63),(2,'sad','14',61),(2,'sad','14',61),(2,'sad','14',61),(2,'sad','14',61),(1,'erw','1',57),(1,'erw','1',57),(1,'wqeq','1',57),(1,'qwe','4',63),(1,'qwe','5',65),(1,'qwe','6',57),(2,'gfdg','3',57),(2,'gfdg','4',63),(1,'paul','13',61),(1,'paul','13',61),(1,'fjols','10',61),(1,'fjols','10',61),(1,'js','5',65),(1,'js','7',61),(1,'qeqe','3',57),(1,'qeqe','4',63),(1,'rebecca','10',61),(1,'rebecca','14',61);
/*!40000 ALTER TABLE `ordre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizzamenu`
--

DROP TABLE IF EXISTS `pizzamenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pizzamenu` (
  `Pizza_Nr` int(11) DEFAULT NULL,
  `Pizza_name` varchar(225) DEFAULT NULL,
  `Topping` varchar(255) DEFAULT NULL,
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

--
-- Table structure for table `statistik`
--

DROP TABLE IF EXISTS `statistik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statistik` (
  `Pizza_Nr` int(11) DEFAULT NULL,
  `Pizza_name` varchar(225) DEFAULT NULL,
  `Topping` varchar(255) DEFAULT NULL,
  `Antal` int(11) DEFAULT NULL,
  `Omsætning` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statistik`
--

LOCK TABLES `statistik` WRITE;
/*!40000 ALTER TABLE `statistik` DISABLE KEYS */;
INSERT INTO `statistik` VALUES (1,'Vesuvio','Tomatsauce Ost Skinke og Oregano',14,0),(2,'Amerikaner','Tomatsauce Ost Oksefars og Oregano',1,0),(3,'Cacciatore','Tomatsauce Ost Opepperoni og Oregano',5,0),(4,'Carbona','Tomatsauce Ost Kødsauce Spaghetti Cocktailpølser og oregano',5,0),(5,'Dennis','Tomatsauce Ost Skinke Pepperoni Cocktailpølse og Oregano',3,0),(6,'Bertil','Tomatsauce Ost Bacon og Oregano',10,0),(7,'Silvia','Tomatsauce Ost Pepperoni Rød peber Løg Oliven og Oregano',6,0),(8,'Victoria','Tomatsauce Ost Skinke Ananas Champignon Løg og Oregano',1,0),(9,'Toronfo','Tomatsauce Ost Skinke Bacon Kebab Chili og Oregano',2,0),(10,'Capricciosa','Tomatsauce Ost Skinke Champignon og Oregano',3,0),(11,'Hawai','Tomatsauce Ost Skinke Ananas og Oregano',10,0),(12,'La Blissola','Tomatsauce Ost Skinke Rejer og Oregano',2,0),(13,'Venezia','Tomatsauce Ost Skinke Bacon og Oregano',2,0),(14,'Mafia','Tomatsauce Ost Pepperoni Bacon Løg og Oregano',5,0);
/*!40000 ALTER TABLE `statistik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'marriospizza'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-14 17:05:49
