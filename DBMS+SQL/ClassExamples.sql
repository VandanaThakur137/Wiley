CREATE DATABASE IF NOT EXISTS hr;

CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100)
);

CREATE TABLE employees (
    id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    department_id int not null,
    FOREIGN KEY (department_id)
        REFERENCES departments (department_id)
);

rename employees to v_employees;

SELECT CONCAT('DROP TABLE', GROUP_CONCAT(CONCAT(@schema,'.'table_name)),';')
INTO @dropLike 
FROM information_schema.tables 
WHERE @schema = database()
AND table_name LIKE @pattern;

SELECT @dropLike;




-----------------------------------------

create table if not exists contacts(id int auto_increment primary key, firstname varchar(50) not null,
 lastname varchar(50) not null, fullname varchar(50) generated always as (concat(firstname,' ',lastname)));

insert into contacts(firstname,lastname) values('Anshika','Gupta'),('Adarsh','Gupta');
    
create table MyTable(
id int primary key,name  varchar(50) not null, age int default 20,
email varchar(50) unique, id_2 int, foreign key (id_2) references contacts(id));

insert into MyTable values(101,'Aditi Singh',18, 'as@gmail.com',1),(102,'Aman',21, 'am@gmail.com',2);
select * from MyTable;

