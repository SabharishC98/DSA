-- Last updated: 9/25/2026, 2:37:23 PM
select unique_id,name 
from Employees left join EmployeeUNI on 
Employees.id=EmployeeUNI.id;