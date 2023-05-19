
SELECT 
    productCode, SUM(priceEach * quantityOrdered) AS total
FROM 
    orderdetails
GROUP BY productCode
ORDER BY total DESC; 


SELECT
    firstName,
    lastName,
    GROUP_CONCAT(
        DISTINCT customerName
        ORDER BY customerName
    ) customers 
FROM 
    employees
INNER JOIN customers 
    ON customers.salesRepEmployeeNumber = employeeNumber
GROUP BY employeeNumber
ORDER BY firstName, lastName;


SELECT 
    AVG(buyPrice) 'Average Price'
FROM 
    products;

-- using WHERE clause

SELECT 
    AVG(buyPrice) 'Average Price of classic cars'
FROM 
    products
WHERE
    productLine= 'Classic Cars';

-- check if there are nay products which have some prices;

SELECT 
    COUNT(buyPrice) - COUNT(DISTINCT buyPrice)
FROM 
    products;

-- FORMAT 
SELECT 
    FORMAT(AVG(buyPrice), 2)
FROM 
    products;

    SELECT 
    AVG(buyPrice) 'Average Price of classic cars'
FROM 
    products
WHERE
    productLine= 'Classic Cars';

-- check if there are nay products which have some prices;

SELECT 
    COUNT(buyPrice) - COUNT(DISTINCT buyPrice)
FROM 
    products;

-- FORMAT 
SELECT 
    FORMAT(AVG(buyPrice), 2)
FROM 
    products;

-- using HAVING CLAUSE
SELECT 
    productLine,
    AVG(buyPrice) 'Average Price'
FROM 
    products
GROUP BY productLine
HAVING AVG(buyPrice) > 50;

-- CALCULATE the average buy price of the average buy prices of product lines;
SELECT 
    AVG(pl_avg) 'Average Product'
FROM (
    SELECT
    AVG(buyPrice) pl_avg
    FROM products GROUP BY productLine
) avgs;

-- pl_avg,:- 45, 67, 56, NULL, 45, 89
SELECT
    AVG( IF(productLine = 'Classic Cars', 
            buyPrice, 
            NULL)) / AVG(buyPrice) 'Classic Cars / Products'
FROM 
    products;

