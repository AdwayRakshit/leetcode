
with firstorders as (
    select customer_id,min(order_date) as firstdate,min(customer_pref_delivery_date) as prefdate from Delivery
    group by customer_id)

select round(avg(
    case when firstdate =prefdate
    then 1 else 0 
    end

)*100,2)as immediate_percentage 
from firstorders;