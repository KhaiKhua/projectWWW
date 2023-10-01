package com.example.demo_week_01.resource;

import com.example.demo_week_01.models.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class AcountRepository {
    private EntityManager em ;
    private EntityTransaction tran;

    public AcountRepository() {
        this.em = connection.getInstance().getFact().createEntityManager();
    }
    public  boolean CreateAccount(Account acc){
        tran= em.getTransaction();
        tran.begin();
        try {
            em.persist(acc);
            tran.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;
    }
    public  boolean Update(Account acc){
        tran= em.getTransaction();
        tran.begin();
        try {
            em.persist(acc);
            tran.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;
    }
    public List<Account> getlisstAccount (){
        return em.createQuery("Select a from Account a").getResultList();
    }
    public  Account find (String id){
        Account acc = (Account) em.createQuery("Select a from Account a where a.ccount_id ="+id).getSingleResult();
        return acc;
    }
    public List<Account > findAccByOneRole(){
        return em.createQuery("Select a from Account a join GrantAccess g on a.ccount_id= g.account_id group by a having Count(g.role.role_id)=1 ").getResultList();
    }
    public Account findAccByName(String Name){
        return (Account) em.createQuery("Select a from Account a join GrantAccess g on a.ccount_id= g.account_id where a.account_id= "+Name).getSingleResult();
    }


}
