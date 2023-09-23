package com.example.demo_tuan2.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Orders")
public class Order {
    @Id
    private String Oder_id;
    @Column(nullable = false)
    private LocalDateTime Order_date;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Emloyee em_id;
    @JoinColumn (nullable = false)
    @ManyToOne
    private Customer Cus_id;

    public Order(String oder_id, LocalDateTime order_date, Emloyee em_id, Customer cus_id) {
        Oder_id = oder_id;
        Order_date = order_date;
        this.em_id = em_id;
        Cus_id = cus_id;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "Oder_id='" + Oder_id + '\'' +
                ", Order_date=" + Order_date +
                ", em_id=" + em_id +
                ", Cus_id=" + Cus_id +
                '}';
    }

    public String getOder_id() {
        return Oder_id;
    }

    public void setOder_id(String oder_id) {
        Oder_id = oder_id;
    }

    public LocalDateTime getOrder_date() {
        return Order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        Order_date = order_date;
    }

    public Emloyee getEm_id() {
        return em_id;
    }

    public void setEm_id(Emloyee em_id) {
        this.em_id = em_id;
    }

    public Customer getCus_id() {
        return Cus_id;
    }

    public void setCus_id(Customer cus_id) {
        Cus_id = cus_id;
    }
}
