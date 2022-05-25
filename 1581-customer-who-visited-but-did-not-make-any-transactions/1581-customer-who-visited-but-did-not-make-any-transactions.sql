# Write your MySQL query statement below

Select customer_id , COUNT(customer_id) as count_no_trans
From Visits 
Where visit_id NOT IN (
Select visit_id  
From Transactions 
)
Group BY customer_id