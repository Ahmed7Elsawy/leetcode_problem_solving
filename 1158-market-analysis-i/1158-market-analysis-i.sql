# Write your MySQL query statement below

SELECT U.user_id as buyer_id, U.join_date as join_date,
Count(O.buyer_id) as orders_in_2019
FROM Users as U
LEFT JOIN Orders as O
ON U.user_id = O.buyer_id && YEAR(O.order_date) = 2019
GROUP BY U.user_id

# LEFT JOIN Orders as O
# ON U.user_id = O.buyer_id
# Items as I

