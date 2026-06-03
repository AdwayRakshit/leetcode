WITH ManagerReportCount AS (
    SELECT 
        managerId, 
        COUNT(*) AS direct
    FROM 
        Employee
    WHERE 
        managerId IS NOT NULL
        group by managerId
 
)
SELECT e.name FROM Employee e left join ManagerReportCount m   on e.id=m.managerId  
where m.direct>=5;


