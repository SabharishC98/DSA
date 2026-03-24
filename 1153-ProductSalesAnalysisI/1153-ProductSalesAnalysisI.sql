-- Last updated: 3/24/2026, 11:25:10 AM
select product_name,year,price 
from Sales join Product on
Sales.product_id=Product.product_id;