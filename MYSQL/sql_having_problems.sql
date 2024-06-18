# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .

#1. High revenue categories:
#Find categories with an average rental revenue greater than $10.
select cat.category_id, cat.name, sum(p.amount) from category cat join
 film_category fc on cat.category_id=fc.category_id join
 film f on fc.film_id=f.film_id join 
 inventory i on f.film_id=i.film_id join
 rental r on i.inventory_id=r.inventory_id join 
 payment p on r.rental_id=p.rental_id group by cat.category_id,cat.name having sum(p.amount)>10;

#2. Customers with many rentals:
#Identify customers who have rented more than 30 films.
select c.customer_id,c.first_name, c.last_name from customer c join rental r on r.customer_id=c.customer_id join inventory i on r.inventory_id=i.inventory_id join film f on i.film_id= f.film_id group by c.customer_id, c.first_name, c.last_name having count(f.title)>30;

#3. Popular languages:
#List languages with more than 50 films.
select l.language_id,l.name,count(f.film_id) from language l join film f on l.language_id=f.language_id group by l.language_id,l.name having count(f.film_id)>50;

#4. Stores with high revenue:
#Find stores with total revenue exceeding $5000.
select s.store_id, sum(p.amount) from store s join inventory i on s.store_id=i.store_id join rental r on i.inventory_id=r.inventory_id join payment p on r.rental_id=p.rental_id group by s.store_id having sum(amount)>5000;

#5. Actors in popular films:
#Show actors who have appeared in more than 10 films.
select a.actor_id,a.first_name from actor a join film_actor fa on a.actor_id=fa.actor_id join film f on fa.film_id=f.film_id group by a.actor_id,a.first_name having count(f.film_id)>10;

#6. Staff with high customer interactions:
#List staff members who have handled more than 500 customer transactions.
select s.staff_id from staff s join payment p on s.staff_id=p.staff_id group by s.staff_id having count(p.payment_id)>500;

#7. Active customers:
#Identify customers who have rented in the last 30 days.
select c.customer_id,r.rental_date from customer c join rental r on c.customer_id=r.customer_id where r.rental_date>= curdate()-interval 20 year group by c.customer_id;


#8. Long rentals:
#List films with an average rental duration of more than 7 days.
select film_id,title from film having avg(rental_duration)>7;

#9. Highly rented films:
#Identify films that have been rented more than 30 times.
select f.film_id,f.title,count(r.rental_id) as count  from film f join inventory i on f.film_id=i.film_id join rental r on i.inventory_id=r.inventory_id group by f.film_id having count(r.rental_id)>30;


#10. Customers with diverse film preferences:
#Find customers who have rented films from at least 5 different categories.
select c.customer_id, c.first_name, c.last_name, count(distinct(cat.name)) from customer c join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id join film_category fc on fc.film_id=f.film_id
join category cat on cat.category_id=fc.category_id group by c.customer_id having count(distinct(cat.name))>=5;