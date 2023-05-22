SELECT 
    @orderNumber:=MAX(orderNUmber)+1
FROM
    orders;


INSERT INTO orders(orderNumber,
                   orderDate,
                   requiredDate,
                   shippedDate,
                   status,
                   customerNumber)
VALUES(@orderNumber,
       '2005-05-31',
       '2005-06-10',
       '2005-06-11',
       'In Process',
        145);
INSERT INTO orderdetails(orderNumber,
                         productCode,
                         quantityOrdered,
                         priceEach,
                         orderLineNumber)
VALUES(@orderNumber,'S18_1749', 30, '136', 1),
      (@orderNumber,'S18_2248', 50, '55.09', 2); 
 
COMMIT;

-->select * from orderdetails where orderNumber=10426;
#lock tables table_name read;
#unlock tables table_name read;
------------------------------------------------------------
Triggers

CREATE TABLE employees_audit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employeeNumber INT NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    changedat DATETIME DEFAULT NULL,
    action VARCHAR(50) DEFAULT NULL
);

CREATE TRIGGER before_employee_update
    BEFORE UPDATE ON employees 
    FOR EACH ROW 
INSERT INTO employees_audit
SET action = 'update',
    employeeNumber = OLD.employeeNumber,
    lastname = OLD.lastname,
    changedat = NOW();

UPDATE employees SET lastname = "steve" WHERE employeeNumber=1056;

------------------------
SHOW TRIGGERS;
DROP TRIGGER IF EXISTS database_name.trigger_name;
-----------------------

wiley pulblications --> news letter 

Members tables 
    id, name, email, date_of_birth 

Register
INSERT 
    name, email, date_of_birth

REMINDER TABLE 
    id , member_id, message (Hi new.name, please update your date_of_birth)

DELIMITER $$
CREATE TRIGGER after_members_insert 
AFTER INSERT 
ON members FOR EACH ROW 
BEGIN
    IF NEW.date_of_birth IS NULL THEN
        INSERT INTO reminders(member_id, message)
        VALUES(NEW.id, CONCAT('Hi ', NEW.name, ', please update your dob,') );
    END IF;
END $$
DELIMITER ;

---------------------------------------

Bank 

customers 
    id
    name
    email 
    phone 
    extra_payment
    emi_amount 
    
monthly customer pay the emi (10k)

extra_payment can not be more than 2 times of monthly emi

create trigger before_additonal_payment 

BEFORE UPDATE 

DECLARE error message and return that error message 

update customers set extra_payment = 30000 where id = 1;

ErrorCode : 1644 : the new extra_payment should not be more than 2 emi amount 
-----

IF extra_payment > emi * 2
    SIGNAL SQLSTATE '45000'  SET MESSAGE_TEXT = errorMessage


