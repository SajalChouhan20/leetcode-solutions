# Write your MySQL query statement below
SELECT d.name AS Department,
       e.name AS Employee,
       e.Salary AS Salary
FROM Employee e
JOIN Department d ON e.Departmentid = d.id
WHERE e.Salary = (
    SELECT MAX(Salary)
    FROM Employee
    WHERE departmentid=e.departmentid
);