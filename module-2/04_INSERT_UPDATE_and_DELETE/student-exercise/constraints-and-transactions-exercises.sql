-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.



INSERT INTO actor (actor_id,first_name,last_name)
VALUES (201, 'HAMPTON','AVENUE'), (202, 'LISA','BYWAY');                    

--Test
SELECT first_name
FROM actor
WHERE actor_id = 201;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.





INSERT INTO film(title,description,release_year,language_id)
VALUES('EUCLIDEAN PI','The epic story of Euclid as a pizza delivery boy in
-- ancient Greece',2008,1);

UPDATE film set length = 198
WHERE title = 'Euclidean PI';



--Test
SELECT *
FROM film
WHERE film_id = 1003;


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

-- I now know I can do multiple Insert values VALUES (column1,column2),(column 1, calumn2)

INSERT INTO film_actor(film_id,actor_id)
VALUES(1003,201);

INSERT INTO film_actor(film_id,actor_id)
VALUES(1003,202);

--Test 
SELECT *
FROM film_actor
WHERE film_id = 1003;




-- 4. Add Mathmagical to the category table.

INSERT INTO category(category_id, name)
VALUES (17, 'Mathmagical');

--Test 
SELECT name
FROM category
WHERE category_id = 17;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--Searched for film_id
SELECT film_id
FROM film 
WHERE title IN('EGG IGBY','KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

--added Euclidean PI to the film_category table
INSERT INTO film_category(film_id,category_id)
VALUES (1003,17);

--updated film_category table
UPDATE  film_category SET category_id = 17
WHERE film_id IN(274,494,714,996,1003);


--Test 
SELECT film_id
FROM film_category
WHERE category_id = 17;



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

--Search
SELECT *
FROM film
WHERE film_id IN(274,494,714,996,1003);

--Update
Update film SET rating = 'G'
WHERE film_id IN (274,494,714,996,1003);



-- 7. Add a copy of "Euclidean PI" to all the stores.

--SEARCH 
SELECT * 
FROM inventory
WHERE film_id = 1003;

INSERT INTO inventory(film_id,store_id)
VALUES(1003,1),(1003,2);



-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <No, it does not succeed because it the film tied to other information in film_category table - violated foreign key constraint;>
        
        
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <No, it doesnt work because it violates the foreign key constraint as well, the category_id is still referenced in film_category table;>

       -- 

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <Yes, because category_id in the film category table is only a foreign key, and not the main primary key - If it were the primary key it wouldn't work;>
   DELETE FROM film_category
   WHERE category_id=17;
   
   --
   
   

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <Mathmagical succeeded in deleting because there were no links or references to the table, Euclidean PI is still linked so it did not delete from film table>

DELETE FROM category
WHERE name = 'Mathmagical';
-

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
--In order to delete 'Euclideans PI' from the film table,we have to delete the rows that are referencing Euclidean's PI film_id 
-- from the film_actor table and the film_category table
