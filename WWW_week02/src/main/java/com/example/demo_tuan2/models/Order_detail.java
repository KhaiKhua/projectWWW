package com.example.demo_tuan2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order_detail {
    @Id
    @ManyToOne
    private Order Order_id;
    @Id
    @ManyToOne
    private  Products product_id;
    @Column(nullable = false)
    private String Quanlity;
    @Column (nullable = false)
    private Long Price;
    @Column(nullable = false)
    private String  Note;

    @Override
    public String toString() {
        return "Order_detail{" +
                "Order_id=" + Order_id +
                ", product_id=" + product_id +
                ", Quanlity='" + Quanlity + '\'' +
                ", Price=" + Price +
                ", Note='" + Note + '\'' +
                '}';
    }

    public Order_detail() {
    }

    public Order getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(Order order_id) {
        Order_id = order_id;
    }

    public Products getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Products product_id) {
        this.product_id = product_id;
    }

    public String getQuanlity() {
        return Quanlity;
    }

    public void setQuanlity(String quanlity) {
        Quanlity = quanlity;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        Price = price;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Order_detail(Order order_id, Products product_id, String quanlity, Long price, String note) {
        Order_id = order_id;
        this.product_id = product_id;
        Quanlity = quanlity;
        Price = price;
        Note = note;
    }
}
