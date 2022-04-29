create database SampleDB;
 
use SampleDB;
 
CREATE TABLE users (
    user_id int(11) NOT NULL AUTO_INCREMENT,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    fullname varchar(45) NOT NULL,
    email varchar(45) NOT NULL,
    PRIMARY KEY (user_id)
);
select * from users;
create table product(product_id int primary key,
product_name varchar(45),price float);
insert into product values(1,"Mobile Phones",900);
create table orders(order_id int primary key auto_increment,
product_id int,amount float,order_date date,foreign key (product_id) references
product(product_id));
drop table orders;
INSERT INTO orders (product_id,order_date,amount) values(1,"2022-04-29",580);
create table monthly_sales(report_month int,product_id int,total_amount float,
foreign key (product_id) references
product(product_id));
insert into monthly_sales values(4,1,900);
select * from orders;
select * from product;
select * from monthly_sales