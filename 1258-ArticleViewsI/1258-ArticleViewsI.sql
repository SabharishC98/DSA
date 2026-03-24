-- Last updated: 3/24/2026, 11:24:56 AM
# Write your MySQL query statement below
select distinct author_id as id from views where author_id=viewer_id order by id;