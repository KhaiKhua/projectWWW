package com.example.demo_week_01.models;

public enum GrantStatus {
    DISABLED(0),
    ENABLED(1);

    private final int value;

    GrantStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
