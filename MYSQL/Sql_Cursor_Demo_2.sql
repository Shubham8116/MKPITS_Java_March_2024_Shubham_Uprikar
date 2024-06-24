# In the below mysql procedure roll numbers of students are copied into another table using cursor by implementing while loop.
DELIMITER $$
CREATE PROCEDURE FILL_ROLL()
BEGIN
DECLARE RC INT;
DECLARE i INT DEFAULT 0;
DECLARE store_rollno INT;

DECLARE ROLL_CURSOR CURSOR FOR SELECT ROLLNO FROM STUDENT;

#DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

OPEN ROLL_CURSOR;

select count(*) into rc from student;

 WHILE i<rc DO
       FETCH FROM ROLL_CURSOR INTO store_rollno;
       INSERT INTO student_roll VALUES(store_rollno);
       set i=i+1;
         END While;
         
CLOSE ROLL_CURSOR;         
         
END; $$

call FILL_ROLL()
