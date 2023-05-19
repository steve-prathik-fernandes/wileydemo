-- MySQL WHERE clause
SELECT 
    select_list
FROM
    table_name
WHERE
    search_condition;



SELECT
    lastName,
    firstName,
    jobTitle
FROM
    employees
WHERE
    jobTitle = "Sales Rep";   


SELECT
    lastName,
    firstName,
    jobTitle,
    officeCode
FROM
    employees
WHERE
    jobTitle = "Sales Rep"
    AND officeCode = 1;

-- MySQL WHERE clause with OR operator
-- Find employees whose job title is Sales Rep or employees who locate the office with office code 1
SELECT
    lastName,
    firstName,
    jobTitle,
    officeCode
FROM
    employees
WHERE
    jobTitle = "Sales Rep"
    AND officeCode = 1
ORDER BY
    officeCode,
    jobTitle;


-- MySQL WHERE clause with the BETWEEN operator:
-- Find employees who locate in offices whose office code is from 1 to 3:

    SELECT
    lastName,
    firstName,
    jobTitle,
    officeCode
FROM
    employees
WHERE
    officeCode BETWEEN 1
    AND 3
ORDER BY
    officeCode;    


 -- Find the employees whose last names end with the string 'son'
SELECT  
lastName,
    firstName
FROM
    employees
WHERE
    lastName LIKE "%son"
ORDER BY
    firstName;

    /* use the WHERE clause with the IN operator to 
find employees who locate in the office with office code 1 */

SELECT 
    firstName, 
    lastName, 
    officeCode
FROM
    employees
WHERE
    officeCode IN (1 , 2, 3)
ORDER BY 
    officeCode;


-- Use the WHERE clause with the IS NULL operator to get the rows with the values in the reportsTo column are NULL:
SELECT
    firstName,
    lastName,
    reportsTo
FROM
    employees
WHERE
    reportsTo IS NULL;

-- IS NOT NULL 
SELECT
    firstName,
    lastName,
    reportsTo
FROM
    employees
WHERE
    reportsTo IS NOT NULL;

    -- Use the not equal to (<>) operator to find all employees who are not the Sales Rep:
SELECT
    firstName,
    lastName,
    jobTitle
FROM
    employees
WHERE
    jobTitle <> 'Sales Rep';

-- find employees whose office code is greater than 5
SELECT
    firstName,
    lastName,
    jobTitle
FROM
    employees
WHERE
    officeCode > 5;

-- return employees with office code less than or equal to 4 (<=4):
SELECT
    firstName,
    lastName,
    jobTitle
FROM
    employees
WHERE
    officeCode <= 4;

-- MySQL DISTINCT clause
/*When querying data from a table, you may get duplicate rows. To remove these duplicate rows, you use the DISTINCT clause in the SELECT statement.*/

-- use the employees
SELECT DISTINCT
    select_list
FROM
    table_name
WHERE 
    search_condition
ORDER BY 
    sort_expression;

/*When executing the SELECT statement with the DISTINCT clause, MySQL evaluates the DISTINCT 
clause after the FROM, WHERE, and SELECT clause and before the ORDER BY clause:*/
    FROM -> WHERE -> SELECT -> DISTINCT -> ORDER BY

SELECT
    DISTINCT lastName
FROM
    employees
ORDER BY
    lastName;

-- DISTINCT NULL
SELECT
    state
FROM
    customers;

--
SELECT
    DISTINCT state
FROM
    customers;

--
SELECT
    DISTINCT state,
    city
FROM
    customers
WHERE
    state IS NOT NULL
ORDER BY
    state,
    city;

-- name, country (USA), state CA, credit limit > 100000 , 
SELECT
    customerName,
    country
FROM
    customers
WHERE
    country = "USA"
    AND state = "CA"
    AND creditLimit > 100000;
--
SELECT
    customerName,
    country
FROM
    customers
WHERE
    country = "USA"
    OR country = "France"
    AND creditLimit > 100000;