package com.example.demo_tuan2.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private static  Connection instance;
    private EntityManagerFactory enf;

   private   Connection(){
       enf = Persistence.createEntityManagerFactory("default");

   }
   public static Connection getInstance(){
       if (instance == null)
           instance = new Connection();
       return instance;
   }
   public  EntityManagerFactory getEnf(){
       return enf;
   }
}
