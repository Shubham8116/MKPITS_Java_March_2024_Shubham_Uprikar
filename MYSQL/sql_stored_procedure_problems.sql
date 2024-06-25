# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .


#1. **Retrieve Actor Information by Last Name**:
 #  Write a procedure that accepts an actor's last name as input and returns a list of all actors with that last name, including their first name, last name, and actor ID.

DELIMITER $$
CREATE PROCEDURE actor_with_name (in actor char(30))
BEGIN
select actor_id,first_name,last_name from actor where last_name=actor;
END $$ 
DELIMITER;

call actor_with_name('penelope');
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#2. **List Films by Category**:
 #  Create a procedure that takes a category name as input and returns all films in that category, including film title, description, release year, and rating.

DELIMITER $$
CREATE PROCEDURE FILM_DETAIL_CATEGORY (in CATEGORY char(30))
BEGIN
SELECT FC.CATEGORY_ID AS ID,CA.NAME AS CATEGORY,F.TITLE,F.DESCRIPTION,F.RELEASE_YEAR,F.RATING FROM 
CATEGORY CA JOIN FILM_CATEGORY FC ON CA.CATEGORY_ID=FC.CATEGORY_ID JOIN
FILM F ON FC.FILM_ID=F.FILM_ID
GROUP BY ID
HAVING CA.NAME=CATEGORY;
END $$  

call FILM_DETAIL_CATEGORY('Action');
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#3. **Calculate Total Payment by Customer**:
 #  Develop a procedure that accepts a customer ID and returns the total amount paid by that customer. The result should include the customer ID, first name, last name, and total payment amount.
DELIMITER $$
CREATE PROCEDURE CUSTOMER_TOTAL_AMOUNT (in CUSTOMERID CHAR(10))
BEGIN
SELECT C.CUSTOMER_ID, C.FIRST_NAME,C.LAST_NAME,SUM(P.AMOUNT) AS TOTAL_AMOUNT  FROM CUSTOMER C
JOIN PAYMENT P ON C.CUSTOMER_ID = P.CUSTOMER_ID
GROUP BY C.FIRST_NAME
HAVING C.CUSTOMER_ID=CUSTOMERID;
END $$ 
CALL CUSTOMER_TOTAL_AMOUNT('2');


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#4. **Count Rentals by Date Range**:
 #  Implement a procedure that accepts a start date and an end date and returns the number of rentals made within that date range. Include the rental ID and rental date in the results.

DELIMITER $$
CREATE PROCEDURE RENTAL_BETWEEN (in START_DATE char(30),in END_DATE char(30))
BEGIN
SELECT RENTAL_ID,RENTAL_DATE FROM RENTAL WHERE RENTAL_DATE BETWEEN START_DATE AND END_DATE;
END $$ 

CALL RENTAL_BETWEEN('2005-05-24 22:53:30','2005-05-26 10:15:23');

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#5. **Update Film Rental Rate**:
 #  Write a procedure to update the rental rate of a specific film. The procedure should accept the film ID and the new rental rate as inputs and then update the rental rate for that film in the database. Return the film ID, old rental rate, and new rental rate as output.

DELIMITER $$
CREATE PROCEDURE UPDATE_RENTAL_RATE (in FILMID INT,IN RENTALRATE INT)
BEGIN
UPDATE FILM SET RENTAL_RATE=RENTALRATE WHERE FILM_ID=FILMID;
SELECT * FROM FILM WHERE FILM_ID=FILMID;
END $$ 

CALL UPDATE_RENTAL_RATE(2,9.00)
