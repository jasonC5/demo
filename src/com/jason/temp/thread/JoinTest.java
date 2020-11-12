package com.jason.temp.thread;

public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.setPriority(10);
        thread.start();

        for (int i = 0; i< 5; i++) {

            if (i == 1) {
                thread.yield();//当前正在执行的线程，暂停一次，不阻塞，
                System.out.println(Thread.currentThread().getName()+"----"+i+"礼让一次");
//                try {
//                    thread.join();//使当前线程强制暂停、另一个线程优先执行
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            } else {
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }

        }

    }
}
