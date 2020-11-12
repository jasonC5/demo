package com.jason.temp.enumTemp;

public enum EventEnum {

    AAA("123"),BBB("456");

    EventEnum(String name){
        this.name = name;
    }
    private String name;

    public void show(){
        System.out.println(name);
    }
}
