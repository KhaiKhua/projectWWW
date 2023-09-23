package com.example.demo_tuan2.repository;

import com.example.demo_tuan2.models.Emloyee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.logging.Logger;

public class Emloyee_Repository {
    private EntityTransaction trans;
    private EntityManager em;
    private Logger log;

    public Emloyee_Repository() {
        em= Connection.getInstance().getEnf().createEntityManager();
    }

    public  boolean Creat_Emloy(Emloyee emloy){
        trans= em.getTransaction();
        try {
            trans.begin();
            em.persist(emloy);
            trans.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            trans.rollback();

        }
        return false;
    }
    public  boolean Update_Emloy(Emloyee emloy){
        trans= em.getTransaction();
        try {
            trans.begin();
            em.merge(emloy);
            trans.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            trans.rollback();

        }
        return false;
    }
    public List<Emloyee> GetAll(){
        List<Emloyee> List = em.createQuery("Select e from Emloyee e").getResultList();

        return List;
    }
}
