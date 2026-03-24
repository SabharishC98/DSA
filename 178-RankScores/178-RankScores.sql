-- Last updated: 3/24/2026, 11:29:45 AM
# Write your MySQL query statement below
select Score, dense_rank() over(order by Score desc) as 'Rank' from Scores