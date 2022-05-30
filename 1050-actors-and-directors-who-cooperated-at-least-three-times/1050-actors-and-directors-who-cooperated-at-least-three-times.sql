# Write your MySQL query statement below

SELECT actor_id, director_id 
From ActorDirector
GROUP BY actor_id, director_id
Having COUNT(*) > 2