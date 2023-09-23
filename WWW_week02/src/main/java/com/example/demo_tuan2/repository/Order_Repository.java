package com.example.demo_tuan2.repository;

import com.example.demo_tuan2.models.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.logging.Logger;

public class Order_Repository {
    private EntityManager em;
    private EntityTransaction tr;
    private Logger Log;

    public Order_Repository() {
        em= Connection.getInstance().getEnf().createEntityManager();
    }

    public  boolean Create_Oder(Order Order){
       tr= em.getTransaction();
       try {
           tr.begin();
           em.persist(Order);
           tr.commit();
           return true;
       }catch (Exception e){
           tr.rollback();
           e.printStackTrace();

       }
       return false;
    }
    public  boolean Update(Order Order){
        tr= em.getTransaction();
        try {
            tr.begin();
            em.merge(Order);
            tr.commit();
            return true;
        }catch (Exception e){
            tr.rollback();
            e.printStackTrace();

        }
        return false;
    }
    public List<Order> getalllist(){
        List<Order> list = em.createQuery("Select o from Order o").getResultList();
        return list;
    }
}
