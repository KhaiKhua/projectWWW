package com.example.week3_spring;

import com.example.week3_spring.emplement.EmployeeImplement;
import com.example.week3_spring.entity.Employee;
import com.example.week3_spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week3SpringApplication implements CommandLineRunner {
    @Autowired
    @Qualifier("employeeImplement")
    private Service Ser;
    public static void main(String[] args) {
        SpringApplication.run(Week3SpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Ser.Insertemloyee(new Employee(4,"Huykh","CHitid"));

    //        System.out.println(Ser.Findemployee(2));
    //        System.out.println(Ser.count());
       // Ser.Deleteemployee(4);
//        Ser.Updateemployee(new Employee(3,"Khai","vippro"));
//        Ser.Getall().forEach(e-> System.out.println(e));
        Ser.Updateemployee(new Employee(4,"Hynh","gapro"));
        Ser.Getall().forEach(e-> System.out.println(e));
    }
}
