package com.example.demo_tuan2.enums;

public enum ProductEnum {

    ACTIVE(1),
    INACTIVE(0),
    STOP(-1);
    private int invoke;

    ProductEnum(int invoke) {
        this.invoke = invoke;
    }

    public int getInvoke() {
        return invoke;
    }
}
