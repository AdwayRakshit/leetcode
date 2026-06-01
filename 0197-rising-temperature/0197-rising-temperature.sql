select t.id from Weather t
join Weather y on Datediff(t.recordDate,y.recordDate)=1
where t.temperature>y.temperature;
