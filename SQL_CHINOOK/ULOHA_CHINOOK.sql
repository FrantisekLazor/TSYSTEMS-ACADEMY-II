--Ulohy nad databazou chinook:
--1.Vyberte mená všetkých umelcov (artist) a názvy všetkých ich albumov.

SELECT name, title 
FROM artist e 
JOIN album f 
ON e.artist_id = f.artist_id 
ORDER BY name;

--2.Vypíšte názvy všetkých albumov skupiny U2. Pre overenie správnosti je ich počet 10.

SELECT title 
FROM album f 
JOIN artist e 
ON e.artist_id = f.artist_id 
WHERE name='U2';

--3.Vypíšte zoznam všetkých videosúborov aj ich video formaty.
---
SELECT * FROM media_type
---

SELECT t.name, mt.name 
FROM track t
JOIN media_type mt
ON t.media_type_id=mt.media_type_id 
WHERE mt.media_type_id = 3


--4.Zobrazte všetky skladby (ich názvy, interpreta, dĺžka trvania v sekundách), ktoré sa nachádzajú v playliste 90’s Music.
--Skladby vypíšte usporiadané podľa ich názvu. Nevypisujte však tie skladby, ktoré nemajú uvedeného skladateľa (stĺpec COMPOSER má hodnotu NULL). 
--Pre overenie správnosti je počet týchto skladieb 1210.

SELECT t.name, composer, milliseconds/1000 AS seconds 
FROM Playlist_Track a 
JOIN Playlist p
ON a.playlist_id = p.playlist_id
JOIN track t
ON a.track_id = t.track_id
WHERE p.name = '90’s Music' AND Composer IS NOT NULL

--5.Zobrazte názvy všetkých albumov, ktoré sú soundtrack-mi (obsahujú aspoň jednu skladbu, ktorej žáner je Soundtrack). 
--Pre overenie správnosti je počet týchto albumov 4.
---
SELECT * FROM genre
---

SELECT DISTINCT title 
FROM album a 
JOIN track t 
ON a.album_id=t.album_id 
WHERE t.genre_id = 10 
ORDER BY title

--6.Zistite mená zákazníkov, ktorí bývajú v rovnakom meste, ako najvyšší zamestnávateľ (ten, ktorý už nad sebou nemá žiadneho nadriadeného).
--Pre overenie správnosti je tento zákazník len jeden.

--zistenie, kde byva najvyssi zamestnavatel
SELECT * FROM employee
--
SELECT c.first_name, c.last_name
FROM customer c 
JOIN employee e 
ON c.customer_id = e.employee_id 
WHERE e.city = 'Edmonton'


--7.Každý zamestnanec má svojho supervisora. Toho najvyššieho rozoznáte podľa toho, že nad sebou už nemá nikoho.
--Vypíšte tých zamestnancov (meno a priezvisko), ktorí sú priamymi podriadenými toho najvyššieho.

--zistenie, kto ma najvyssi status report_to 
SELECT * FROM employee

SELECT first_name, last_name 
FROM employee 
WHERE reports_to=1

--8.Pre overenie správnosti vedzte, že počet týchto zamestnancov je 2.


--9.Zistite, ktorí artisti nevydali ani jeden album. Vypíšte ich mená. Pre overenie správnosti vedzte, že ich počet je 71.

SELECT name 
FROM artist e
FULL JOIN album a 
ON e.artist_id=a.artist_id
WHERE title IS NULL

--10.Vypíšte zoznam všetkých skladieb (ich názvy spolu s názvom skladateľa), ktoré nepatria do playlistu 'Heavy Metal Classic'.
--Pre overenie správnosti je počet týchto skladieb 3477 (všetky skladby - zoznam skladieb playlistu)

--zistenie id plylistu Heavy metal classic
SELECT * FROM playlist

SELECT t.name, composer FROM track t
WHERE t.track_id NOT IN (SELECT track.track_id FROM track
JOIN playlist_track ON track.track_id=playlist_track.track_id
JOIN playlist ON playlist.playlist_id=playlist_track.playlist_id
WHERE playlist.playlist_id=17)

--11.Vypíšte zoznam všetkých zákazníkov, ktorí v roku 2012 nič neobjednali. 
--Výsledný zoznam usporiadajte vzostupne podľa priezviska a mena.
---
SELECT * FROM invoice
SELECT * FROM invoice_line
SELECT * FROM customer
---

