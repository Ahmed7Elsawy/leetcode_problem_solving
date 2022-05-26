# Write your MySQL query statement below

select S.name from SalesPerson as S Where  S.sales_id NOt IN 
(select O.sales_id from Company as C, Orders as O
Where C.com_id = O.com_id AND C.name = 'RED' )