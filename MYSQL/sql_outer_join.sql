# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .


#Problem Statement 1: Retrieve Customer Information with Rental History
#Retrieve the customer's first name, last name, and the number of rentals they have made. Include customers who have not made any rentals as well.

select c.first_name,c.last_name,count(rental_id) from customer c left join
rental r on c.customer_id=r.customer_id group by c.first_name,c.last_name order by c.customer_id;

---------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 2: Display Films and Their Rental Count
#Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.

select f.title, count(r.rental_id) from film f left join
inventory i on f.film_id=i.film_id join
rental r on i.inventory_id=r.inventory_id group by f.title order by f.title;

---------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 3: List Customers and Their Rentals
#List customers with their rental details (rental ID, rental date, and return date if available). Include customers who have not made any rentals.

select c.first_name,c.last_name,r.rental_id,r.rental_date,r.return_date from customer c  left join
rental r on c.customer_id=r.customer_id group by c.first_name,c.last_name order by c.customer_id;

----------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 4: Show Films and Customers Who Rented Them
#Display film titles and the names of customers who have rented each film. Include films that have not been rented.

select f.title,c.customer_id,c.first_name,c.last_name from film f left join
inventory i on f.film_id=i.film_id join
rental r on i.inventory_id=r.inventory_id join
customer c on r.customer_id=c.customer_id group by f.title,c.customer_id,c.first_name,c.last_name order by f.title; 
 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 5: Retrieve Films and Rental Details
#Retrieve film titles and rental details (rental ID, rental date, and return date if available). Include films that have not been rented.

select f.title,r.rental_id,r.rental_date,r.return_date from film f left join
inventory i on f.film_id=i.film_id join
rental r on i.inventory_id=r.inventory_id group by f.title,rental_id ;


-----------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 6: Show Actors and Films They Acted In
#Display actor names and the titles of films they have acted in. Include actors who have not acted in any films.

select a.actor_id,a.first_name,a.last_name,f.title from actor a left join
film_actor fa on a.actor_id=fa.actor_id join 
film f on fa.film_id=f.film_id  order by a.actor_id;

----------------------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 7: Explore Staff and Their Associated Stores
#Retrieve staff details (staff ID, first name, last name) and the store they are associated with. Include staff who are not associated with any store.

select s.staff_id,s.first_name,s.last_name,st.store_id from staff s
left join store st on s.store_id = st.store_id
group by s.staff_id
order by s.staff_id