-- Last updated: 3/24/2026, 11:29:46 AM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE M INT;
  SET M = N - 1;        
  RETURN (
      SELECT IFNULL(
        (SELECT DISTINCT salary
         FROM Employee
         ORDER BY salary DESC
         LIMIT 1 OFFSET M),
      NULL)
  );
END