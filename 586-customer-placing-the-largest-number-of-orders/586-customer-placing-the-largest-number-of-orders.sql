# Write your MySQL query statement below

Select  customer_number
from Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1
