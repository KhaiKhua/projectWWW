package com.example.demo_tuan2.models;

import com.example.demo_tuan2.enums.ProductEnum;
import jakarta.persistence.*;

@Entity
public class Products {
    @Id
    private String Product_id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String unit;
    @Column(nullable = false)
    private String manufacturer_name;
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ProductEnum status;

    public Products() {
    }

    @Override
    public String toString() {
        return "Products{" +
                "Product_id='" + Product_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", status=" + status +
                '}';
    }

    public String getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(String product_id) {
        Product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public ProductEnum getStatus() {
        return status;
    }

    public void setStatus(ProductEnum status) {
        this.status = status;
    }

    public Products(String product_id, String name, String description, String unit, String manufacturer_name, ProductEnum status) {
        Product_id = product_id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturer_name = manufacturer_name;
        this.status = status;
    }
}
