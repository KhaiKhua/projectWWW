package com.example.demo_week_01.enums;

public enum AccountStatus {
    ACTIVE (1),

    DEACTIVE(0),

    DELETE(-1);
    private int status;

    AccountStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
