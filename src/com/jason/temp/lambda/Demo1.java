package com.jason.temp.lambda;

public class Demo1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("普通线程 running……");
            }
        });
        thread.start();

        new Thread(()-> System.out.println("lambda 线程 running……")).start();

        Runnable runnable = ()->{
            System.out.println("lambda 线程 runnable running……");
        };
        runnable.run();
    }
}
