-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: librarydb
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `bookId` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `numberOfCopies` int DEFAULT NULL,
  `numberOfAvailableCopies` int DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'ABCD','abcPub','abcAuthor',10,0,'Historical fiction'),(2,'EFG','efgPub','efgAuthor',15,9,'Historical fiction'),(3,'novel','novel cor','mr novel',10,3,'Graphic novel'),(4,'poetry','po cor','mr. poetry',11,11,'Poetry'),(6,'new novel','novel','novel',10,10,'Graphic novel'),(8,'novel','novel','novel',10,4,'Historical fiction'),(9,'new book','hf Cor','novel',3,0,'Historical fiction'),(10,'old Book','Old Publisher','old Author',3,3,'Historical fiction'),(11,'new book 1','po cor','old Author',3,3,'Historical fiction');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issue`
--

DROP TABLE IF EXISTS `issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issue` (
  `issueId` int NOT NULL AUTO_INCREMENT,
  `dateOfIssue` varchar(50) DEFAULT NULL,
  `dateOfReturn` varchar(50) DEFAULT NULL,
  `bookId` int DEFAULT NULL,
  `studentId` int DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `fine` double DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`issueId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issue`
--

LOCK TABLES `issue` WRITE;
/*!40000 ALTER TABLE `issue` DISABLE KEYS */;
INSERT INTO `issue` VALUES (1,'12-12-12','21-12-12',1,1,'borrowed',NULL,NULL),(2,'2021-11-04','2021-11-12',1,8,'approved',NULL,NULL),(3,'2021-11-03','2021-11-12',2,1,'borrowed',NULL,NULL),(4,'2021-11-04','2021-11-09',8,10,'borrowed',NULL,NULL),(5,'2021-11-04','2021-11-24',8,8,'approved',NULL,NULL),(6,'2021-11-06','2021-11-09',8,8,'approved',NULL,NULL),(7,'2021-11-10','2021-11-10',8,8,'approved',NULL,NULL),(8,'2021-11-08','2021-11-12',8,8,'approved',NULL,NULL),(9,'2021-11-08','2021-11-18',8,8,'approved',NULL,NULL),(10,'2021-11-17','2021-12-02',8,8,'approved',NULL,NULL),(11,'2021-11-08','2021-11-17',9,8,'approved',NULL,NULL),(12,'2021-11-09','2021-11-25',9,8,'approved',NULL,NULL),(13,'2021-11-08','2021-11-11',9,8,'approved',NULL,NULL),(14,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(15,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(16,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(17,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(18,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(19,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(20,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(21,'2021-11-08','2021-11-10',3,8,'approved',NULL,NULL),(22,'2021-11-08','2021-11-08',4,8,'approved',200,'asdsad'),(23,'2021-11-08','2021-11-09',4,8,'approved',NULL,NULL),(24,'2021-11-08','2021-11-09',4,8,'approved',NULL,NULL),(25,'2021-11-08','2021-11-09',4,8,'approved',NULL,NULL),(26,'2021-11-08','2021-11-09',4,8,'approved',20,'no comment'),(27,'2021-11-08','2021-11-09',4,8,'approved',NULL,NULL),(28,'2021-11-08','2021-11-09',4,8,'approved',NULL,NULL),(29,'2021-11-08','2021-11-10',10,12,'approved',NULL,NULL),(30,'2021-11-09','2021-11-11',11,14,'approved',NULL,NULL),(31,'2021-11-09','2021-11-18',11,14,'approved',20,'no comment');
/*!40000 ALTER TABLE `issue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `request` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `edition` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `studentId` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
INSERT INTO `request` VALUES (1,'re1','me','1st','no note','Dismissed',8),(2,'r2','novel','1st','no','Dismissed',8),(3,'book 3','me','1st','no note','Considering',9),(4,'old book 2','old Author','1st','emergency needed','Considering',12),(5,'old book 3','kljl','1st','ajskdja','Dismissed',12),(6,'old book 4','kljl','1st','asdasd','Dismissed',12),(7,'new book','kljl','1st','emergency','Dismissed',14);
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userId` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `dateOfBirth` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Zakir','Ahmed','male','12-12-12','018238123','zakir@gmail.com','1','admin'),(2,'Kabir','Khan','male','12-12-12','019236863','kabir@gmail.com','123','admin'),(3,'sarkar','md','male','12-12-12','123123123','sarkar@gmail.com','123','admin'),(4,'safik ','Alam','Male','2021-11-22','2313123123','safik@gmail.com','12345','admin'),(5,'test1','test1','Male','2021-11-17','0123123','test1@gmail.com','12345','admin'),(6,'st1','st1','male','12-12-12','12312312','st1@gmail.com','123','student'),(7,'Syed','Syed','male','2021-11-18','123123123','syed_khoab@outlook.com','12345','student'),(8,'s','k','male','12-12-12','123123123','s@gmail.com','1','student'),(9,'Syed','Syed','male','2021-11-19','01744641522','syed_khoab@outlook.com','123','student'),(10,'Mk','Mk','male','2021-11-16','01744641522','mk@outlook.com','12345','student'),(11,'Syed','Abdullah','Male','2021-11-09','2313123123','gg@outlook.com','12345','admin'),(12,'old ','old ','male','2021-11-09','01744641522','old@gmail.com','123','student'),(13,'old','User','Male','2021-11-22','2313123123','olduser@gmail.com','123','admin'),(14,'new student','new student','male','2021-11-11','01744641522','new@gmail.com','12345','student'),(15,'new','user','Male','2021-11-02','2313123123','newuser@gmail.com','123','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-10 20:26:36
