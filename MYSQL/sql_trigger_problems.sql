# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .  
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#1. **Prevent Deletion of Active Customers**:
 #  - **Problem Statement**: Prevent the deletion of a customer who has any active rentals.
  # - **Trigger Description**: Create a `BEFORE DELETE` trigger on the `customer` table that checks for active rentals. If active rentals exist, raise an error and prevent the deletion.
  delimiter $$
  create trigger delete_customer
  before delete on customer
  for each row
  begin
  declare value int;
  set @new.value=(select active from customer where customer_id=old.customer_id);
  if value=1
  then
    SET @s = 'can not delete selected customer because it is currently active';
    SIGNAL SQLSTATE '45001' SET MESSAGE_TEXT = @s;
 
  end if;
  end;
  $$
  
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#2. **Update Last Updated Timestamp**:
 #  - **Problem Statement**: Automatically update the `last_update` timestamp column in the `film` table whenever a film's details are modified.
  # - **Trigger Description**: Create a `BEFORE UPDATE` trigger on the `film` table that sets the `last_update` column to the current timestamp.
  
  delimiter $$
  create trigger update_film
  before update on film
  for each row
  begin
  set new.last_update=current_timestamp();
  end;
  $$
  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#3. **Log Film Deletion**:
 #  - **Problem Statement**: Log details of any film deletions into a `deleted_films_log` table for auditing purposes.
  # - **Trigger Description**: Create an `AFTER DELETE` trigger on the `film` table that inserts the deleted film's details into the `deleted_films_log` table.
  
create table deleted_films_log(film_id int,title varchar(22));

delimiter $$
create trigger delete_film
after delete on film
for each row
begin
insert into deleted_films_log values(old.film_id,old.title);
end;
$$  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#4. **Ensure Valid Rental Dates**:
 #  - **Problem Statement**: Ensure that the `return_date` in the `rental` table is always after the `rental_date`.
  # - **Trigger Description**: Create a `BEFORE INSERT` or `BEFORE UPDATE` trigger on the `rental` table that checks if the `return_date` is after the `rental_date`. If not, raise an error to prevent the insert or update.

delimiter $$
create trigger check_return_date
before insert on rental
for each row
begin
if (new.rental_date>new.return_date)
then
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT ='can not insert into Rental table';
end if;
end;
$$

