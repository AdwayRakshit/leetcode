select id from
 (select id ,temperature,recordDate,lag(temperature)over(order by recordDate ) as prev,lag(recordDate)over(order by recordDate)as prevdate from weather) temp
 where temperature>prev and datediff(recordDate,prevdate)=1;
