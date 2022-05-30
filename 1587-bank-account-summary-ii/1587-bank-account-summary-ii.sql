# Write your MySQL query statement below

SELECT name, SUM(amount) as balance
FROM Users 
LEFT JOIN Transactions
ON Users.account = Transactions.account  
Group By Transactions.account 
Having balance > 10000


 


