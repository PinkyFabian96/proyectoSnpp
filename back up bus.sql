/*
SQLyog Community v12.4.0 (32 bit)
MySQL - 5.0.45-community-nt-log : Database - bus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bus` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bus`;

/*Table structure for table `bus` */

DROP TABLE IF EXISTS `bus`;

CREATE TABLE `bus` (
  `codCoche` int(11) NOT NULL auto_increment,
  `tipo` varchar(45) default NULL,
  `cantidadAsiento` varchar(45) default NULL,
  `anhoFabricacion` int(11) NOT NULL,
  `nroChapa` varchar(45) NOT NULL,
  `chasis` varchar(100) NOT NULL,
  `Marca_codMarca` int(11) NOT NULL,
  PRIMARY KEY  (`codCoche`),
  KEY `fk_bus_Marca1_idx` (`Marca_codMarca`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `bus` */

insert  into `bus`(`codCoche`,`tipo`,`cantidadAsiento`,`anhoFabricacion`,`nroChapa`,`chasis`,`Marca_codMarca`) values 
(1,'convencional','37',2005,'Bus195','9PAACBBJ0HA001212',50),
(2,'DIFERENCIAL','45',1999,'bus123','lalalalala78',2),
(5,'convencional','25',2009,'hec654','sfdsfdwef753',51),
(10,'comun','52',2001,'bus159','jejeje753',3);

/*Table structure for table `chofer` */

DROP TABLE IF EXISTS `chofer`;

CREATE TABLE `chofer` (
  `persona_ci` int(11) NOT NULL,
  `antiguedad` date NOT NULL,
  `estadoCivil` int(15) default NULL,
  `tipoSangre` int(5) NOT NULL,
  `registro` varchar(45) NOT NULL,
  PRIMARY KEY  (`persona_ci`),
  KEY `fk_chofer_persona1_idx` (`persona_ci`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `chofer` */

insert  into `chofer`(`persona_ci`,`antiguedad`,`estadoCivil`,`tipoSangre`,`registro`) values 
(3,'2015-02-03',2,4,'Profesional A'),
(2,'2018-02-01',5,1,'Profesional B Apertura');

/*Table structure for table `choferrendicion` */

DROP TABLE IF EXISTS `choferrendicion`;

CREATE TABLE `choferrendicion` (
  `saldoNeto` int(11) default NULL,
  `sueldoChofer` int(11) default NULL,
  `fecha` date default NULL,
  `recaudacionBoleto` int(45) default NULL,
  `rendicion_idRendicion` int(11) NOT NULL,
  `chofer_persona_ci` int(11) NOT NULL,
  KEY `fk_choferRendicion_rendicion1_idx` (`rendicion_idRendicion`),
  KEY `fk_choferRendicion_chofer1_idx` (`chofer_persona_ci`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `choferrendicion` */

insert  into `choferrendicion`(`saldoNeto`,`sueldoChofer`,`fecha`,`recaudacionBoleto`,`rendicion_idRendicion`,`chofer_persona_ci`) values 
(800000,150000,'2018-09-02',1500000,1,3),
(70000,120000,'2018-10-04',1500000,2,3);

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `persona_ci` int(11) NOT NULL,
  `cargo` varchar(45) default NULL,
  `funcion` varchar(45) default NULL,
  PRIMARY KEY  (`persona_ci`),
  KEY `fk_funcionario_persona1_idx` (`persona_ci`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `funcionario` */

insert  into `funcionario`(`persona_ci`,`cargo`,`funcion`) values 
(10,'gerente','gerencia administrativa');

/*Table structure for table `gasto` */

DROP TABLE IF EXISTS `gasto`;

CREATE TABLE `gasto` (
  `codGasto` int(11) NOT NULL auto_increment,
  `gastoAdminstrativo` int(11) default '160000',
  `gastoVarios` int(11) default NULL,
  `descripcion` varchar(45) default NULL,
  PRIMARY KEY  (`codGasto`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `gasto` */

insert  into `gasto`(`codGasto`,`gastoAdminstrativo`,`gastoVarios`,`descripcion`) values 
(3,160000,0,'concepto por explotacion del servicio'),
(4,160000,20000,'concepto por explotacion del servicio y llega'),
(5,160000,10000,'concepto por alquiler de la linea y llegada t'),
(6,160000,5000,'alquiler del servicio y llegada tardia');

/*Table structure for table `marca` */

DROP TABLE IF EXISTS `marca`;

CREATE TABLE `marca` (
  `codMarca` int(11) NOT NULL auto_increment,
  `carroceria` varchar(45) default NULL,
  `descripcion` varchar(200) default NULL,
  `marcaMotor` varchar(45) default NULL,
  PRIMARY KEY  (`codMarca`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*Data for the table `marca` */

insert  into `marca`(`codMarca`,`carroceria`,`descripcion`,`marcaMotor`) values 
(1,'caio','brasilero','agrale'),
(2,'Marcopolo','afewfe','mercedes benz'),
(3,'Neobus','carroceria de procedencia brasilera','iveco'),
(50,'ciferal','lalala','volvo'),
(51,'zhontong','chino','cumnis');

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `ci` int(11) NOT NULL,
  `nombre` varchar(45) default NULL,
  `apellido` varchar(45) default NULL,
  `telefono` varchar(45) default NULL,
  `direccion` varchar(400) default NULL,
  `genero` int(1) default NULL,
  `estado` int(1) default '1',
  `funcionario` int(1) default '0',
  `chofer` int(1) default '0',
  PRIMARY KEY  (`ci`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `persona` */

insert  into `persona`(`ci`,`nombre`,`apellido`,`telefono`,`direccion`,`genero`,`estado`,`funcionario`,`chofer`) values 
(3,'herector','torres','asuncion','hets',1,1,0,1),
(10,'zulma fleitas','456','852','itaugua',2,1,0,0),
(4651,'ehea','hrea','ehr','rheeah',1,1,0,0),
(51514,'qqqq','8949','33','985',0,1,0,0),
(75369,'Leon','nar','0985654789','ijwgvikwvwg',1,1,0,0),
(357854,'no sabe','no responde','45632159','San ',1,1,0,0),
(4934224,'Hector','Torres','0991897401','Marcelo Onieva Tte Pino Gonzalez',1,1,0,1);

/*Table structure for table `rendicion` */

DROP TABLE IF EXISTS `rendicion`;

CREATE TABLE `rendicion` (
  `idRendicion` int(11) NOT NULL auto_increment,
  `fecha` date NOT NULL,
  `recaudacionChofer` int(11) NOT NULL,
  `gastoGasoil` int(11) default NULL,
  `inicioBoleto` int(11) default NULL,
  `finBoleto` int(11) default NULL,
  `totalRedondo` int(11) NOT NULL,
  `usuario_codUsuario` int(11) NOT NULL,
  `Gasto_codGasto` int(11) NOT NULL,
  `bus_codCoche` int(11) NOT NULL,
  PRIMARY KEY  (`idRendicion`),
  KEY `fk_rendicion_usuario1_idx` (`usuario_codUsuario`),
  KEY `fk_rendicion_Gasto1_idx` (`Gasto_codGasto`),
  KEY `fk_rendicion_bus1_idx` (`bus_codCoche`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `rendicion` */

insert  into `rendicion`(`idRendicion`,`fecha`,`recaudacionChofer`,`gastoGasoil`,`inicioBoleto`,`finBoleto`,`totalRedondo`,`usuario_codUsuario`,`Gasto_codGasto`,`bus_codCoche`) values 
(1,'2018-09-03',1000000,200000,58469,58705,4,1,5,5),
(2,'2018-09-13',950000,150000,45698,45896,3,1,6,10);

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codUsuario` int(11) NOT NULL auto_increment,
  `usuario` varchar(45) default NULL,
  `contasenha` varchar(45) default NULL,
  `categoria` varchar(45) default NULL,
  `funcionario_persona_ci` int(11) NOT NULL,
  PRIMARY KEY  (`codUsuario`),
  KEY `fk_usuario_funcionario1_idx` (`funcionario_persona_ci`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `usuario` */

insert  into `usuario`(`codUsuario`,`usuario`,`contasenha`,`categoria`,`funcionario_persona_ci`) values 
(1,'lao.leo','456','administrador',10);

/* Trigger structure for table `choferrendicion` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `insertarFechaChoferRendicion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `insertarFechaChoferRendicion` BEFORE INSERT ON `choferrendicion` FOR EACH ROW SET new.fecha=CURDATE() */$$


DELIMITER ;

/* Trigger structure for table `rendicion` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `insertarFechaRendicion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `insertarFechaRendicion` BEFORE INSERT ON `rendicion` FOR EACH ROW SET new.fecha=CURDATE() */$$


DELIMITER ;

/* Procedure structure for procedure `pInsertarPersona` */

/*!50003 DROP PROCEDURE IF EXISTS  `pInsertarPersona` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `pInsertarPersona`(in pCi int, in pNombre varchar(20),
in pApellido varchar(20), in pTelefono varchar(20),in pDireccion varchar(400),in pGenero int)
begin
insert into persona 
	(ci,nombre, apellido, telefono, direccion, genero)
	values(pCi,pNombre, pApellido,pTelefono,pDireccion,pGenero);
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
