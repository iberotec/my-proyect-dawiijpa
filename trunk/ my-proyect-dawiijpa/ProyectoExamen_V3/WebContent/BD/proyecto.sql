-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.18-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema proyecto
--

CREATE DATABASE IF NOT EXISTS proyecto;
USE proyecto;

--
-- Definition of table `tb_examenes_usu`
--

DROP TABLE IF EXISTS `tb_examenes_usu`;
CREATE TABLE `tb_examenes_usu` (
  `codExBD` char(5) NOT NULL,
  `codigo` char(5) NOT NULL,
  `nota` double NOT NULL,
  `buenas` int(10) unsigned NOT NULL,
  `malas` int(10) unsigned NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY  (`codExBD`,`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_examenes_usu`
--

/*!40000 ALTER TABLE `tb_examenes_usu` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_examenes_usu` ENABLE KEYS */;


--
-- Definition of table `tb_res_usu`
--

DROP TABLE IF EXISTS `tb_res_usu`;
CREATE TABLE `tb_res_usu` (
  `codExBD` char(5) NOT NULL,
  `codigo` char(5) NOT NULL,
  `codPR` int(10) unsigned NOT NULL,
  `respuest_1` tinyint(1) NOT NULL,
  `respuest_2` tinyint(1) NOT NULL,
  `respuest_3` tinyint(1) NOT NULL,
  `respuest_4` tinyint(1) NOT NULL,
  `respuest_5` tinyint(1) NOT NULL,
  PRIMARY KEY  (`codExBD`,`codigo`,`codPR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_res_usu`
--

/*!40000 ALTER TABLE `tb_res_usu` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_res_usu` ENABLE KEYS */;


--
-- Definition of table `tbexamen`
--

DROP TABLE IF EXISTS `tbexamen`;
CREATE TABLE `tbexamen` (
  `codExBD` char(5) NOT NULL,
  `nombreBD` varchar(45) default NULL,
  `fechaElabBD` varchar(10) default NULL,
  `codTipoExamen` char(5) default NULL,
  `autorBD` varchar(45) default NULL,
  `codigo` char(5) default NULL,
  PRIMARY KEY  (`codExBD`),
  KEY `codigo` (`codigo`),
  KEY `codTipoExamen` (`codTipoExamen`),
  CONSTRAINT `codigo` FOREIGN KEY (`codigo`) REFERENCES `tbusuario` (`codigo`),
  CONSTRAINT `codTipoExamen` FOREIGN KEY (`codTipoExamen`) REFERENCES `tbtipoexamen` (`codTipoExamen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbexamen`
--

/*!40000 ALTER TABLE `tbexamen` DISABLE KEYS */;
INSERT INTO `tbexamen` (`codExBD`,`nombreBD`,`fechaElabBD`,`codTipoExamen`,`autorBD`,`codigo`) VALUES 
 ('E1000','Test','25/2/2008','T1000','Luis Garcia','u1000'),
 ('E1001','111','07/12/10','T1001','Luis Garcia','u1000'),
 ('E1002','1212','07/12/10','T1002','Luis Garcia','u1000');
/*!40000 ALTER TABLE `tbexamen` ENABLE KEYS */;


--
-- Definition of table `tbhistorialresultado`
--

DROP TABLE IF EXISTS `tbhistorialresultado`;
CREATE TABLE `tbhistorialresultado` (
  `codResultado` char(5) NOT NULL,
  `codigo` char(5) NOT NULL,
  `codExBD` char(5) NOT NULL,
  `acertadas` char(2) default NULL,
  `incorrectas` char(2) default NULL,
  `Nota` char(3) default NULL,
  PRIMARY KEY  (`codResultado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbhistorialresultado`
--

/*!40000 ALTER TABLE `tbhistorialresultado` DISABLE KEYS */;
INSERT INTO `tbhistorialresultado` (`codResultado`,`codigo`,`codExBD`,`acertadas`,`incorrectas`,`Nota`) VALUES 
 ('R1000','u1000','E1000','10','5','362'),
 ('R1001','u1001','E1002','0','3','0'),
 ('R1002','u1001','E1002','0','3','0');
/*!40000 ALTER TABLE `tbhistorialresultado` ENABLE KEYS */;


--
-- Definition of table `tbmensaje`
--

DROP TABLE IF EXISTS `tbmensaje`;
CREATE TABLE `tbmensaje` (
  `codMensaje` char(5) NOT NULL,
  `codigo` char(5) NOT NULL,
  `destinatario` char(15) default NULL,
  `asunto` varchar(100) default NULL,
  `mensaje` varchar(500) default NULL,
  PRIMARY KEY  (`codigo`,`codMensaje`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmensaje`
--

/*!40000 ALTER TABLE `tbmensaje` DISABLE KEYS */;
INSERT INTO `tbmensaje` (`codMensaje`,`codigo`,`destinatario`,`asunto`,`mensaje`) VALUES 
 ('M1000','u1000','Administrador','Datos','HULLAAAA'),
 ('10006','u1001','u1000','123','1232'),
 ('10007','u1001','u1000','er','erere');
/*!40000 ALTER TABLE `tbmensaje` ENABLE KEYS */;


--
-- Definition of table `tbpregres`
--

DROP TABLE IF EXISTS `tbpregres`;
CREATE TABLE `tbpregres` (
  `codPR` int(11) NOT NULL,
  `codResultado` char(5) NOT NULL,
  `preg` varchar(300) default NULL,
  `altR01` varchar(200) default NULL,
  `altR02` varchar(200) default NULL,
  `altR03` varchar(200) default NULL,
  `altR04` varchar(200) default NULL,
  `altR05` varchar(200) default NULL,
  `est01` varchar(45) default NULL,
  `est02` varchar(45) default NULL,
  `est03` varchar(45) default NULL,
  `est04` varchar(45) default NULL,
  `est05` varchar(45) default NULL,
  `est01V` varchar(45) default NULL,
  `est02V` varchar(45) default NULL,
  `est03V` varchar(45) default NULL,
  `est04V` varchar(45) default NULL,
  `est05V` varchar(45) default NULL,
  PRIMARY KEY  (`codPR`,`codResultado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbpregres`
--

/*!40000 ALTER TABLE `tbpregres` DISABLE KEYS */;
INSERT INTO `tbpregres` (`codPR`,`codResultado`,`preg`,`altR01`,`altR02`,`altR03`,`altR04`,`altR05`,`est01`,`est02`,`est03`,`est04`,`est05`,`est01V`,`est02V`,`est03V`,`est04V`,`est05V`) VALUES 
 (1,'R1001','Pregunta 1','111','111','111','11','111','true','true','true','true','true','true','true','false','false','false'),
 (1,'R1002','Pregunta 1','111','111','111','11','111','true','false','false','true','false','true','true','false','false','false'),
 (2,'R1001','22222','222','222','11','111','222','false','true','true','true','false','false','true','false','false','true'),
 (2,'R1002','22222','222','222','11','111','222','true','true','false','true','true','false','true','false','false','true'),
 (3,'R1001','121','121','2121','212','1212','121','true','true','true','true','false','true','true','true','false','false'),
 (3,'R1002','121','121','2121','212','1212','121','false','true','true','true','false','true','true','true','false','false');
/*!40000 ALTER TABLE `tbpregres` ENABLE KEYS */;


--
-- Definition of table `tbpregunta`
--

DROP TABLE IF EXISTS `tbpregunta`;
CREATE TABLE `tbpregunta` (
  `codP` int(11) NOT NULL,
  `codExBD` char(5) NOT NULL,
  `pregBD` varchar(300) default NULL,
  `alter01` varchar(200) default NULL,
  `alter02` varchar(200) default NULL,
  `alter03` varchar(200) default NULL,
  `alter04` varchar(200) default NULL,
  `alter05` varchar(200) default NULL,
  `estado01` varchar(30) default NULL,
  `estado02` varchar(30) default NULL,
  `estado03` varchar(30) default NULL,
  `estado04` varchar(30) default NULL,
  `estado05` varchar(30) default NULL,
  `Tipopreg` char(1) default NULL,
  PRIMARY KEY  (`codP`,`codExBD`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbpregunta`
--

/*!40000 ALTER TABLE `tbpregunta` DISABLE KEYS */;
INSERT INTO `tbpregunta` (`codP`,`codExBD`,`pregBD`,`alter01`,`alter02`,`alter03`,`alter04`,`alter05`,`estado01`,`estado02`,`estado03`,`estado04`,`estado05`,`Tipopreg`) VALUES 
 (1,'E1002','Pregunta 1','111','111','111','11','111','false','false','false','false','true','M'),
 (2,'E1002','22222','222','222','11','111','222','false','false','false','false','true','M'),
 (3,'E1002','121','121','2121','212','1212','121','false','false','false','false','true','M');
/*!40000 ALTER TABLE `tbpregunta` ENABLE KEYS */;


--
-- Definition of table `tbsequence`
--

DROP TABLE IF EXISTS `tbsequence`;
CREATE TABLE `tbsequence` (
  `SEQ_NAME` char(7) NOT NULL,
  `SEQ_COUNT` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsequence`
--

/*!40000 ALTER TABLE `tbsequence` DISABLE KEYS */;
INSERT INTO `tbsequence` (`SEQ_NAME`,`SEQ_COUNT`) VALUES 
 ('MSJ_IDX',10007);
/*!40000 ALTER TABLE `tbsequence` ENABLE KEYS */;


--
-- Definition of table `tbtipoexamen`
--

DROP TABLE IF EXISTS `tbtipoexamen`;
CREATE TABLE `tbtipoexamen` (
  `codTipoExamen` char(5) NOT NULL,
  `descrip` varchar(10) default NULL,
  PRIMARY KEY  (`codTipoExamen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbtipoexamen`
--

/*!40000 ALTER TABLE `tbtipoexamen` DISABLE KEYS */;
INSERT INTO `tbtipoexamen` (`codTipoExamen`,`descrip`) VALUES 
 ('T1000','SCJP'),
 ('T1001','SCJA'),
 ('T1002','SCWCD'),
 ('T1003','SCMAD');
/*!40000 ALTER TABLE `tbtipoexamen` ENABLE KEYS */;


--
-- Definition of table `tbusuario`
--

DROP TABLE IF EXISTS `tbusuario`;
CREATE TABLE `tbusuario` (
  `codigo` char(5) NOT NULL,
  `nombreBD` varchar(45) default NULL,
  `apePatBD` varchar(45) default NULL,
  `apeMatBD` varchar(45) default NULL,
  `DocIdentBD` char(8) default NULL,
  `edadBD` char(2) default NULL,
  `gradoInstrucBD` varchar(45) default NULL,
  `celularBD` char(11) default NULL,
  `emailBD` varchar(45) default NULL,
  `tipoUBD` varchar(20) default NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbusuario`
--

/*!40000 ALTER TABLE `tbusuario` DISABLE KEYS */;
INSERT INTO `tbusuario` (`codigo`,`nombreBD`,`apePatBD`,`apeMatBD`,`DocIdentBD`,`edadBD`,`gradoInstrucBD`,`celularBD`,`emailBD`,`tipoUBD`,`password`) VALUES 
 ('u1000','Luis','Garcia','Paucar','15452524','32','Magister','994653532','luis@gmail.com','Administrador','1234'),
 ('u1001','fabian','geldres','de l carpio','46846501','20','Universitario','3461056','grldres_80@h',NULL,'1234');
/*!40000 ALTER TABLE `tbusuario` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
