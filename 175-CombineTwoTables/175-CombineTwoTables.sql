-- Last updated: 3/24/2026, 11:29:48 AM
# Write your MySQL query statement below
select firstName,lastName,city,state from person
left join address on person.personId=address.personId;