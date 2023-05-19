

SELECT column_list
UNION [DISTINCT | ALL]
SELECT column_list
UNION [DISTINCT | ALL]
SELECT column_list
...

-- 


-- Create 2 tables;
DROP TABLE IF EXISTS t1;
DROP TABLE IF EXISTS t2;

CREATE TABLE t1 (
    id INT PRIMARY KEY
);

CREATE TABLE t2 (
    id INT PRIMARY KEY
);

INSERT INTO t1 VALUES (1),(2),(3);
INSERT INTO t2 VALUES (2),(3),(4);


-- combine result sets returned from t1 and t2 tables with UNION 
-- combine result sets returned from t1 and t2 tables with UNION ALL

-- use customers and employees

-- combine the first name and last name of employees and customers into a single result set
+-----------+-----------+
| firstName | lastName  |
+-----------+-----------+
| Diane     | Murphy    |
| Mary      | Patterson |
| Jeff      | Firrelli  |
| William   | Patterson |
| Gerard    | Bondur    |
| Anthony   | Bow       |
-------------------------

-- combine the first name and last name of employees and customers into a single result set as a full name single column 
+-------------------+
| fullname          |
+-------------------+
| Diane Murphy      |
| Mary Patterson    |
| Jeff Firrelli     |
| William Patterson |
| Gerard Bondur     |
| Anthony Bow       |
| Leslie Jennings   |
| Leslie Thompson   |
| Julie Firrelli    |
| Steve Patterson   |
+-------------------+

-- sort the result set of a union by fullname
+--------------------+
| fullname           |
+--------------------+
| Adrian Huxley      |
| Akiko Shimamura    |
| Alejandra  Camino  |
| Alexander  Feuer   |
| Alexander  Semenov |
| Allen Nelson       |
| Andy Fixter        |
| Ann  Brown         |
+--------------------+ 

-- differentiate between employees and customers, you can add a column

SELECT
    CONCAT(firstName, ' ', lastName) fullname,
    'Employee' as contactType
FROM
    employees 
UNION 
SELECT 
    CONCAT(contactFirstName, ' ', contactLastName),
    'Customer' AS contactType
FROM 
    customers
ORDER BY 
    fullname LIMIT 10;

+--------------------------+-------------+
| fullname                 | contactType |
+--------------------------+-------------+
| Adrian Huxley            | Customer    |
| Akiko Shimamura          | Customer    |
| Alejandra  Camino        | Customer    |
| Alexander  Feuer         | Customer    |
| Alexander  Semenov       | Customer    |
| Allen Nelson             | Customer    |
| Andy Fixter              | Employee    |
------------------------------------------

--------------------------


SELECT 
    CONCAT(firstName,' ',lastName) fullname
FROM
    employees 
UNION SELECT 
    CONCAT(contactFirstName,' ',contactLastName)
FROM
    customers
ORDER BY 1;

----------------------------------------------------------------------------------------------------------



SELECT select_list1 
FROM table_name1
MINUS 
SELECT select_list2 
FROM table_name2;


CREATE TABLE t1 (
    id INT PRIMARY KEY
);

CREATE TABLE t2 (
    id INT PRIMARY KEY
);

INSERT INTO t1 VALUES (1),(2),(3);
INSERT INTO t2 VALUES (2),(3),(4);

SELECT id FROM t1
MINUS
SELECT id FROM t2; 


SELECT 
    select_list
FROM 
    table1
LEFT JOIN table2 
    ON join_predicate
WHERE 
    table2.column_name IS NULL; 



SELECT 
    id
FROM
    t1
LEFT JOIN
    t2 USING (id)
WHERE
    t2.id IS NULL;




(SELECT column_list 
FROM table_1)
INTERSECT
(SELECT column_list
FROM table_2);


-- The following statements create tables t1 and t2, and then insert data into both tables.
CREATE TABLE t1 (
    id INT PRIMARY KEY
);

CREATE TABLE t2 LIKE t1;

INSERT INTO t1(id) VALUES(1),(2),(3);

INSERT INTO t2(id) VALUES(2),(3),(4);


-- Emulate INTERSECT using DISTINCT and INNER JOIN clause
-- The following statement uses DISTINCT operator and INNER JOIN clause to return the distinct rows in both tables:

SELECT DISTINCT 
   id 
FROM t1
   INNER JOIN t2 USING(id);


-- Emulate INTERSECT using IN and subquery
-- The following statement uses the IN operator and a subquery to return the intersection of the two result sets.

SELECT DISTINCT id
FROM t1
WHERE id IN (SELECT id FROM t2);