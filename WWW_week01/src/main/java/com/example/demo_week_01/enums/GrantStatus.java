package com.example.demo_week_01.enums;

public enum GrantStatus {
    ACTIVE (1),

    DEACTIVE(0),

    DELETE(-1);
    private int status;

    GrantStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
