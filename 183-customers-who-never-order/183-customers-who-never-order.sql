Select name as Customers
from Customers 
Where Customers.id  Not In 
(Select customerId from Orders)