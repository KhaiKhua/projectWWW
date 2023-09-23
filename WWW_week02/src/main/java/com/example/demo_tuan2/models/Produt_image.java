package com.example.demo_tuan2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produt_image {
    @Id
    @ManyToOne
    private Products product_id;
    @Id
    private String image_id;
    @Column(nullable = false)
    private String Path;
    @Column(nullable = false)
    private String Alternative;

    public Produt_image() {
    }

    @Override
    public String toString() {
        return "Produt_image{" +
                "product_id=" + product_id +
                ", image_id='" + image_id + '\'' +
                ", Path='" + Path + '\'' +
                ", Alternative='" + Alternative + '\'' +
                '}';
    }

    public Products getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Products product_id) {
        this.product_id = product_id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getAlternative() {
        return Alternative;
    }

    public void setAlternative(String alternative) {
        Alternative = alternative;
    }

    public Produt_image(Products product_id, String image_id, String path, String alternative) {
        this.product_id = product_id;
        this.image_id = image_id;
        Path = path;
        Alternative = alternative;
    }
}
