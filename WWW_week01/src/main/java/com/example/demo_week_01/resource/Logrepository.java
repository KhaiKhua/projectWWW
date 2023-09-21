package com.example.demo_week_01.resource;

import com.example.demo_week_01.models.Log;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class Logrepository {
    private EntityManager ma;
    private EntityTransaction trans;

    public Logrepository() {
        ma = connection.getInstance().getFact().createEntityManager();
    }

    public boolean CreatLog(Log log) {
        trans = ma.getTransaction();
        trans.begin();
        try {
            ma.persist(log);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();


        }
        return false;

    }
    public List<Log> findLog( String id){
        return ma.createQuery("select l from Log l where l.account.account_id="+id).getResultList();
    }
}
