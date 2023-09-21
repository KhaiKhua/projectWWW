package com.example.demo_week_01.resource;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.w3c.dom.Entity;

public class connection {
    private EntityManagerFactory fact;
    private static  connection instance;

  private connection (){
      fact = Persistence.createEntityManagerFactory("www_week1");

  }

    public static connection getInstance() {
        if(instance == null)
            instance = new connection();

        return instance;
    }

    public EntityManagerFactory getFact() {
        return fact;
    }
}
