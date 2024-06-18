#Create following tables and insert data
#Account - Account_No, Name, Address, City, Balance
#Transactions - Account_No, Amount, Transaction_Type, Date

use bank;
create table Account(acc_no int not null, name varchar(20), address varchar(30), city varchar (20), balance int, primary key(acc_no));
create table Transactions(acc_no int not null,amount int ,trans_type varchar(10), trans_date datetime);
show tables;

    insert into Account values(12345,'shubham uprikar','mata ward','gadchiroli',10000);
    insert into Account values(23456,'pooja raina','new clony','nagpur',8000);
    insert into Account values(31345,'karan rao','WC road','nagpur',6000);
    insert into Account values(43456,'shubham','sbi colony','nagpur',1000);
    insert into Account values(13456,'ashu rahate','goregaon east','delhi',20000);
    insert into Account values(10003,'vinod sachiv','abc chowk','pune',5000);
	insert into Account values(22987,'jack ryan','21 bakerd street','new york',1000);
    insert into Account values(11223,'luis wales','21 bakerd street','new york',9000);
    insert into Account values(33445,'butcher honey','new state road','new york',3000);
    select * from account; 
    insert into Transactions values(12345,10000,'deposit',curdate());
    insert into Transactions values(23456,8000,'deposit',curdate());
    insert into Transactions values(31345,6000,'deposit',curdate());
    insert into Transactions values(43456,1000,'deposit',curdate());
    insert into Transactions values(13456,20000,'deposit',curdate());
    insert into Transactions values(10003,5000,'deposit',curdate());
    insert into Transactions values(22987,1000,'deposit',curdate());
    insert into Transactions values(22987,500,'debit',curdate());
    insert into Transactions values(22987,500,'deposit',curdate());
    insert into Transactions values(22987,500,'debit',curdate());
    insert into Transactions values(22987,500,'deposit',curdate());
    select * from transactions;
    
#Try following queries :
### Problem 1
#**Problem Statement**: Retrieve the names and addresses of all account holders in 'New York'.
select name, address from account where city='new york';


### Problem 2
#**Problem Statement**: Find the total balance of all accounts.
select sum(balance) from account;

### Problem 3
#**Problem Statement**: List all transactions of account number '12345' sorted by date in descending order.
select * from transactions where acc_no=12345 order by trans_date desc;

### Problem 4
#**Problem Statement**: Find the names of account holders who have made a transaction greater than 5000.
select a.name from account a join transactions t on a.acc_no=t.acc_no where t.amount>5000;

### Problem 5
#**Problem Statement**: Retrieve the account number and balance of the account with the highest balance.
select acc_no,balance from account where balance=
(select max(balance) from account);

### Problem 6
#**Problem Statement**: Find the average transaction amount for 'Debit' transactions.
#**Expected Result**:
```
| Avg_Debit_Amount |
|------------------|
| 150.75           |
```
select avg(amount) from transactions where trans_type='debit';

### Problem 7
#**Problem Statement**: List the account numbers that have not made any transactions.
#**Expected Result**:

#| Account_No |
#|------------|
#| 11223      |
#| 33445      |

select acc_no from account where acc_no <> all
(select acc_no from transactions);


### Problem 8
#**Problem Statement**: Retrieve the total number of transactions made in the month of May 2024.
#**Expected Result**:
#| Total_Transactions |
#|--------------------|
#| 75                 |

select count(acc_no) from transactions where month(trans_date)=05 and year(trans_date)=2024;


### Problem 9
#**Problem Statement**: Find the balance of the account with account number '56789'.
#**Expected Result**:
#| Balance |
#|---------|
#| 3500    |

select balance from account where acc_no=56789;

### Problem 10
#**Problem Statement**: List the names and total transaction amounts of account holders who have made transactions totaling more than 1000.
#**Expected Result**:
#| Name          | Total_Amount |
#|---------------|--------------|
#| John Doe      | 1500         |
#| Emily Davis   | 1200         |

select a.acc_no,a.name,sum(t.amount) from transactions t  join
account a on t.acc_no=a.acc_no group by a.acc_no,a.name having sum(amount)>1000;

