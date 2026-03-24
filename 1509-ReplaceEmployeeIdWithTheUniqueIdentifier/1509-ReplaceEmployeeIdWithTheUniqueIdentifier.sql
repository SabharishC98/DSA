-- Last updated: 3/24/2026, 11:24:22 AM
select unique_id,name 
from Employees left join EmployeeUNI on 
Employees.id=EmployeeUNI.id;