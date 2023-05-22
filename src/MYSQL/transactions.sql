-- set autocommit= off;

-- Start transaction;
-- select *
-- @OrderNumber:=MAX(orderNumber)+1
-- from
-- orders;

-- insert into orders(orderNumber,orderDate,requiredDate,shippedDate,status,customerNumber)
-- values (@OrderNumber , '2005-05-31','2005-06-10','2005-06-11','In process',145);

-- insert into orderDetails(orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber)
-- values(@orderNumber,'S19_1749',30,'136',1),
--        (@orderNumber,'S18_2248',50,'55.09',2);
-- commit;

-- delete from orderDetails;
-- select * from orderDetails;
-- rollback;
select * from orderDetails;