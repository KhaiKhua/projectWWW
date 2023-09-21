package com.example.demo_week_01.resource;

import com.example.demo_week_01.models.GrantAccess;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class GranAccessRepository {
    private EntityManager ma;
    private EntityTransaction trans;

    public GranAccessRepository() {
        ma = connection.getInstance().getFact().createEntityManager();
    }

    public boolean CreatGrant(GrantAccess Grant) {
        trans = ma.getTransaction();
        trans.begin();
        try {
            ma.persist(Grant);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();


        }
        return false;

    }
}