SELECT c.first_name, c.last_name 
FROM customer c 
WHERE c.customer_id NOT IN(SELECT c.customer_id FROM customer c 
JOIN invoice i ON c.customer_id=i.customer_id WHERE EXTRACT (YEAR FROM invoice_date) = 2012) 
ORDER BY c.last_name, c.first_name

--12.Pre overenie správnosti vášho riešenia vedzte, že ich je 12.

--13.Zistite meno, priezvisko a dátum narodenia najstaršieho zamestnanca, ktorého má obchod.
---
SELECT * FROM employee
---

SELECT first_name, last_name, birth_date FROM employee 
WHERE birth_date=(SELECT MIN(birth_date) FROM employee)

--14.Ktorý videozáznam (resp. video skladba) je najdlhší? 
--Pre overenie správnosti vedzte, že táto najdlhšia skladba sa volá "Occupation / Precipice".
---
SELECT * FROM track
SELECT * FROM media_type
---

SELECT name, milliseconds/1000 AS seconds 
FROM track 
WHERE milliseconds = (SELECT MAX (milliseconds)FROM track WHERE media_type_id = 3 )

--15.Zistite názov a trvanie v sekundách najdlhšej skladby z albumu War od skupiny U2.
---
SELECT name, millisenconds
---

SELECT name, composer, (milliseconds/1000) AS seconds 
FROM track
WHERE album_id=(SELECT album_id FROM album WHERE title='War')
AND (milliseconds/1000)=((SELECT MAX(milliseconds) FROM track WHERE album_id=(SELECT album_id FROM album WHERE title='War'))/1000)

--16.Pre overenie výsledku vedze, že najdlhšia skladba z albumu War od skupiny U2 je New Year's Day (336 sekúnd).

--17.Vypíšte sumárne zisky z predaja po jednotlivých rokoch.
---
SELECT * FROM invoice
---

SELECT DISTINCT EXTRACT(YEAR FROM invoice_date) AS year, SUM(total) AS total
FROM invoice 
GROUP BY EXTRACT(YEAR FROM invoice_date)
ORDER BY EXTRACT(YEAR FROM invoice_date) ASC

--18.Pre overenie správnosti dopytu viete, že celkový zisk z predaja v roku 2009 bol $449.46. Zisk je stĺpec total.

--19.Vypíšte zisky z predaja podľa jednotlivých krajín za rok 2012. Zoznam zoraďte podľa zisku od najvyšších po najnižšie.
---
SELECT * FROM invoice
---

SELECT DISTINCT billing_country AS country, SUM(total) AS total 
FROM invoice 
GROUP BY billing_country,invoice_date BETWEEN '2012-01-01 00:00:00' AND '2012-12-31 00:00:00'
ORDER BY total DESC

--20.Pre overenie správnosti najvyššie zisky v roku 2012 boli dosiahnuté predajom v USA a najnižšie  v Holandsku.

--21.Aký skladateľ (composer) je najobľúbenejší u zákazníka Wyatta Girarda? (najobľúbenejší - kupoval ho najčastejšie). 
--Pre overenie vedzte, že skladby od trojice Mike Bordin, Billy Gould, Mike Patton si kúpil najviackrát (3x).

SELECT * FROM invoice 
SELECT * FROM invoice_line 
SELECT * FROM track

SELECT MAX(composer) 
FROM track t 
WHERE track_id=(SELECT track_id 
FROM invoice_line
WHERE invoice_id=(SELECT invoice_id FROM invoice
WHERE customer_id=(SELECT customer_id FROM customer WHERE first_name= 'Wyatt' AND last_name = 'Girard')))

--22.Vypíšte zoznam všetkých umelcov v databáze, ktorý vznikne spojením záznamov z tabuľky Artist a Track. 
--Výsledný zoznam usporiadajte podľa abecedy.
--Pre overenie správnosti vášho dopytu bude výsledný zoznam obsahovať 1080 záznamov.

SELECT name FROM artist
UNION
SELECT composer FROM track
WHERE name IS NOT NULL AND composer IS NOT NULL
ORDER BY name

--23.Zistite rozdiel medzi umelcami v tabuľke Artist (stĺpec name) a v tabuľke Track (stĺpec composer).
--Ak teda odčítate od artistov všetkých composerov, počet výsledkov je 228.
SELECT name FROM artist
EXCEPT
SELECT composer FROM track
WHERE name IS NOT NULL AND composer IS NOT NULL
ORDER BY name