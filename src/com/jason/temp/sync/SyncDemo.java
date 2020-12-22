package com.jason.temp.sync;

public class SyncDemo {

    public static void main(String[] args) {
        SyncDemo syncDemo = null;
        synchronized (syncDemo) {
            System.out.println("111");
        }
    }
}
