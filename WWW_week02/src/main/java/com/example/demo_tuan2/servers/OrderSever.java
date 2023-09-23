package com.example.demo_tuan2.servers;


import com.example.demo_tuan2.models.Order;
import com.example.demo_tuan2.repository.Order_Repository;

import java.util.List;

public class OrderSever {
    private Order_Repository repon = new Order_Repository();
    public boolean create (Order o){
        return repon.Create_Oder(o);
    }
    public  boolean Update(Order o){
        return repon.Update(o);
    }
    public List<Order> GetAll(){
        return  repon.getalllist();
    }
}
