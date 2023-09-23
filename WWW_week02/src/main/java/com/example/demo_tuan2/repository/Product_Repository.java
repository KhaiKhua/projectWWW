package com.example.demo_tuan2.repository;


import com.example.demo_tuan2.models.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.logging.Logger;

public class Product_Repository {
    private EntityManager em;
    private EntityTransaction tran;
    private Logger log;

    public Product_Repository() {
        em= Connection.getInstance().getEnf().createEntityManager();
    }

    public boolean Create_Pro(Products pro){
        tran = em.getTransaction();
        try {
            tran.begin();
            em.persist(pro);
            tran.commit();
            return true;
        }catch (Exception e){
            tran.rollback();
            e.printStackTrace();

        }
        return false;
        }

    public boolean Update_Pro(Products pro){
        tran = em.getTransaction();
        try {
            tran.begin();

            em.merge(pro);
            tran.commit();
            return true;
        }catch (Exception e){
            tran.rollback();
            e.printStackTrace();

        }
        return false;
    }
    public List<Products> GetAll(){
        List<Products> list = em.createQuery("select p from Products d").getResultList();
        return list;
    }

}

