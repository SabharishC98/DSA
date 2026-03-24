-- Last updated: 3/24/2026, 11:27:12 AM
# Write your MySQL query statement below
select f.name from employee f where f.id in (select m.managerId from employee m group by managerId having count(m.managerId)>4) ;