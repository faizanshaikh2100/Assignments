
delimiter $$
create procedure getCustomers()
   begin
   select
   customerName,
   city,
   state,
   postalCode
   country
   from
   customers
   order by
   customerName;
  end $$
  delimiter; 

  
delimiter $$
create procedure getProducts()
   begin
   select
   productCode,
   productName
   from
   products
   order by
   productName;
  end $$
  delimiter; 



delimiter $$
use 'wileyclassic' $$
create procedure 'getAllCustomers'()
   begin
   select
   *
   from
   customers;
  end $$;



delimiter $$
create procedure getOfficesByCoutry(
    in customerName VARCHAR(255)
)
begin
select * from offices where country=customerName;
end $$
delimiter;



delimiter $$
create procedure setCount(
    inout counter int,
    in inc int
)

begin
set counter=counter+inc;
end $$ 
delimiter;

set @counter=1;
call setCount(@counter,1);

call setCount(@counter,1);
call setCount(@counter,5);
select @counter;


create table supplierProducts(
        supplierId int,
        productId int,

        PRIMARY key (supplierId,productId)
    )
    delimiter $$
    create procedure InsertSupplierProduct(
        in inSupplierId int,
        int inProductId int
    )
    begin   
        declare exit handler for 1062
        begin
            select concat('Duplicate key (',inSupplierId,
            ',' ,inProductId,') occured') as message;
        end;

    insert into supplierProducts(supplierId,productId) 
    values(inSupplierId,inProductId);

    select count(*)
    from supplierProducts
    where supplierId-inSupplierId;

    end $$
    delimiter;  



delimiter $$
create function customerLevel(
    credit decimal(10,2)

)
return VARCHAR(20)
deterministic
begin   
    declare customerLevel VARCHAR(20) ;
    if credit >50000 then
        set customerLevel='platinum';
    elseif(credit <=50000 and credit >=10000) then
        set customerLevel='Gold';
    elseif credit <10000 then
        set customerLevel ='silver';

     end if;

    return (customerLevel);

 end $$;
delimiter ;
    