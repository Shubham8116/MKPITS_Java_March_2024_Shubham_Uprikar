# following sql queries are performed on the sakila database which is the default sample database in mysql.
#refer to the image provided, for understanding of the database tables .

#create a cursor that displays actor information from actor table of sakila database

DELIMITER $$
CREATE PROCEDURE fetch_actors()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE id INT;
    DECLARE name1 VARCHAR(45);
    DECLARE name2 VARCHAR(45);

    -- Declare a cursor to select actor_id, first_name, and last_name from the actor table
    DECLARE actor_cursor CURSOR FOR
        SELECT actor_id, first_name, last_name
        FROM actor;

    -- Declare a NOT FOUND handler to set done to TRUE
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- Open the cursor
    OPEN actor_cursor;

    -- Loop through the rows in the cursor
    read_loop: LOOP
        -- Fetch the next row into variables
        FETCH actor_cursor INTO id,name1,name2;

        -- Exit the loop if there are no more rows
        IF done=1 THEN
            LEAVE read_loop;
        END IF;

        -- Do something with the fetched data
        SELECT CONCAT('Actor ID: ', id, ' firstname: ', name1, 'lastname: ', name2) AS actor_info;
        
    END LOOP;

    -- Close the cursor
    CLOSE actor_cursor;
END$$

DELIMITER ;

call fetch_actors();
