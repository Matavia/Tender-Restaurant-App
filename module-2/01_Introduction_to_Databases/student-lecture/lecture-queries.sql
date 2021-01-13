-- SELECT ... FROM
-- Selecting the names for all countries
SELECT * FROM city WHERE district = 'Idaho';

-- Selecting the name and population of all countries


-- Selecting all columns from the city table


-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio


-- Selecting countries that gained independence in the year 1776
 SELECT * FROM country WHERE indepyear = 1776;


-- Selecting countries not in Asia
SELECT * FROM country WHERE continent <> 'Asia';


-- Selecting countries that do not have an independence year

-- Selecting countries that do have an independence year


-- Selecting countries that have a population greater than 5 million
SELECT * FROM country WHERE population > 500000;

SELECT * FROM city WHERE district = 'Ohio' AND population > 400000;

-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

-- Selecting country names on the continent North America or South America
SELECT name FROM country WHERE continent = 'North America' OR continent = 'South America';
SELECT name FROM country WHERE continent IN ('North America', 'South America');

SELECT name population, lifeexpectancy, surfacearea,
FROM country
WHERE continent = 'Asia';




-- SELECTING DATA w/arithmetic
SELECT name, population, lifeexpectancy, surfacearea, population / surfacearea AS "Population per area"
FROM country
WHERE continent = 'Asia';
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword



