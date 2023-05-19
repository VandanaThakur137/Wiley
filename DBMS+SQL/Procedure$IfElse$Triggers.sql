DELIMITER $$
create procedure getCustomers()
begin
select customerName,state,city,postalcode,country from customers order by customerName;
end $$
DELIMITER;

call gerCustomers

-----------------
DELIMITER $$
create procedure getProducts()
begin
select * from products;
end $$
DELIMITER;
