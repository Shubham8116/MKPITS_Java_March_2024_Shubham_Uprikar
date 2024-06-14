# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .

### Problem 1:
#**Find the total number of films in the database.**
select count(film_id) from film;


### Problem 2:
#**Find the average rental rate of all films.**
select avg(rental_rate) from film;


### Problem 3:
#**Find the total number of rentals made.**
select count(rental_id) from rental;


### Problem 4:
#**Find the highest replacement cost of any film.**
select max(replacement_cost) from film;


### Problem 5:
#**Find the total revenue generated from rentals.**
select sum(amount)from payment;


### Problem 6:
#**Find the average length of films.**
select avg(length) from film;



### Problem 7:
#**Find the minimum rental duration among all films.**
select min(rental_duration) from film;



### Problem 8:
#**Find the total number of distinct customer IDs in the rental table.**
select count(distinct customer_id) from rental;


### Problem 9:
#**Find the average payment amount made by customers.**
select avg(amount) from payment;



### Problem 10:
#**Find the total number of inventory items available.**
select count(inventory_id) from inventory;


### Problem 11:
#**Find the total number of distinct films rented.**
select count(distinct title) from film;



### Problem 12:
#**Find the highest payment amount made by any customer.**
select max(amount) from payment;



### Problem 13:
#**Find the average length of films that have a rating of 'PG'.**
select avg(length) from film where rating='PG';


### Problem 14:
#**Find the total number of payments made in May 2005.**
select count(payment_id) from payment where payment_date between '2005-05-01 00:00:00' and '2005-05-31 23:59:59';



### Problem 15:
#**Find the total number of films with a rental duration of 7 days.**
select count(film_id) from film where rental_duration=7;


### Problem 16:
#**Find the average replacement cost of films with a rental rate of 2.99.**
select avg(replacement_cost) from film where rental_rate=2.99;

