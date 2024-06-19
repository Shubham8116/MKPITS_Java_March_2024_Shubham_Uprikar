### Problem Statement 1
#**Create a view named `customer_rental_info` that lists each customer's full name (first and last), email, the number of rentals they have made, and the total amount they have spent on rentals.**

create view customer_rental_info as
select c.customer_id, c.first_name,c.last_name,c.email,count(r.rental_id),sum(p.amount) from customer c join
 rental r on c.customer_id=r.customer_id join
payment p  on r.rental_id=p.rental_id group by c.customer_id, c.first_name,c.last_name,c.email order by c.customer_id;

select * from customer_rental_info;
----------------------------------------------------------------------------------------------------------------------------------------------------------------

### Problem Statement 2
#**Create a view named `top_rented_films` that displays the top 10 most rented films, including the film title and the number of times it has been rented.**

create view top_rented_films as
select f.title,count(r.rental_id) as counter from film f join
inventory i on f.film_id=i.film_id join
rental r on i.inventory_id=r.inventory_id group by f.title order by counter desc limit 10;

select * from top_rented_films;
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Problem Statement 3
#**Create a view named `active_customers` that lists all customers who have rented at least one film in the last 30 days. Include the customer's full name, email, and the date of their last rental.**

create view active_customers as
select c.customer_id, c.first_name,c.last_name,c.email,max(r.rental_date) from customer c join 
rental r on c.customer_id=r.customer_id where r.rental_date>=subdate(curdate(),interval 19.5 year) group by c.customer_id, c.first_name,c.last_name order by c.customer_id;

select * from active_customers;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

### Problem Statement 4
#**Create a view named `inventory_by_store` that displays the number of films available in each store. Include the store ID and the count of films available in that store.**

create view inventory_by_store as
select s.store_id, count(f.film_id) from store s join
inventory i on s.store_id=i.store_id join
film f on i.film_id=f.film_id group by s.store_id order by s.store_id ;

select * from inventory_by_store;

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Problem Statement 5
#**Create a view named `staff_sales_performance` that lists each staff member's full name, their store, and the total sales amount they have made.**

create view staff_sales_performance as
select  st.staff_id,st.first_name,st.last_name,st.store_id,sum(p.amount) from staff st join
payment p on st.staff_id=p.staff_id group by st.staff_id,st.first_name,st.last_name,st.store_id order by st.staff_id;

select * from staff_sales_performance;
