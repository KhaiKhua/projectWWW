package com.example.demo_week_01.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private String role_id;
    private String role_name;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private AccountStatus status;

    public Role() {
    }

    public Role(String role_id, String role_name, String description, AccountStatus status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
