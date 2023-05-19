
SELECT
    lastName,
    firstName
FROM
    employees
WHERE
    officeCode IN(
        SELECT
            officeCode
        FROM
            offices
        WHERE
            country = 'USA'
    );


SELECT
    customerNumber,
    checkNumber,
    amount
FROM
    payments
WHERE
    amount = (
        SELECT
            MAX(amount)
        FROM
            payments
    );

-------------------------
SELECT
    customerNumber,
    checkNumber,
    amount
FROM
    payments
WHERE
    amount > (
        SELECT
            AVG(amount)
        FROM
            payments
    );

--MySQL subquery with IN and NOT IN operators

    customerName
FROM
    customers
WHERE
    customerNumber NOT IN (
        SELECT
            DISTINCT customerNumber
        FROM
            orders
    );

-- MySQL subquery in the FROM clause
-- Find the maximum, minimum, and average number of items in sale orders with SubQuery 
SELECT
    MAX(items),
    MIN(items),
    FLOOR(AVG(items))
FROM
    (
        SELECT
            orderNumber,
            COUNT(orderNumber) AS items
        FROM
            orderdetails
        GROUP BY
            orderNumber
    ) as lineItems;

-
    productName,
    buyprice
FROM
    products p1
WHERE
    buyprice > (
        SELECT
            AVG(buyprice)
        FROM
            products
        WHERE
            productline = p1.productline
    );

/*
 Note: 

 EXISTS operator:
 */
SELECT
    *
FROM
    table_name
WHERE
    EXISTS(subquery);

-- Use orders and orderdetails table
-- Find sales orders whose total values are greater than 60K.
SELECT
    orderNumber,
    SUM(priceEach * quantityOrdered) total
FROM
    orderdetails
    INNER JOIN orders USING (orderNumber)
GROUP BY
    orderNumber
HAVING
    SUM(priceEach * quantityOrdered) > 60000;


--------
SELECT
    customerNumber,
    customerName
FROM
    customers
WHERE
    EXISTS(
        SELECT
            orderNumber,
            SUM(priceEach * quantityOrdered)
        FROM
            orderdetails
            INNER JOIN orders USING (orderNumber)
        WHERE
            customerNumber = customers.customerNumber
        GROUP BY
            orderNumber
        HAVING
            SUM(priceEach * quantityOrdered) > 60000
    );

--------------------------------------------------------------------------------------------
-- MySQL Derived Tables
SELECT
    select_list
FROM
    (
        SELECT
            select_list
        FROM
            table_1
    ) derived_table_name
WHERE
    derived_table_name.c1 > 0;

-- Get the top five products by sales revenue in 2003 from the orders and orderdetails tables
SELECT
    productCode,
    SUM(quantityOrdered * priceEach) sales
FROM
    orderdetails
    INNER JOIN orders USING(orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    productCode
ORDER BY
    sales DESC
LIMIT
    5;

-- Use the result of this query as a derived table and join it with the products table
SELECT
    productName,
    sales
FROM
    (
        SELECT
            productCode,
            ROUND(SUM(quantityOrdered * priceEach)) sales
        FROM
            orderdetails
            INNER JOIN orders USING(orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            productCode
        ORDER BY
            sales DESC
        LIMIT
            5
    ) top5Product2003
    INNER JOIN products USING(productCode);


 */
SELECT
    customerNumber,
    ROUND(SUM(quantityOrdered * priceEach)) sales,
    (
        CASE
            WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
            WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
            AND 100000 THEN 'Gold'
            WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
        END
    ) customerGroup
FROM
    orderdetails
    INNER JOIN orders USING(orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    customerNumber;

-------------------------------------------------
SELECT
    customerGroup,
    COUNT(cg.customerGroup) AS groupCount
FROM
    ( SELECT
        customerNumber,
        ROUND(SUM(quantityOrdered * priceEach)) sales,
        (
            CASE
                WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
                WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
                AND 100000 THEN 'Gold'
                WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
            END
        ) customerGroup
        FROM
            orderdetails
            INNER JOIN orders USING(orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            customerNumber
    ) cg
GROUP BY
    cg.customerGroup;


SELECT
    select_list
FROM
    a_table
WHERE
    [NOT] EXISTS(subquery);


SELECT 
    employeenumber,
    firstname, 
    lastName,
    extension
FROM
    employees
WHERE EXISTS(
    SELECT 1 FROM offices WHERE city = 'San Francisco' AND
    offices.officeCode = employees.officeCode
);

-------- UPDATE 
UPDATE employees
SET 
    extension = CONCAT(extension, '1')
WHERE EXISTS(
    SELECT 1 FROM offices WHERE city = 'San Francisco' AND
    offices.officeCode = employees.officeCode
);


-- MySQL INSERT EXISTS
-- Archive customers who don’t have any sales order in a separate table. 

CREATE TABLE customers_archive LIKE customers;

INSERT INTO customers_archive 
SELECT * FROM customers 
WHERE NOT EXISTS (
    SELECT 
        1 
    FROM 
        orders 
    WHERE 
        orders.customerNumber = customers.customerNumber
    );
---------------------------------------------------------------------------------------------
-- MySQL DELETE EXISTS 
-- Archiving the customer data is to delete the customers that exist in 
    -- the customers_archive table from the customers table

DELETE FROM customers 
WHERE EXISTS(
    SELECT 1 
    FROM customers_archive a 
    WHERE a.customerNumber = customers.customerNumber
);

------------------------------------------------------------------------------------------------
-- MySQL EXISTS operator vs. IN operator
-- find the customer who has placed at least one order, you can use the IN operator

SELECT 
    customerNumber, 
    customerName
FROM
    customers
WHERE
    customerNumber IN (
        SELECT 
            customerNumber
        FROM
            orders);
            
------------
SELECT 
    customerNumber,
    customerName
FROM
    customers 
WHERE 
EXISTS (
    SELECT 1 FROM orders WHERE orders.customerNumber = customers.customerNumber
);

-- QUERY COST

EXPLAIN SELECT 
    customerNumber,
    customerName
FROM
    customers 
WHERE 
EXISTS (
    SELECT 1 FROM orders WHERE orders.customerNumber = customers.customerNumber
);