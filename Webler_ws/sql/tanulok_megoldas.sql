use tanulok;
-- e. Listázzuk ki az összes diák minden adatát a táblában!
SELECT * FROM tanulok.diakok;
-- f. Listázzuk ki a lányok nevét, születési dátumát és email-címét!
SELECT concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", szul_datum as "Születése dátum", email as "E-mail" FROM diakok WHERE neme = 0;
-- g. Listázzuk ki azokat a diákokat, akinek nincs kitöltve az email-címe!
SELECT * FROM diakok where email is NULL OR email LIKE "";
-- h. Kinek van freemail-es emailcíme? (Válaszban: teljes név, email)
SELECT concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", email FROM diakok WHERE email LIKE "%freemail.hu";
-- i. Ki a legfiatalabb diák? (Megjelenítésnél: Teljes név, osztály, neme, születési dátuma)
SELECT concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", neptun_kod, neme, szul_datum FROM diakok ORDER BY szul_datum desc LIMIT 1;
-- j. Hány fiút tartalmaz a tábla?
SELECT count(id) as "Ennyi fiu van" FROM diakok WHERE neme = 1;
-- k. Átlagosan mennyi a tandíjhátralék?
SELECT avg(tandij_hatralek) as "Átlagos tandíjhátralék" FROM diakok;
-- l. Listázzuk a budapesti fiuk minden adatát!
SELECT id, concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", neptun_kod, szul_datum, szul_hely, ir_szam, lakcim, lakcim_varos, email, neme, allapot, tandij_hatralek FROM diakok WHERE neme = 1 AND lakcim_varos LIKE "Budapest";
-- m. Mennyi az összes tandíjhátralék a számított mező neve legyen „Összes tandíjhátralék”!
SELECT sum(tandij_hatralek) as "Össze tandíjhátralék" FROM diakok;
-- n. Listázzuk a vidéki lányok közül a 1985-01-01 és 1990-01-01 között születetteket!
SELECT concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", lakcim_varos, neme FROM diakok WHERE neme = 0 AND lakcim_varos NOT LIKE "Budapest" AND szul_datum BETWEEN "1985-01-01" AND "1990-01-01";
-- o. Melyik diákoknak nincsen tandíj hátralékuk?
SELECT concat_ws(' ', vezetek_nev, kereszt_nev) as "Teljes név", tandij_hatralek FROM diakok WHERE tandij_hatralek = 0;
-- p. Írjuk ki az összes adatot kor szerint csökkenőben!
SELECT * FROM diakok ORDER BY szul_datum;
-- q. Írjuk ki a diák vezetéknevét, keresztnevét, neptunkódját és tandíjhátralékát, utolsó szerint növekvőbe!
SELECT vezetek_nev, kereszt_nev, neptun_kod, tandij_hatralek FROM diakok ORDER BY 4;
-- r. Születési helyenként hány diák van az adatbázisban?
SELECT szul_hely, count(id) as "Ennyi fő" FROM diakok GROUP BY szul_hely; 
-- s. Töröljünk egy adott Id-val rendelkező rekordot!
DELETE FROM `tanulok`.`diakok` WHERE id = 3;
-- t. Frissítsünk egy adott Id-val rendelkező rekordot!
UPDATE `tanulok`.`diakok` SET `tandij_hatralek` = '85000' WHERE (`id` = '10');
