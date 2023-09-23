package com.example.demo_tuan2.servers;


import com.example.demo_tuan2.models.Products;
import com.example.demo_tuan2.repository.Product_Repository;

import java.util.List;

public class ProductSever {
    private Product_Repository repon= new Product_Repository();
    public boolean create (Products pro){
        return repon.Create_Pro(pro);
    }
    public  boolean Update(Products pro){
        return repon.Update_Pro(pro);
    }
    public List<Products> GetAll(){
        return  repon.GetAll();
    }
}
