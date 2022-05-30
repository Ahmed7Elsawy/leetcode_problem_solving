# Write your MySQL query statement below

SELECT id, 
CASE 
    WHEN(p_id is NULL) THEN "Root"
    WHEN(id NOT IN (SELECT DISTINCT p_id FROM Tree WHERE P_id IS NOT NULL) and p_id is not null) THEN "Leaf" 
    ELSE "Inner"
END as type 
FROM Tree

