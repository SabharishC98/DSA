-- Last updated: 3/24/2026, 11:27:10 AM
# Write your MySQL query statement below
select name,bonus from employee left join 
bonus on employee.empid=bonus.empid
where bonus<1000 or bonus is null;
