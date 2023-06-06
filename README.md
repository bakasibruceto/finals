# finals
drop database IF exists finals;
create database finals;
use finals;

create table if not exists customers(
customer_id int primary key,
first_name varchar (50),
last_name varchar (50),
age int,
email varchar(100),
);

insert into customers values
(1,"James","Bong",21,"JB@gmail.com"),
(2,"Forrest","Gump",30,"FG@gmail.com"),
(3,"Bench","Prest",28,"BP@gmail.com"),
(4,"Neon","Lights",19,"NL@gmail.com"),
(5,"Mountain","Fujji",54,"MF@gmail.com");

alter table customers
add column Salary decimal(10,2) after last_name,
add column hourly_pay decimal(10,2) after Salary;

update customers
set hourly_pay=8
where customer_id = 1;

update customers
set hourly_pay=15
where customer_id = 2;

update customers
set hourly_pay=17
where customer_id = 3;

update customers
set hourly_pay=10
where customer_id = 4;
update customers
set hourly_pay=20
where customer_id = 5;

select*from customers;

update customers
set Salary = hourly_pay * 20;
select * from customers;

create trigger salary_insert
before insert on customers
for each row
set new.Salary=(New.hourly_pay * 2050);

delete from customers
where customer_id = 5;
select * from customers;

insert into customers Values
(6,"Mountain","Dev",null,34,54,"MD@gmail.com");

create trigger salary_update
before update on customers
for each row set new.Salary=(New.hourly_pay*2050);

update customers
set hourly_pay = 15
where customer_id = 4;

select * from customers;
update customers SET hourly_pay = hourly_pay+1;
select * from customers;

delimiter $$
create procedure get_customers()
begin
select * from customers;
end$$
delimiter ;

Call get_customers();

delimiter $$
create procedure find_customer(IN id int)
begin select*from customers
where customer_id = id;
end$$
delimiter ;

call find_customer(4);


