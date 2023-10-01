package com.example.week3_spring.confit;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class confit {
   @Bean
    public DataSource DataSuorce(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        ds.setUrl("jdbc:mariadb://localhost:3306/week3");
        ds.setUsername("root");
        ds.setPassword("sapassword");
        return  ds;
    }
}
