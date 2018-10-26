--Exercise 8.1

-- a.
SELECT *
FROM Game
ORDER BY time DESC;

-- b.
SELECT *
FROM Game
WHERE time > '2018-10-19 00:00:00';

-- c.
SELECT *
FROM Player
WHERE name IS NOT NULL;

-- d.
SELECT py.name
FROM Player py JOIN PlayerGame pg
	ON py.ID = pg.playerID
WHERE pg.score > 200;

-- e.
SELECT name
FROM Player
WHERE emailaddress = '%@gmail.com';



-- Exercise 8.2

-- a.
SELECT pg.score
FROM PlayerGame pg JOIN Player py
	ON pg.playerID = py.ID
WHERE py.name = 'The King'
ORDER BY pg.score DESC;

-- b.
SELECT name, score
FROM PlayerGame JOIN Player
	ON Player.ID = PlayerGame.PlayerID
ORDER BY score DESC
LIMIT 1;

-- c.
-- The tables are already joined, so the by grabbing the smallest id number, 
-- the DBMS finds the duplicate and finds the original row before the duplication happened.

-- d.
-- It can be used identify and remove duplicates or to groups similar rows.

