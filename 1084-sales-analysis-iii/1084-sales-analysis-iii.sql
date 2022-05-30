# Write your MySQL query statement below

SELECT distinct Product.product_id, Product.product_name
FROM Product
WHERE Product.product_id NOT IN (
    SELECT product_id
    FROM  Sales
    WHERE  Sales.sale_date < "2019-01-01" 
    OR  Sales.sale_date > "2019-03-31" 
)
