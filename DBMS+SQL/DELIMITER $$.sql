DELIMITER $$
create procedure getCustomers()
begin
select customerName,state,city,postalcode,country from customers order by customerName;
end $$
DELIMITER;

call gerCustomers

-----------------
create procedure to call all products

DELIMITER $$
create procedure getProducts()
begin
select * from products;
end $$
DELIMITER;
-------------------
create procedure with arguments
	create procedure getProducts(argument_)
		begin
		//;
		end
-->show procedure status;
-->drop procedure if exists getProducts;
-->show warnings;

-------------------------------------
delimiter $$
create procedure getOfficesbyCountry(in customerName varchar(255))
		begin
		select * from offices where country=customerName;
		end $$ 
        delimiter;

        call getOfficesbyCountry('France')
-----------------------------------------------------
delimiter $$
create procedure getOrderCountbyStatus(in ordersStatus varchar(25),out total int)
		begin
		select count(orderNumber)
        into total
        from orders where status=ordersStatus;
		end $$ 
        delimiter;

        call  getOrderCountbyStatus('in process',@total);

-----------------------------------------------------------
declare action handler for condition_name
create table SupplierProducts(
supplierId int, productId int,primary key(supplierId,productId))

delimiter $$
create procedure InsertSupplierProduct(
in inSupplierId int, in inProductId int)
begin
declare exit handler for 1062
begin
select concat('Duplicate key (',inSupplierId,',',inProductId,')occured') as message;
end;
insert into SupplierProducts(supplierId,productId)
values(inSupplierId,inProductId);
select count(*)
from SupplierProducts where supplierId=inSupplierId;
END $$
delimiter;	
#call InsertSupplierProduct(sid,pid)
--------------------------------------
delimiter $$
create function CustomerLevel(
credit decimal(10,2))
returns varchar(20)
deterministic
begin
declare customerLevel varchar(20);
if credit > 50000 then set customerLevel='Platinum';
elseif(credit<=50000 and credit>=10000) then set customerLevel='Gold';
elseif credit < 10000 then set customerLevel='Silver';
end if;
return(customerLevel);
end $$
delimiter;

show function status where db='wileyclassic';
----------------------------------------

CREATE TABLE employees audit (

id IN AUTO INCREMENT PRIMARY KEY,

employeeNumber INT NOT NULL,

lastname VARCHAR(50) NOT NULL,

changedat DATETIME DEFAULT NULL, action VARCHAR(50) DEFAULT NULL

CREATE TRIGGER before employee_update

BEFORE UPDATE ON employees

FOR EACH ROW

INSERT INTO employees_audit

SET action='update',

employeeNumber = OLD. employeeNumber, lastname OLD.lastname,

changedat = NOW();

1951 UPDATE employees SET lastname="steve" WHERE employeeNumber=1056;

SHOW TRIGGERS;

DROP TRIGGER IF EXISTS database_name.trigger_name;

----------------------------------------------------





