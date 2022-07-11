-- MySQL dump 10.13  Distrib 5.7.17, for Win32 (AMD64)
--
-- Host: localhost    Database: estudiofotografia
-- ------------------------------------------------------
-- Server version	5.7.17

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cpf` bigint(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (15,82449450017,'hudson rikelme','hudson@mail.com'),(16,50413072029,'jose aparecido','joseaparecido@mail.com'),(17,20704896044,'rafaella soares','rafaella@mail.com'),(18,3171993074,'romilda soares','romilda@mail.com'),(19,40147797004,'ana flavia','ana@mail.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dataevento` date DEFAULT NULL,
  `cliente_id` bigint(20) NOT NULL,
  `tipoproduto_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_id` (`cliente_id`),
  KEY `tipoproduto_id` (`tipoproduto_id`),
  CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`tipoproduto_id`) REFERENCES `tipoproduto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
INSERT INTO `contrato` VALUES (20,'2022-07-14',17,3),(21,'2022-07-22',17,1),(22,'2022-07-29',15,2),(23,'2022-07-21',18,3),(24,'2022-07-30',16,1),(25,'2022-11-12',18,3);
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagamento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `valor` decimal(10,0) NOT NULL,
  `datapagamento` date DEFAULT NULL,
  `contrato_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `contrato_id` (`contrato_id`),
  CONSTRAINT `pagamento_ibfk_1` FOREIGN KEY (`contrato_id`) REFERENCES `contrato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` VALUES (20,50,'2022-06-09',20),(21,200,'2022-07-07',20),(22,400,'2022-06-09',21),(23,200,'2022-07-04',24),(24,50,'2022-07-04',23),(25,100,'2022-06-06',22),(26,100,'2022-07-04',22),(27,50,'2022-07-08',22);
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cpf` bigint(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,74193712028,'Ana','ana@mail.com'),(2,69089421041,'Carla Helem','carla@mail.com'),(3,34534095074,'Pedro','pedro@mail.com'),(4,79685316082,'Mario','mario@mail.com'),(5,89312377078,'João','João@mail.com'),(7,62033264025,'rafaella soares','rafaella@mail.com'),(8,68826547009,'henry soares','henry@mail.com'),(9,92302969022,'Romilda Soares','romilda@mail'),(11,84324200009,'Jhane ','jhane@mail.com'),(12,60944530001,'Artur','artur@mail.com'),(13,70320684059,'dsada','sadsdasdadadhaushduhsa'),(14,2383756091,'josinaldo','dhasuhduahsudhauhsduhauhsduhaushduauhsduhashduauhdhsauhduhasudhuahsudhuhsudhauhsduhaushduahsdhuashduhausduasudhahdjhasjhdjhasudhuhasuhdahusduhaushdhaushduhaushduhahsdiahusdhuahsidhuahsduiahushduihasuhduahsudhuiahsidhiuahsduihuahsudhiasah'),(17,8899458022,'jose aparecido','jose@mail.com'),(18,82449450017,'hudson rikelme','hudson@mail.com'),(19,50413072029,'jose aparecido','joseaparecido@mail.com'),(21,3171993074,'romilda soares','romilda@mail.com');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproduto`
--

DROP TABLE IF EXISTS `tipoproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoproduto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `duracao` double NOT NULL,
  `valor` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproduto`
--

LOCK TABLES `tipoproduto` WRITE;
/*!40000 ALTER TABLE `tipoproduto` DISABLE KEYS */;
INSERT INTO `tipoproduto` VALUES (1,'Cobertura de Casamento',4,1000),(2,'Ensaio em Estudio',4,800),(3,'Ensaio Externo',4,600);
/*!40000 ALTER TABLE `tipoproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nomesistema` varchar(50) NOT NULL,
  `senha` char(32) NOT NULL,
  `admin` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nomesistema` (`nomesistema`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'proprietario','053a9f9859abbe8b7651ecfed783d41b',1),(2,'secretario','053a9f9859abbe8b7651ecfed783d41b',0),(4,'alynegoncalves','3355b882c84de834bfd36d0cc3da7bff',1),(5,'HudsonRikelme','bbcd79a8931377a8209323f3ce5ad52b',1),(6,'ramonsouza','26a4f915c6bfc5f2b508f56775c4a206',0),(8,'administrador','da95f0757b3e21c1d0617a5d16fdd361',1),(11,'rainejosefa','52565d96f93ee81ddfee064a9d41c37f',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-08 12:54:15
