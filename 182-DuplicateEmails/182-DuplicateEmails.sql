-- Last updated: 3/24/2026, 11:29:42 AM
# Write your MySQL query statement below
select distinct email from person group by email having count(email)>1;