

--making products table--
-- CREATE TABLE products (
--   product_id INT PRIMARY KEY,
--   product_name VARCHAR(50),
--   buyPrice DECIMAL(10, 2)
-- );

-- INSERT INTO products VALUES (1, 'iPhone 12', 80000);
-- INSERT INTO products VALUES (2, 'Samsung Galaxy S21', 50000);
-- INSERT INTO products VALUES (3, 'Google Pixel 5', 40000);
-- INSERT INTO products VALUES (4, 'PlayStation 5', 60000);
-- INSERT INTO products VALUES (5, 'Xbox X', 65000);

select * from products;
-- Aggregate function

-- -- !AVG()			    
-- select avg(buyPrice) from products as average_buy_price;


-- -- -- !BIT_AND()		   
--  SELECT BIT_AND(buyPrice) FROM products;


-- -- -- !BIT_OR()		
--  SELECT BIT_OR(buyPrice) FROM products;

-- -- -- !BIT_XOR()		    
-- SELECT BIT_XOR(buyPrice) FROM products;

-- -- --!COUNT()	
-- SELECT COUNT(productCode) FROM products as total;	
	
-- SELECT productLine, COUNT(*) AS productCount
-- FROM products
-- GROUP BY productLine
-- ORDER BY productLine;

-- SELECT productCode, SUM(quantityInStock * buyPrice) AS total_order_value
-- FROM products
-- GROUP BY productCode;

-- select 
-- firstName, 
-- lastName , 
-- group_concat(
--     distinct customerName 
--     order by customerName)
--      customers 
-- from employees 
-- inner join 
-- customers on customers.salesRepEmployeeNumber = employeeNumber 
-- group by employeeNumber 
-- order by firstName , lastName;