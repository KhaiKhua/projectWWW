package com.example.demo_week_01.resource;


import com.example.demo_week_01.models.Log;
import com.example.demo_week_01.models.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class RoleRepository {
    private EntityManager ma;
    private EntityTransaction trans;

    public RoleRepository() {
        ma = connection.getInstance().getFact().createEntityManager();
    }

    public boolean CreatRole(Role rol) {
        trans = ma.getTransaction();
        trans.begin();
        try {
            ma.persist(rol);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();


        }
        return false;

    }
    public boolean Update(Role rol) {
        trans = ma.getTransaction();
        trans.begin();
        try {
            ma.persist(rol);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            e.printStackTrace();


        }
        return false;

    }
    public List<Role> getlisst(){
        return ma.createQuery("select r from Role r").getResultList();
    }
    public  Role find (String id){
        return (Role) ma.createQuery("selecr r form Role r where r.role_id= "+id).getSingleResult();
    }
}
