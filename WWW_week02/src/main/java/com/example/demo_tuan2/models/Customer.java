package com.example.demo_tuan2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer{
    @Id
    private String cus_id;
    @Column(nullable = false)
    private String cus_name;
    @Column(nullable = false)
    private String Email;
    @Column(nullable = false)
    private String Phone;
    @Column(nullable = false)
    private String Address;

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id='" + cus_id + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Customer(String cus_id, String cus_name, String email, String phone, String address) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        Email = email;
        Phone = phone;
        Address = address;
    }
}
