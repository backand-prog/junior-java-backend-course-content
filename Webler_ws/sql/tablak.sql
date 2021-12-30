CREATE TABLE `biztositas_tipusok` (
  `kod` int(11) NOT NULL,
  `megnevezes` varchar(150) COLLATE utf8_hungarian_ci DEFAULT NULL,
  PRIMARY KEY (`kod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

CREATE TABLE `szerzodesek` (
  `kod` int(11) NOT NULL,
  `datum` date DEFAULT NULL,
  `ugyfelkod` int(11) DEFAULT NULL,
  `tipuskod` int(11) DEFAULT NULL,
  PRIMARY KEY (`kod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

CREATE TABLE `ugyfelek` (
  `azonosito` int(11) NOT NULL,
  `nev` varchar(50) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `iranyitoszam` int(4) DEFAULT NULL,
  `varos` varchar(50) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `utca` varchar(50) COLLATE utf8_hungarian_ci DEFAULT NULL,
  PRIMARY KEY (`azonosito`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;