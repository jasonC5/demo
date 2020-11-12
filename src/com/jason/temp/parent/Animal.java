package com.jason.temp.parent;

public abstract class Animal {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String eating();
}
