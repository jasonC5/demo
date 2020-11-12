package com.jason.temp.parent;

public class Run {

    public static void main(String[] args) {
        Animal man = new Man();
        System.out.println(man.getClass().getName());
        Dragon dragon = (Dragon) man;
    }
}
