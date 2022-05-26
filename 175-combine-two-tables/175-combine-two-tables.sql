# Write your MySQL query statement below

SELECT lastName, firstName, city, state 
FROM Person 
LEFT JOIN Address
On Person.personId = Address.personId 