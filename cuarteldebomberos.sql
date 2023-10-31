-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2023 a las 23:50:10
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cuarteldebomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `idBombero` int(11) NOT NULL,
  `dni` int(8) NOT NULL,
  `nombreApellido` varchar(60) NOT NULL,
  `fechaNac` date NOT NULL,
  `celular` int(15) NOT NULL,
  `codigoBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(4) NOT NULL,
  `grupoSanguineo` varchar(8) NOT NULL,
  `codigoCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`idBombero`, `dni`, `nombreApellido`, `fechaNac`, `celular`, `codigoBrigada`, `estado`, `grupoSanguineo`, `codigoCuartel`) VALUES
(3, 25896314, 'Anibal Gimenez', '1980-03-15', 1125896325, 1, 1, 'AB+', 1),
(4, 23456781, 'Nahuel Martinez', '1880-04-16', 1125896325, 2, 1, '0+', 2),
(5, 66889922, 'Juan Perez', '2000-10-10', 1188226655, 5, 1, 'A +', 1),
(6, 21252624, 'Pablo Minetto', '2003-11-19', 1199225566, 4, 1, 'B +', 1),
(7, 11111111, 'Maria Gutierrez', '1994-10-13', 1122222222, 2, 1, '0 +', 1),
(13, 22222222, 'Andres Mendia', '1990-01-10', 1111111111, 2, 1, 'A +', 2),
(14, 22222223, 'Marta Martinez', '1995-02-10', 1133333333, 4, 1, 'B +', 3),
(15, 44444444, 'Antonio Mendez', '2000-10-20', 1144444444, 1, 1, 'A+', 1),
(19, 44115522, 'Mariano Alcaraz', '1997-06-12', 1145454545, 1, 1, 'A+', 1),
(20, 25258258, 'Martina Gimenez', '2000-09-22', 1132323232, 1, 1, 'B+', 1),
(21, 22998877, 'Cristian Polli', '1993-12-15', 1122668877, 1, 1, 'A+', 1),
(22, 22998866, 'Carmen Chavez', '1988-04-14', 1199887744, 11, 0, 'A-', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codigoBrigada` int(11) NOT NULL,
  `nombreBrigada` varchar(20) NOT NULL,
  `especialidad` varchar(80) NOT NULL,
  `libre` tinyint(4) NOT NULL,
  `numeroCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codigoBrigada`, `nombreBrigada`, `especialidad`, `libre`, `numeroCuartel`) VALUES
(1, 'Alfa 1', 'incendios en viviendas e industrias', 1, 1),
(2, 'Alfa 2', 'incendios en viviendas e industrias', 1, 2),
(4, 'Gamma 1', 'salvamento en derrumbes', 1, 1),
(5, 'Delta 1', 'rescate de personas', 1, 1),
(6, 'Alfa 3', 'incendios en viviendas e industrias', 1, 3),
(7, 'alfa 7', 'incendios en viviendas e industrias', 1, 7),
(8, 'Alfa 4', 'incendios en viviendas e industrias', 1, 4),
(9, 'Alfa 5', 'incendios en viviendas e industrias', 1, 5),
(10, 'Alfa 6', 'incendios en viviendas e industrias', 1, 6),
(11, 'Gamma 2', 'salvamento en derrumbes', 1, 2),
(12, 'Gamma 3', 'salvamento en derrumbes', 1, 3),
(13, 'Gamma 4', 'salvamento en derrumbes', 1, 4),
(14, 'Gamma 5', 'salvamento en derrumbes', 1, 5),
(15, 'gamma 6', 'salvamento en derrumbes', 1, 6),
(16, 'gamma 7', 'salvamento en derrumbes', 1, 7),
(17, 'Delta 2', 'rescate de personas', 1, 2),
(18, 'Delta 3', 'rescate de personas', 1, 3),
(19, 'Delta 4', 'rescate de personas', 1, 4),
(20, 'Delta 5', 'rescate de personas', 1, 5),
(21, 'Delta 6', 'rescate de personas', 1, 6),
(22, 'Delta 7', 'rescate de personas', 1, 7),
(24, 'beta 1', 'operativos de prevención.', 1, 1),
(28, 'beta2', 'operativos de prevención', 1, 2),
(29, 'beta3', 'operativos de prevención', 1, 3),
(30, 'beta 5', 'operativos de prevención', 1, 5),
(31, 'beta5', 'operativos de prevención', 1, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codigoCuartel` int(11) NOT NULL,
  `nombreCuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coordenadaX` int(11) NOT NULL,
  `coordenadaY` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codigoCuartel`, `nombreCuartel`, `direccion`, `coordenadaX`, `coordenadaY`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel1', 'Calle 1', 1, 1, '1185986545', 'cuartel1@gmail.com', 1),
(2, 'Cuartel2', 'Calle 2', 4, 5, '1146668951', 'cuartel2@gmail.com', 1),
(3, 'Cuartel3', 'Calle 3', -3, 4, '1145896325', 'cuartel3@gmail.com', 1),
(4, 'Cuartel4', 'Calle 4', 3, -5, '1144444444', 'cuartel4@gmail.com', 1),
(5, 'Cuartel5', 'Calle 5', -5, -5, '1155555555', 'cuartel5@gmail.com', 1),
(6, 'Cuartel6', 'Calle 6', 6, -6, '1166666666', 'cuartel6@gmail.com', 1),
(7, 'Cuartel7', 'Calle 7', -7, -6, '1177777777', 'cuartel7@gmail.com', 0),
(10, 'Cuartel 8', 'Calle 8', 4, -2, '1188888888', 'cuartel8@gmail.com', 0),
(14, 'Cuartel 9', 'Calle 9', -5, -2, '11999999', 'cuartel9@gmail.com', 1),
(16, 'Cuartel10', 'Calle 10', 3, -4, '1111001100', 'cuartel10@gmail.com', 1),
(18, 'Cuartel11', 'Calle 11', 5, 9, '1111111100', 'cuartel11@gmail.com', 1),
(22, 'Cuartel22', 'Salta 451', -1, 5, '1145896325', 'cuartel3@gmail.com', 1),
(23, 'Cuartel13', 'Calle 13', -8, -6, '1113131313', 'cuartel13@gmail.com', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigoSiniestro` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fechaSiniestro` date NOT NULL,
  `coordenadaX` int(11) NOT NULL,
  `coordenadaY` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fechaResol` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codigoBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigoSiniestro`, `tipo`, `fechaSiniestro`, `coordenadaX`, `coordenadaY`, `detalles`, `fechaResol`, `puntuacion`, `codigoBrigada`) VALUES
(13, 'incendios en viviend', '2023-10-26', 1, 1, 'fuego en vivienda familiar', '2023-10-27', 9, 1),
(14, 'incendios en viviend', '2023-10-22', 5, -5, 'se quemo', '2023-10-25', 9, 8),
(15, 'salvamento en derrum', '2023-10-23', 5, -5, 'se cayo', '2023-10-26', 9, 13),
(16, 'salvamento en derrum', '2023-10-22', 8, 9, 'se cayo otra vez', '2023-10-26', 9, 11),
(17, 'salvamento en derrum', '2023-10-24', 2, 3, '', '2023-10-26', 5, 4),
(19, 'salvamento en derrum', '2023-10-26', 1, 5, 'rompio', '2023-10-27', 9, 12),
(20, 'incendios en viviend', '2023-10-26', 5, 6, 'hola', '2023-10-27', 9, 2),
(21, 'salvamento en derrum', '2023-10-26', 5, 6, 'se cayo', '2023-10-27', 8, 11),
(22, 'incendios en viviend', '2023-10-27', 5, -9, 'fuegoooo', '2023-10-27', 9, 10),
(23, 'rescate de personas', '2023-10-27', -1, -3, '', '2023-10-27', 5, 5),
(24, 'salvamento en derrum', '2023-10-27', 5, -3, '', '2023-10-27', 9, 13),
(25, 'incendios en viviend', '2023-10-29', 5, 3, 'fuego', '2023-10-29', 5, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`idBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codigoBrigada` (`codigoBrigada`),
  ADD KEY `codigoCuartel` (`codigoCuartel`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codigoBrigada`),
  ADD KEY `numeroCuartel` (`numeroCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codigoCuartel`),
  ADD UNIQUE KEY `nombreCuartel` (`nombreCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigoSiniestro`),
  ADD KEY `codigoBrigada` (`codigoBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codigoBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codigoCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigoSiniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codigoBrigada`) REFERENCES `brigada` (`codigoBrigada`),
  ADD CONSTRAINT `bombero_ibfk_2` FOREIGN KEY (`codigoCuartel`) REFERENCES `cuartel` (`codigoCuartel`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`numeroCuartel`) REFERENCES `cuartel` (`codigoCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codigoBrigada`) REFERENCES `brigada` (`codigoBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
