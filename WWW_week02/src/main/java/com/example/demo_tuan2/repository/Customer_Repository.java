package com.example.demo_tuan2.repository;

import com.example.demo_tuan2.models.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.logging.Logger;

public class Customer_Repository {
    private EntityManager em;
    private EntityTransaction trans;
    private Logger log;

    public Customer_Repository() {

            em= Connection.getInstance().getEnf().createEntityManager();

    }

    public  boolean Creat_Cus(Customer cus){
        trans= em.getTransaction();
        try {
            trans.begin();
            em.persist(cus);
            trans.commit();
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            trans.rollback();

        }
        return false;
    }
    public  boolean Update_Cus(Customer cus){
        trans= em.getTransaction();
        try {
            trans.begin();
            em.merge(cus);
            trans.commit();
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            trans.rollback();

        }
        return false;
    }
    public List<Customer> GetAll(){
        List<Customer> list = em.createQuery("select c from Customer c").getResultList();
        return list;
    }
}
