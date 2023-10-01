package com.example.week3_spring.service;

import com.example.week3_spring.entity.Employee;

import java.util.List;

public interface Service {
    List<Employee> Getall();
    Employee Findemployee(int id);
    Boolean Insertemloyee(Employee e);
    Boolean Updateemployee (Employee e);
    Boolean Deleteemployee(int id);
    Integer count();
}
