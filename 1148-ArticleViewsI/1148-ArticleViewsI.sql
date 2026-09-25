-- Last updated: 9/25/2026, 2:39:20 PM
# Write your MySQL query statement below
select distinct author_id as id from views where author_id=viewer_id order by id;