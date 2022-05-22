# Write your MySQL query statement below

Select employee_id,
IF (Employees.employee_id&1=1 and Employees.name Not Like 'M%',salary,0) as bonus
from Employees;