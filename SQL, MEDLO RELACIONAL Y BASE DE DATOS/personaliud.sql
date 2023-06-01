-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2023 a las 02:51:17
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
-- Base de datos: `personaliud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `id_estado` int(10) NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`id_estado`, `estado`) VALUES
(1, 'CASADO'),
(2, 'SOLTERO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(10) NOT NULL,
  `id_tidentificacion` int(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `n_identificacion` int(10) NOT NULL,
  `id_estado` int(10) NOT NULL,
  `id_sexo` int(10) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `id_tidentificacion`, `nombre`, `apellido`, `n_identificacion`, `id_estado`, `id_sexo`, `direccion`, `telefono`, `fecha_nacimiento`) VALUES
(7, 2, 'ANYERSON', 'VELASQUEZ', 1007527923, 1, 1, 'CARRERA 71 C CALLE 89 ', '4426240', '2002-01-20'),
(23, 2, 'ANYERSON', 'VELASQUEZ', 4426240, 1, 1, 'CARRERA 71 C', '4426240', '2001-02-03'),
(24, 2, 'eulicer', 'velasquez', 4426240, 2, 1, 'carrera 71 c calle', '4426240', '2001-01-01'),
(25, 2, 'ANYERSON', 'VELASQUEZ', 1007527923, 1, 1, 'CARRERA  C', '4426240', '2002-01-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo_familiar`
--

CREATE TABLE `grupo_familiar` (
  `id_gfamiliar` int(10) NOT NULL,
  `id_funcionario` int(10) DEFAULT NULL,
  `apellido` varchar(100) NOT NULL,
  `rol` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion_academica`
--

CREATE TABLE `informacion_academica` (
  `id_academica` int(10) NOT NULL,
  `id_funcionario` int(10) NOT NULL,
  `id_universidad` int(10) NOT NULL,
  `id_destudio` int(10) NOT NULL,
  `id_testudio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel_estudio`
--

CREATE TABLE `nivel_estudio` (
  `id_destudio` int(10) NOT NULL,
  `nivel_estudio` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexo`
--

CREATE TABLE `sexo` (
  `id_sexo` int(10) NOT NULL,
  `sexo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sexo`
--

INSERT INTO `sexo` (`id_sexo`, `sexo`) VALUES
(1, 'MASCULINO'),
(2, 'FEMENINO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_identificacion`
--

CREATE TABLE `tipo_identificacion` (
  `id_tidentificacion` int(10) NOT NULL,
  `tipo_identificacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_identificacion`
--

INSERT INTO `tipo_identificacion` (`id_tidentificacion`, `tipo_identificacion`) VALUES
(1, 'TI'),
(2, 'CC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titulo_estudio`
--

CREATE TABLE `titulo_estudio` (
  `id_testudio` int(10) NOT NULL,
  `titulo_estudio` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universidad`
--

CREATE TABLE `universidad` (
  `id_universidad` int(10) NOT NULL,
  `universidad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indices de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD KEY `id_sexo` (`id_sexo`),
  ADD KEY `id_estado` (`id_estado`),
  ADD KEY `id_tidentificacion` (`id_tidentificacion`);

--
-- Indices de la tabla `grupo_familiar`
--
ALTER TABLE `grupo_familiar`
  ADD PRIMARY KEY (`id_gfamiliar`),
  ADD KEY `id_funcionario` (`id_funcionario`);

--
-- Indices de la tabla `informacion_academica`
--
ALTER TABLE `informacion_academica`
  ADD PRIMARY KEY (`id_academica`),
  ADD KEY `fk_id_funcionario` (`id_funcionario`),
  ADD KEY `fk_universidad` (`id_universidad`),
  ADD KEY `fk_destudio` (`id_destudio`),
  ADD KEY `fk_testudio` (`id_testudio`);

--
-- Indices de la tabla `nivel_estudio`
--
ALTER TABLE `nivel_estudio`
  ADD PRIMARY KEY (`id_destudio`);

--
-- Indices de la tabla `sexo`
--
ALTER TABLE `sexo`
  ADD PRIMARY KEY (`id_sexo`);

--
-- Indices de la tabla `tipo_identificacion`
--
ALTER TABLE `tipo_identificacion`
  ADD PRIMARY KEY (`id_tidentificacion`);

--
-- Indices de la tabla `titulo_estudio`
--
ALTER TABLE `titulo_estudio`
  ADD PRIMARY KEY (`id_testudio`);

--
-- Indices de la tabla `universidad`
--
ALTER TABLE `universidad`
  ADD PRIMARY KEY (`id_universidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `id_estado` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `grupo_familiar`
--
ALTER TABLE `grupo_familiar`
  MODIFY `id_gfamiliar` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `informacion_academica`
--
ALTER TABLE `informacion_academica`
  MODIFY `id_academica` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sexo`
--
ALTER TABLE `sexo`
  MODIFY `id_sexo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_identificacion`
--
ALTER TABLE `tipo_identificacion`
  MODIFY `id_tidentificacion` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`id_sexo`) REFERENCES `sexo` (`id_sexo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id_estado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `funcionario_ibfk_3` FOREIGN KEY (`id_tidentificacion`) REFERENCES `tipo_identificacion` (`id_tidentificacion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `grupo_familiar`
--
ALTER TABLE `grupo_familiar`
  ADD CONSTRAINT `grupo_familiar_ibfk_1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_funcionario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `informacion_academica`
--
ALTER TABLE `informacion_academica`
  ADD CONSTRAINT `fk_destudio` FOREIGN KEY (`id_destudio`) REFERENCES `nivel_estudio` (`id_destudio`),
  ADD CONSTRAINT `fk_testudio` FOREIGN KEY (`id_testudio`) REFERENCES `titulo_estudio` (`id_testudio`),
  ADD CONSTRAINT `fk_universidad` FOREIGN KEY (`id_universidad`) REFERENCES `universidad` (`id_universidad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
