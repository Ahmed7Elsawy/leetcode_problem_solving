# Write your MySQL query statement below

Select Distinct V1.author_id as id
from Views as V1, Views as V2
where v1.author_id = v2.viewer_id AND v1.author_id = v2.author_id 
order by v1.author_id
