-- Last updated: 3/24/2026, 11:24:03 AM
select customer_id,count(customer_id) as count_no_trans from
visits left join transactions on
visits.visit_id=transactions.visit_id
where transactions.visit_id is null
group by customer_id
order by count_no_trans;