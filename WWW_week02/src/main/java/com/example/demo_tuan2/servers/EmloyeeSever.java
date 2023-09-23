package com.example.demo_tuan2.servers;

import com.example.demo_tuan2.models.Emloyee;
import com.example.demo_tuan2.repository.Emloyee_Repository;

import java.util.List;

public class EmloyeeSever {
    private Emloyee_Repository repon = new Emloyee_Repository();
    public boolean create (Emloyee e){
        return repon.Creat_Emloy(e);
    }
    public  boolean Update(Emloyee e){
        return repon.Update_Emloy(e);
    }
    public List<Emloyee > GetAll(){
        return  repon.GetAll();
    }
}
