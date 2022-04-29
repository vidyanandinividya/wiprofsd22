use Organization;
create table translators(id int primary key,first_name varchar(25),last_name varchar(25));
create table editors(id int primary key,first_name varchar(25),last_name varchar(25));
create table authors(id int primary key,first_name varchar(25),last_name varchar(25));
create table books(id int primary key,title varchar(25),type varchar(25),author_id int,editor_id int,translator_id int,
foreign key(author_id) references authors(id),foreign key(editor_id) references editors(id),foreign key(translator_id) references translators(id));
insert into translators values(31,"ira","davies");
insert into translators values(32,"ling","weng");
insert into translators values(33,"kristian","green");
insert into translators values(34,"roman","edwards");
insert into editors values(21,"Daniel","Brown");
insert into editors values(22,"Mark","Johnson");
insert into editors values(23,"Maria","Evans");
insert into editors values(24,"Cathrine","Roberts");
insert into editors values(25,"Sebastian","Wright");
insert into editors values(26,"Barbara","Jones");
insert into editors values(27,"Mathew","Smith");
insert into authors values(11,"Ellen","Writer");
insert into authors values(12,"Olga","Savelieva");
insert into authors values(13,"Jack","Smart");
insert into authors values(14,"Donald","Brain");
insert into authors values(15,"Yao","Dou");
insert into authors values(16,"John","Dou");
insert into books values(1,"Times to Grow Up","Original",11,21,null);
insert into books values(2,"Your Trip","Translated",15,22,32);
insert into books values(3,"Lovely Love","Original",14,24,null);
insert into books values(4,"Dream Your Life","Original",11,24,null);
insert into books values(5,"Oranges","Translated",12,25,31);
insert into books values(6,"Your Happy Life","translated",15,22,33);
insert into books values(7,"Applied AI","translated",13,23,34);
insert into books values(8,"Java","original",13,null,null);
select * from books;
select * from authors;
select * from editors;
select * from translators;
/*to show the book title along with their authors*/
select b.id,b.author_id,b.title,a.first_name,a.last_name,a.id
from books b
inner join authors a
on b.author_id=a.id 
order by b.id;
/*displaying books along with their translators*/
select b.id,b.title,b.type,t.last_name as translator
from books b
join translators t
on b.translator_id=t.id
order by b.id;

select b.id,b.title,b.type,t.last_name as translator
from books b
left join translators t
on b.translator_id=t.id
order by b.id;
/*display information about each book's author and translator. 
also want to keep the basic information about each book
books, authos and translators
*/
select b.id,b.title,b.type,a.last_name as Author,t.last_name as Translator
from books b
left join authors a
on b.author_id=a.id
left join translators t
on b.translator_id=t.id
order by b.id;
select * from books;
select * from editors;
/* display all the records from the editor table*/
select b.id,b.title,e.last_name as editor
from books b
right join editors e
on b.editor_id=e.id
order by b.id;
/* display all records from book and editor table*/
select b.id,b.title,e.last_name as editor
from books b
FULL outer join editors e
on b.editor_id=e.id
order by b.id;
select * from employee;
alter table employee add column mgr_id int;
update employee set mgr_id=3 where empid=4;
update employee set mgr_id=2 where empid=3;
/*display employee name and their manager name*/
select e.fname as employeename,m.fname as managername
from employee e
left join employee m
on e.mgr_id=m.empid;