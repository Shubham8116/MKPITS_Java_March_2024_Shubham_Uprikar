# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .


#31.Get the film titles and rental dates for all rentals made on July 25, 2005.
select f.title,r.rental_date from rental r join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id=f.film_id where date(rental_date)='2005-07-25';

#32.Retrieve the film titles rented by the customer with customer_id 800.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=800;

#33.List the rental date and return date for all rentals made by customer "Barbara Taylor".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Barbara' and c.last_name='Taylor';


#34.Display the names of customers who have rented the film titled "Riders Zorro".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Riders Zorro';


#35.Get the first name, last name, and email of customers who have rented more than 8 films.
select c.first_name, c.last_name, c.email from customer c join rental r on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id group by c.first_name, c.last_name, c.email having count(title)>8;

#36.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 900.
select r.rental_date, f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=900;

#37.List the rental date and rental duration for each rental made by customer "Charles Harris".
select r.rental_date,f.rental_duration from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Charles' and last_name='Harris';

#38.Display the film titles rented by the customer with customer_id 1000.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=1000;

#39.Get the names of customers who have rented the film titled "Casino Royale".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Casino Royale';


#40.Retrieve the rental date and return date for each rental made by customer "Lisa Anderson".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Lisa' and c.last_name='Anderson';


#41.List the film titles and rental dates for all rentals made by customer "Matthew Smith".
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='Matthew' and c.last_name='Smith';



#42.Display the first name, last name, and email of customers who have rented the film titled "Innocent Usual".
select c.first_name,c.last_name,c.email from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Innocent Usual';
 
#43.Get the film titles and rental dates for all rentals made on June 18, 2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id where DATE(r.rental_date)='2005-6-18';

#44.Retrieve the film titles rented by the customer with customer_id 1100.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=1100;


#45.List the rental date and return date for all rentals made by customer "Jennifer Lee".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Jennifer' and c.last_name='Lee';

#46.Display the names of customers who have rented the film titled "Inferno Kilometer".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id
 where title='Inferno Kilometer';

#47.Get the first name, last name, and email of customers who have rented more than 12 films.
select c.first_name,c.last_name,c.email from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id group by c.first_name,c.last_name,c.email having  count(f.title)>12;


#48.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 1200.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=1200;

#49.List the rental date and rental duration for each rental made by customer "David Clark".
select r.rental_date,f.rental_duration from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='David' and last_name='Clark';

#50.Display the film titles rented by the customer with customer_id 1300.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=1300;

#51.Get the names of customers who have rented the film titled "Golden Groove".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id where f.title="Golden Groove";

#52.Retrieve the rental date and return date for each rental made by customer "Laura Martinez".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Laura' and c.last_name='Martinez';


#53.List the film titles and rental dates for all rentals made by customer "John Johnson".
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.first_name='John' and c.last_name='Johnson';

#54.Display the first name, last name, and email of customers who have rented the film titled "Spice Sorcerer".
select c.first_name,c.last_name,c.email from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id where f.title="Spice Sorcerer";

#55.Get the film titles and rental dates for all rentals made on September 5, 2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id where date(r.rental_date)='2005-09-05';


#56.Retrieve the film titles rented by the customer with customer_id 1400.
select f.title from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=1400;


#57.List the rental date and return date for all rentals made by customer "Sarah Thomas".
select r.rental_date,r.return_date from rental r join customer c on r.customer_id=c.customer_id where c.first_name='Sarah' and c.last_name='Thomas';

#58.Display the names of customers who have rented the film titled "Scream Human".
select c.first_name,c.last_name from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id where f.title="Scream Human";

#59.Get the first name, last name, and email of customers who have rented more than 15 films.
select c.first_name,c.last_name,c.email from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id group by c.first_name,c.last_name,c.email having count(f.title)>15;

#60.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 150.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id join 
customer c on r.customer_id=c.customer_id where c.customer_id=140;
