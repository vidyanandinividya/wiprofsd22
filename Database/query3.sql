use organization;
create table artists(id int primary key,first_name varchar(25),last_name varchar(25));
insert into artists values(1,"thomas","black");
insert into artists values(2,"kate","smith");
insert into artists values(3,"natali","wein");
insert into artists values(4,"francesco","benelli");
create table collectors(id int primary key,first_name varchar(25),last_name varchar(25));
insert into collectors values(101,"brandon","cooper");
insert into collectors values(102,"laura","fisher");
insert into collectors values(103,"christina","buffet");
insert into collectors values(104,"steve","stevenson");
create table paintings(id int primary key,name varchar(25),artist_id int,listed_price float,foreign key (artist_id)
references artists(id));
insert into paintings values(11,"Miracle",1,300.00);
insert into paintings values(12,"Sunshine",1,700.00);
insert into paintings values(13,"Alie",2,2800.00);
insert into paintings values(14,"John",2,2300.00);
insert into paintings values(15,"Barbie",3,250.00);
insert into paintings values(16,"Cool Painting",3,5000.00);
insert into paintings values(17,"Black Square",3,50.00);
insert into paintings values(18,"Mountains",4,1300.00);

create table sales(id int primary key,painting_id int,artist_id int ,collector_id int,sales_price float,
foreign key (painting_id) references paintings(id), foreign key(collector_id) references collectors(id),
foreign key(artist_id) references artists(id));
insert into sales values(1001,13,2,104,2500.00);
insert into sales values(1002,14,2,102,2300.00);
insert into sales values(1003,11,1,102,300.00);
insert into sales values(1004,16,3,103,4000.00);
insert into sales values(1005,15,3,103,200.00);
insert into sales values(1006,17,3,103,50.00);
select * from artists;
select * from collectors;
select * from paintings;
select * from sales;
/*
scalar subquery returns a single value, or exactly one row and exactly one column
*/
/*display list of paintings that are priced higher than the average*/
select name,listed_price
from paintings
where listed_price >
(select avg(listed_price) from paintings);
/*
Multiple row sub query returns more than one row.
--> returns one column with multiple rows (i.e. a list of values)
--> returns multiple coluns with multiple rows (i.e. tables)
*/
/*
list all collectors who purchased paintings from the gallery
*/
select first_name,last_name
from collectors
where id in
(select collector_id from sales);
/*
display the total amount of sales for each artist who has sold at least one painting
*/
select a.first_name,a.last_name,artist_sales.sales
from artists a
join
(select artist_id,sum(sales_price) as sales
from sales 
group by artist_id) as artist_sales
on a.id=artist_sales.artist_id;
/*
in corelated subqueries the inner query relies on information 
obtained from the outer query
it is commonly used in SELECT, WHERE and FROM statements
*/
/*for each collector, I want to calculate the number of paintings purchased through
the gallery*/
select first_name,last_name,
(select count(*) as paintings
from sales
where collectors.id=sales.collector_id)
from collectors;
/*
display the first name and last name of the artists who had zero sales
*/
select first_name,last_name
from artists
where not exists
(select * from sales
where sales.artist_id = artists.id)
