package com.example.demo_tuan2.servers;

import com.example.demo_tuan2.models.Customer;
import com.example.demo_tuan2.repository.Customer_Repository;

import java.util.List;

public class CustomerServe {
    private Customer_Repository repon = new Customer_Repository();

    public boolean create (Customer cus){
        return repon.Creat_Cus(cus);
    }
    public  boolean Update(Customer customer){
        return repon.Update_Cus(customer);
    }
    public List<Customer> GetAll(){
        return  repon.GetAll();
    }
}
