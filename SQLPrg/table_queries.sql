CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    priority TINYINT NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id , task_id),
    FOREIGN KEY (task_id)
        REFERENCES tasks (task_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);

-------------------- 
-- Alter the table

CREATE TABLE vehicles (
    vehicleId INT, 
    year INT NOT NULL,
    make VARCHAR(100) NOT NULL,
    PRIMARY KEY(vehicleId)
);

ALTER TABLE vehicles ADD model VARCHAR(100) NOT NULL;

DESCRIBE vehicles;

-- alter table to add multiple columns
ALTER TABLE vehicles 
    ADD model VARCHAR(100) NOT NULL,
    ADD note VARCHAR(100) NOT NULL;

--------------------
-- modify columns
ALTER TABLE vehicles 
    MODIFY note VARCHAR(255) NOT NULL,
    MODIFY model VARCHAR(50) NOT NULL;

------------------
-- rename columns

ALTER TABLE vehicles 
    CHANGE COLUMN note vehicleCondition VARCHAR(255) NOT NULL;

-----------
-- drop columns
ALTER TABLE vehicles 
    DROP COLUMN vehicleCondition;

-------
-- Rename the table name
ALTER TABLE vehicles RENAME TO cars;

----------------------

-- RENAME tables 

CREATE DATABASE IF NOT EXISTS hr;

CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100)
);

CREATE TABLE employees (
    id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    department_id int not null,
    FOREIGN KEY (department_id)
        REFERENCES departments (department_id)
);

INSERT INTO departments(dept_name)
VALUES('Sales'),('Markting'),('Finance'),('Accounting'),('Warehouses'),('Production');

INSERT INTO employees(first_name,last_name,department_id) 
VALUES('John','Doe',1),
		('Bush','Lily',2),
		('David','Dave',3),
		('Mary','Jane',4),
		('Jonatha','Josh',5),
		('Mateo','More',1);

SELECT 
    department_id, dept_name
FROM 
    departments;

SELECT 
    id, first_name, last_name, department_id
FROM 
    employees;


------------------
-- Referenced by VIEW 

CREATE VIEW v_employee_info AS 
    SELECT
        id, first_name, last_name, dept_name
    from 
        employees
            INNER JOIN 
        departments USING(department_id);


-- rename table employee to people;

    RENAME TABLE employees TO people;

-----------------------


rename departments to depts 

delete from detps where department_id is 1

-------------
-- rename multiple tables

RENAME TABLE 
    depts TO departments,
    people TO employees;

----------------

Rename tables using alter table 

Syntax:
ALTER TABLE old_table_name TO new_table_name; 

--------------

CREATE TEMPORARY TABLE lastNames 
SELECT DISTINCT last_name FROM employees;

RENAME TABLE lastnames TO unique_lastnames;
-- ERROR 1146 (42S02): Table 'hr.lastnames' doesn't exist

alter table lastNames rename to unique_lastnames;

-- Query OK, 6 rows affected (0.01 sec)
-- Records: 6  Duplicates: 0  Warnings: 0


--------------------------------------------
-- ADD COLUMN 

database_name
    table1 
    table2 

ALTER TABLE table_name 
    AADD COLUMN ...., (exits)


--- 
SELECT 
    IF(count(*) = 1 , 'Exist', 'Not Exist') AS result
FROM 
    information_schems.columns 
WHERE 
    table_schema = "database_name" -- db name
        AND table_name = "table_name" -- tablle  name
        AND column_name = "location"; -- column name

----------------------------------------------
DROP COLUMNS 

--------------------------------------
DROP TABLE 

DROP TABLE  table_name;

DROP TABLE table_name, table1, table2;

DROP TABLE IF EXISTS table_name;

DROP TABLE Like '%pattern%';

---------------------------------------------
CREATE TABLE test1();

CREATE TABLE IF NOT EXISTS test2 LIKE test1;
CREATE TABLE IF NOT EXISTS test3 LIKE test1;

--- set table schema and pattern matching for the tables 

SET @schema = 'database_name'
SET @pattern = 'test%'

-- construct a dynamic sql drop table(tbl1, tbl2, ...)

-- dbname.tablename

SELECT CONCAT('DROP TABLE', GROUP_CONCAT(CONCAT(@schema,'.'table_name)),';')
INTO @dropLike 
FROM information_schema.tables 
WHERE @schema = database()
AND table_name LIKE @pattern;


SELECT @dropLike;

DROP TABLE empdb.test1, empdb.test2, empdb.test3;
---------------------

-- TRUNCATE table 

--------------

-- GENERATED COLUMNS 

CREATE TABLE IF NOT EXISTS contacts(
    id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    full_name VARCHAR(100) GENERATED ALWAYS AS (CONCAT(first_name,' ',last_name))
)

ALTER TABLE contacts
    ADD COLUMN full_name data_type
    GENERATED ALWAYS AS (formula) STORED;

-- VIRTUAL and STORED
----------------



  