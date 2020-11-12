package com.jason.temp.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
//        PrintStream printStream = null;
        try {
//            printStream = new PrintStream(new FileOutputStream("x.txt"));
            printStream.write("123".getBytes());
            printStream.println("hahaha");
            System.out.println("hehehe");
            printStream.printf("12313213123--%s--%d--%f \n","123",12,11.11);
            System.err.println("Exception");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }
    }

}
