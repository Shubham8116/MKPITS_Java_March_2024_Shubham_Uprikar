#Create following Tables insert data
#Customer - Customer_Id, Name, Address, City
#Supplier - Supplier_Id, Name, Address, City
#ProductMaster - Product_Id, Name, Price, QOH
#Sale - Sale_Id, Product_id, Customer_id, Quantity, Date
#Purchase - Purchase_Id, Product_id, Customer_id, Quantity, Date.

CREATE SCHEMA newshop;
use newshop;
create table Customer(customer_Id int not null,name varchar(20),address varchar(30),city varchar(10),primary key(customer_id));
create table Supplier(supplier_Id varchar(10) not null,name varchar(20),address varchar(30),city varchar(10));
create table ProductMaster(product_Id varchar(10) not null,name varchar(20),price int,qty_on_hand int);
create table Sale(sale_Id varchar(10) not null,product_Id varchar(10) not null,customer_Id int not null,quantity int,sale_date datetime);
create table Purchase(purchase_Id varchar(10),product_Id varchar(10),customer_Id int,quantity int,purchase_date datetime);
show tables;

insert into productmaster values('p001','nirma',20.0,100);
insert into productmaster values('p002','lux',35.0,50);
insert into productmaster values('p003','sweet cake',20.0,100);
insert into productmaster values('p004','parle biscuit',10.0,150);
insert into productmaster values('p005','cadbury',20.0,200);
insert into productmaster values('p006','pepsi',25.0,80);

insert into supplier values('S001','abc supplier','new ca road','los angels');
insert into supplier values('S002','la wholesale','sunset blvd','los angels');

insert into sale values('sa001','p001',1,30,curdate());
insert into sale values('sa002','p002',2,20,curdate());
insert into sale values('sa003','p003',3,10,curdate());
insert into sale values('sa004','p004',4,5,curdate());
insert into sale values('sa005','p004',4,10,curdate());
select * from sale;

insert into purchase values('1001','p001',1,30,curdate());
insert into purchase values('1002','p002',2,20,curdate());
insert into purchase values('1003','p003',3,10,curdate());
insert into purchase values('1004','p004',4,10,curdate());
insert into purchase values('1005','p004',4,5,curdate());
select * from purchase





#Try following queries
### Problem 1
#**Problem Statement**: Retrieve the names and addresses of all suppliers in 'Los Angels'.
#**Expected Result**:
| Name             | Address            |
|------------------|--------------------|
| ABC Supplies     | 123 Main Street    |
| LA Wholesale     | 456 Sunset Blvd    |

select name,address from supplier where city='los angels';

### Problem 2
#**Problem Statement**: Find the total quantity of products sold.
#**Expected Result**:
| Total_Quantity_Sold |
|---------------------|
| 2450                |

select sum(quantity) from sale;

### Problem 3
#**Problem Statement**: List all purchases of product ID 'P001' sorted by date in ascending order.
#**Expected Result**:

| Purchase_Id | Product_id | Customer_id | Quantity | Date       |
|-------------|------------|-------------|----------|------------|
| 1001        | P001       | C123        | 50       | 2024-05-01 |
| 1002        | P001       | C124        | 30       | 2024-05-05 |

select * from purchase where product_id='p001';

### Problem 4
#**Problem Statement**: Find the names of products that have been sold more than 100 times.
#**Expected Result**:
| Name          |
|---------------|
| Widget A      |
| Gadget B      |

select name from productmaster p join
sale s on p.product_id=s.product_id group by name having count(s.product_id)>100;

### Problem 5
#**Problem Statement**: Retrieve the product ID and name of the product with the highest price.
#**SQL Query**:
#**Expected Result**:

| Product_Id | Name          |
|------------|---------------|
| P009       | Luxury Item   |

select product_id,name from productmaster where price=
(select max(price) from productmaster);

### Problem 6
#**Problem Statement**: Find the average price of products in the product master.
#**Expected Result**:

| Avg_Product_Price |
|-------------------|
| 299.50            |

select avg(price) as average from productmaster;

### Problem 7
#**Problem Statement**: List the product IDs that have not been sold.
#**Expected Result**:

| Product_Id |
|------------|
| P003       |
| P007       |

select product_id from productmaster where product_id not in(select  distinct product_id from sale);


### Problem 8
#**Problem Statement**: Retrieve the total number of sales made in the month of June 2024.
#**Expected Result**:

| Total_Sales |
|-------------|
| 150         |

select count(sale_id) from sale where year(sale_date)=2024 and month(sale_date)=06;

### Problem 9
#**Problem Statement**: Find the quantity on hand (QOH) of the product with product ID 'P005'.
#**Expected Result**:

| QOH  |
|------|
| 120  |

select qty_on_hand from productmaster where product_id='p005';

### Problem 10
#**Problem Statement**: List the names and total quantities purchased of products that have been purchased more than 1 times.
#**Expected Result**:

| Name          | Total_Quantity_Purchased |
|---------------|--------------------------|
| Widget A      | 350                      |
| Gadget B      | 220                      |

select p.name,sum(pr.quantity) from purchase pr join
productmaster p on pr.product_id=p.product_id  group by p.name having count(pr.product_id)>1;
select * from purchase;