-- Last updated: 3/24/2026, 11:29:43 AM
# Write your MySQL query statement below
SELECT distinct l0.num as ConsecutiveNums
FROM Logs l0
INNER JOIN Logs l1 ON l0.id = l1.id+1
INNER JOIN Logs l2 ON l1.id = l2.id+1
WHERE l0.num = l1.num AND l1.num = l2.num;