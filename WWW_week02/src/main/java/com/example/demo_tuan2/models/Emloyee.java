package com.example.demo_tuan2.models;

import com.example.demo_tuan2.enums.EmloyeeEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Emloyee {
     @Id
     private String emp_id;
     @Column(nullable = false)
     private String name;
     @Column(nullable = false)
     private LocalDate dob;
     @Column(nullable = false)
     private String email;
     @Column(nullable = false)
     private String phone;
     @Column(nullable = false)
     private String address;
     @Column(nullable = false)
     @Enumerated(EnumType.ORDINAL)
     private EmloyeeEnum status;

     public Emloyee() {
     }

     @Override
     public String toString() {
          return "Emloyee{" +
                  "emp_id='" + emp_id + '\'' +
                  ", name='" + name + '\'' +
                  ", dob=" + dob +
                  ", email='" + email + '\'' +
                  ", phone='" + phone + '\'' +
                  ", address='" + address + '\'' +
                  ", status=" + status +
                  '}';
     }

     public String getEmp_id() {
          return emp_id;
     }

     public void setEmp_id(String emp_id) {
          this.emp_id = emp_id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public LocalDate getDob() {
          return dob;
     }

     public void setDob(LocalDate dob) {
          this.dob = dob;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public EmloyeeEnum getStatus() {
          return status;
     }

     public void setStatus(EmloyeeEnum status) {
          this.status = status;
     }

     public Emloyee(String emp_id, String name, LocalDate dob, String email, String phone, String address, EmloyeeEnum status) {
          this.emp_id = emp_id;
          this.name = name;
          this.dob = dob;
          this.email = email;
          this.phone = phone;
          this.address = address;
          this.status = status;
     }
}
