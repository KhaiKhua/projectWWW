package com.example.demo_tuan2.enums;



public enum EmloyeeEnum {
    ACTIVE(1),
    INACTIVE(0),
    STOP(-1);
    private int invoke;

    EmloyeeEnum(int invoke) {
        this.invoke = invoke;
    }

    public int getInvoke() {
        return invoke;
    }
}
