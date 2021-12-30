-- 3. feladat - találmánynevek, amikben szerepel a motor szó
select talnev from talalmany where talnev like '%motor%';

-- 4. feladat
select t.talnev, ko.nev from talalmany as t join kapcsol as k on t.tkod = k.tkod join kutato as ko on ko.fkod = k.fkod where ko.nev = 'Forgó László';

-- 5. feladat
select ku.nev as 'Golyóstoll feltalálója', (ku.meghal - ku.szul) as 'Élt évek száma' from kutato as ku join kapcsol as k on ku.fkod = k.fkod join talalmany as t on k.tkod = t.tkod where t.talnev = 'golyóstoll';

-- 6. feladat
select talalmany.tkod, talalmany.talnev from talalmany left join kapcsol on talalmany.tkod = kapcsol.tkod where kapcsol.fkod is null;

-- 7. feladat
select ku.nev, t.talnev from kutato as ku join kapcsol as k on ku.fkod = k.fkod join talalmany as t on t.tkod = k.tkod where (ku.szul < 1800 and ku.meghal > 1800) or ku.szul between 1800 and 1850;

-- 8. feladat
select ku.nev, concat(cast(count(k.tkod) AS CHAR), ' darab') as Találmányok from kutato as ku join kapcsol as k on ku.fkod = k.fkod join talalmany as t on t.tkod = k.tkod group by ku.nev having Találmányok > 3;

-- 9. feladat Andris megoldás
select distinct t.talnev from kutato as ku 
	join kapcsol as k on ku.fkod = k.fkod 
    join talalmany as t on t.tkod = k.tkod 
where t.talnev not like 'transzformátor' and ku.nev in 
(select ku.nev from kutato as ku 
	join kapcsol as k on ku.fkod = k.fkod 
    join talalmany as t on t.tkod = k.tkod 
where t.talnev =
(select t.talnev from kutato as ku 
	join kapcsol as k on ku.fkod = k.fkod 
    join talalmany as t on t.tkod = k.tkod
where t.talnev like 'transzformátor' limit 1));

-- 9. feladat Marcsi megoldás
select tal.talnev from talalmany tal 
join kapcsol kapcs on tal.tkod = kapcs.tkod
 join kutato kut on kapcs.tkod = tal.tkod 
 where tal.talnev not like 'transzformátor' and kapcs.fkod in 
(select kut.fkod from kutato kut 
join kapcsol kapcs on kut.fkod = kapcs.fkod
 join talalmany tal on kapcs.tkod = tal.tkod 
 where tal.talnev like 'transzformátor'
 group by kut.fkod)
 group by talnev;
 
 -- 10. feladat