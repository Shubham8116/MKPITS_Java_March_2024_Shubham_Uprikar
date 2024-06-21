# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .
-------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 1: Identify Customers Who Share the Same Address
#Retrieve pairs of customer names who share the same address.

select A.first_name as first_name1,A.last_name as last_name2,B.first_name as first_name2,B.last_name as last_name2
from customer A,customer B where A.customer_id<>B.customer_id
and A.address_id=B.address_id order by A.address_id;

------------------------------------------------------------------------------------------------------------------------------------------------
#Problem Statement 2: Identify Films with Similar Titles
#Retrieve pairs of film titles that have a similar title structure (e.g., differing by one character or having a common substring).

select f1.title as film1,f2.title as film2 from film f1,film f2 where f1.film_id<>f2.film_id 
and f1.title=f2.title order by f1.title;
