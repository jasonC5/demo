package com.jason.temp.io;

import java.io.*;

public class OutputStreamDemo {

    public static void main(String[] args) {
        File file = new File("1.txt");
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(45);
            outputStream.write("\nXXX".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
