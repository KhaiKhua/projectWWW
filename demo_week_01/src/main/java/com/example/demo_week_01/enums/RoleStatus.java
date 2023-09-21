package com.example.demo_week_01.enums;

public enum RoleStatus {
    ACTIVE (1),

    DEACTIVE(0),

    DELETE(-1);
    private int status;

    RoleStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
