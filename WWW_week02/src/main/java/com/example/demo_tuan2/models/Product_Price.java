package com.example.demo_tuan2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Product_Price {
    @Id
    @ManyToOne
    private Products Product_id;
    @Id
    private LocalDateTime Price_date_time;
    @Column(nullable = false)
    private Long Price;
    @Column(nullable = false)
    private String Note;

    public Product_Price() {
    }

    @Override
    public String toString() {
        return "Product_Price{" +
                "Product_id=" + Product_id +
                ", Price_date_time=" + Price_date_time +
                ", Price=" + Price +
                ", Note='" + Note + '\'' +
                '}';
    }

    public Products getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Products product_id) {
        Product_id = product_id;
    }

    public LocalDateTime getPrice_date_time() {
        return Price_date_time;
    }

    public void setPrice_date_time(LocalDateTime price_date_time) {
        Price_date_time = price_date_time;
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

    public Product_Price(Products product_id, LocalDateTime price_date_time, Long price, String note) {
        Product_id = product_id;
        Price_date_time = price_date_time;
        Price = price;
        Note = note;
    }
}
