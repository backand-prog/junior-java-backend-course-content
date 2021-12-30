-- Megjegyzés: DB létrehozása tanulok néven
CREATE SCHEMA `tanulok` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci ;

-- DB-t kiválasztja  alt+7: backtick
use `tanulok`;

-- diakok tábla létrehozása
CREATE TABLE `tanulok`.`diakok` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `neptun_kod` VARCHAR(45) NOT NULL,
  `kereszt_nev` VARCHAR(100) NOT NULL,
  `vezetek_nev` VARCHAR(100) NOT NULL,
  `szul_datum` DATE NOT NULL,
  `szul_hely` VARCHAR(150) NOT NULL,
  `lakcim_varos` VARCHAR(150) NULL,
  `lakcim` VARCHAR(150) NULL,
  `ir_szam` INT NULL,
  `email` VARCHAR(150) NULL,
  `neme` TINYINT(1) NULL,
  `allapot` TINYINT(1) NULL DEFAULT 1,
  `tandij_hatralek` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `neptun_kod_UNIQUE` (`neptun_kod` ASC));

-- 10 db adat beszurás  
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `lakcim`, `ir_szam`, `email`, `neme`, `tandij_hatralek`) VALUES ('KOKF34', 'Elek', 'Teszt', '1999-01-01', 'Budapest', 'Budapest', 'Fő u. 1.', '1111', 'tesztelek@gmail.com', '1', '85000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `lakcim`, `ir_szam`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('USE3KL', 'Jakab', 'Gipsz', '1997-05-07', 'Debrecen', 'Debrecen', 'Kossuth u. 5.', '4028', 'gipszjakab@freemail.hu', '1', '1', '150000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `ir_szam`, `lakcim`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('POKE34', 'Tamara', 'Kovács', '1977-05-05', 'Debrecen', 'Budapest', '1151', 'Pesti út. 5.', 'kovacstamara@freemail.hu', '0', '1', '150000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `ir_szam`, `lakcim`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('ISFE39', 'Erika', 'Szabó', '1980-06-07', 'Pécs', 'Vác', '2600', 'Lajos u. 6.', 'szaboerika@hotmail.hu', '0', '1', '30000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `ir_szam`, `lakcim`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('POFM33', 'Erik', 'Tóth', '2000-07-08', 'Budapest', 'Budapest', '1157', 'Vág. u. 2', 'totherik@freemail.hu', '1', '1', '0');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `ir_szam`, `lakcim`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('IKMS3F', 'Géza', 'Balogh', '1987-01-08', 'Budapest', 'Vác', '2600', 'Pesti u. 3.', 'baloghgeza@gmail.com', '1', '0', '80000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `ir_szam`, `lakcim`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('KSMF2', 'Zoltan', 'Nagy', '1987-07-01', 'Budapest', 'Budapest', '1111', 'Sándor u.1', '1', '0', '0');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `lakcim`, `ir_szam`, `neme`, `tandij_hatralek`) VALUES ('IUJ345', 'Tamara', 'Kovács', '1990-01-08', 'Budapest', 'Budapest', 'Kossuth u.8.', '1221', '0', '70000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `lakcim`, `ir_szam`, `email`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('OKSER3', 'Olga', 'Nagy', '1988-06-07', 'Debrecen', 'Vác', 'Huba u. 4.', '2600', 'olga876@gmail.com', '0', '0', '99000');
INSERT INTO `tanulok`.`diakok` (`neptun_kod`, `kereszt_nev`, `vezetek_nev`, `szul_datum`, `szul_hely`, `lakcim_varos`, `lakcim`, `ir_szam`, `neme`, `allapot`, `tandij_hatralek`) VALUES ('UJS2E34', 'Tamás', 'Tóth', '1999-09-07', 'Budapest', 'Budapest', 'Ferenc u. 2.', '1112', '1', '1', '0');


