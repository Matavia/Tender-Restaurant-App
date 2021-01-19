-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:
SELECT * FROM payment WHERE payment_id = 16666;

-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table
SELECT * FROM payment
JOIN customer ON payment.customer_id = customer.customer_id
WHERE payment.payment_id = 16666;

-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:
SELECT c.first_name, c.last_name, p.* 
FROM payment AS p
JOIN customer AS c on p.customer_id = c.customer_id
WHERE p.payment_id = 16666;
-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.
SELECT c.first_name, c.last_name, p.*, r.return_date
FROM payment AS p
JOIN customer AS c on p.customer_id = c.customer_id
JOIN rental AS r ON p.rental_id = r.rental_id
WHERE p.payment_id = 16666;
-- What did they rent? Film id can be gotten through inventory.
SELECT c.first_name, c.last_name, p.*, r.return_date
FROM payment AS p
JOIN customer AS c on p.customer_id = c.customer_id
JOIN rental AS r ON p.rental_id = r.rental_id
JOIN inventory AS inv ON r.inventory_id
WHERE p.payment_id = 16666;

-- What if we wanted to know who acted in that film?

-- What if we wanted a list of all the films and their categories ordered by film title

-- Show all the 'Comedy' films ordered by film title

-- Finally, let's count the number of films under each category

-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.

-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:

-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates
--if the colmn names match(can use alias to make them match - can throw union keyword in between
-- can use literal strings to show where things come from
SELECT first_name
FROM actor
UNION
SELECT first_name
FROM customer;

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
