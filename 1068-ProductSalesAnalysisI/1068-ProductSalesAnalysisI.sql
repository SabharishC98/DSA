-- Last updated: 9/25/2026, 2:40:06 PM
select product_name,year,price 
from Sales join Product on
Sales.product_id=Product.product_id;