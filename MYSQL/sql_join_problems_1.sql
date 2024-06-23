# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .

#1.Retrieve the names of all customers and the titles of the films they have rented.
select c.first_name,c.last_name,f.title from customer c join rental r on c.customer_id=r.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id=f.film_id ;

#2.Display the rental date and return date for each rental along with the customer's first name and last name.
select c.first_name,c.last_name,r.rental_date,r.return_date from customer c join rental r on c.customer_id=r.customer_id;

#3)List the names of actors who have appeared in the film titled "Chamber Italian".
select a.first_name,a.last_name  from actor a join film_actor fa on a.actor_id=fa.actor_id join film f on f.film_id=fa.film_id where title='Chamber Italian';

#4)4.Get the titles of all films rented by the customer named "William Brown".
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on i.inventory_id=r.inventory_id join customer c on r.customer_id=c.customer_id where first_name='William' and last_name='Brown';

#5.Retrieve the film titles rented by the customer with customer_id 100.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on i.inventory_id=r.rental_id join customer c on r.rental_id=c.customer_id where c.customer_id=100;

#6.List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select f.title,rental_date from film f join inventory i on f.film_id=i.film_id join rental r on i.inventory_id=r.inventory_id join customer c on r.customer_id=c.customer_id where c.customer_id=200;

#7 Display the film titles and rental durations for all rentals made on May 15, 2005.
select f.title,f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on i.inventory_id=rental_id where rental_date='2005-05-15';

#8.List the names of customers who have rented the film titled "Alien Center".
select c.first_name,c.last_name from  customer c join rental r on c.customer_id=r.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id=f.film_id where f.title='Alien Center';

#9.Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
select c.first_name,c.last_name,c.email from customer c  join rental r on c.customer_id=r.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id=f.film_id where f.title='Flight Lies';

#10.Retrieve the rental date and rental duration for each rental made by customer "Linda Williams".
select r.rental_date,rental_duration from rental r join customer c on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where first_name='Linda'and last_name='Williams';

#11.List the film titles and rental dates for all rentals made by customer "Mary Johnson".
select f.title,r.rental_date from rental r join customer c on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where first_name='Mary'and last_name='Johnson';

#12.Display the film titles rented by the customer with customer_id 300.
select f.title from rental r join customer c on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where c.customer_id=300;

#13.Get the names of all customers who have rented more than 5 films.
select c.first_name, c.last_name from customer c join rental r on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id group by c.first_name, c.last_name having count(title)>5;

#14.List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select f.title, r.rental_date from rental r join customer c on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where c.customer_id=400;

#15.Retrieve the rental date and return date for each rental made by customer "Richard Davis".
select f.title, r.rental_date from rental r join customer c on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where c.first_name='Richard' and c.last_name='Davis';

#16.Display the first name, last name, and email of customers who have rented the film titled "Dinosaur Secretary".
select c.first_name,c.last_name,c.email from customer c join rental r on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id where title='Dinosaur Secretary';

#17.List the names of customers who have rented the film titled "Silence Kane".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Silence Kane';

#18.Get the film titles and rental dates for all rentals made on August 10, 2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id where date(rental_date)='2005-08-10';

#19.Retrieve the film titles rented by the customer with customer_id 500.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=500 order by f.title;


#20.Display the rental date and rental duration for each rental made by customer "Karen Smith".
select r.rental_date,f.rental_duration from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Karen' and last_name='Smith';


#21.List the film titles and rental dates for all rentals made by customer "Steven Taylor".
select r.rental_date,f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Steven' and last_name='Taylor';


#22.Display the names of customers who have rented the film titled "Ocean Luke".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Ocean Luke';
 

#23.Get the first name, last name, and email of customers who have rented more than 10 films.
select c.first_name, c.last_name, c.email from customer c join rental r on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id group by c.first_name, c.last_name, c.email having count(title)>10;

#24.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 600.
select r.rental_date,f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=600;


#25.List the rental date and return date for all rentals made by customer "Susan Johnson".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Susan' and c.last_name='Johnson';


#26.Display the film titles rented by the customer with customer_id 700.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=700;


#27.Get the names of customers who have rented the film titled "Murder Antitrust".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Murder Antitrust';
 
 

#28.Retrieve the rental date and rental duration for each rental made by customer "Joseph Brown".
select r.rental_date,f.rental_duration from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Joseph' and last_name='Brown';

#29.List the film titles and rental dates for all rentals made by customer "Michael Davis".
select r.rental_date,f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Michael' and last_name='Davis';

#30.Display the first name, last name, and email of customers who have rented the film titled "Squad Fisherman".
select c.first_name,c.last_name,c.email from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Squad Fish';


