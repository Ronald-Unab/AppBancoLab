CREATE DATABASE  IF NOT EXISTS `appbanco`;
USE `appbanco`;

CREATE TABLE `tipousuario` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `TipoUser` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(45) DEFAULT NULL,
  `PassWord` varchar(500) DEFAULT NULL,
  `tipoUsuario` int DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fkUsuario_idx` (`tipoUsuario`),
  CONSTRAINT `fkUsuario` FOREIGN KEY (`tipoUsuario`) REFERENCES `tipousuario` (`Id`)
) ;


CREATE TABLE `cuentasusuario` (
  `idcuentasusuario` int NOT NULL AUTO_INCREMENT,
  `saldo` decimal(10,2) DEFAULT NULL,
  `idUsuario` int DEFAULT NULL,
  `transaccion` int DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idcuentasusuario`),
  KEY `fkIdUsuario_idx` (`idUsuario`),
  CONSTRAINT `fk` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ;