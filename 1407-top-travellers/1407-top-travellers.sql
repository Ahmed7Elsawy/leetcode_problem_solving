# Write your MySQL query statement below

SELECT  name , SUM(coalesce(R.distance,0)) as travelled_distance 
From Users as U
# , Rides as R
# Where U.id = R.user_id 
LEFT JOIN Rides as R
ON U.id = R.user_id 
Group By R.user_id
ORDER BY SUM(R.distance) DESC , name ASC

