package com.jason.temp.io;

import java.io.*;

public class ObjectDemo {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileOutputStream = new FileOutputStream("6.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeUTF("1234asdf");
            objectOutputStream.writeObject(new TempBean(1,"222",false));//需要序列化的对象

            fileInputStream = new FileInputStream("6.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            TempBean tempBean  = (TempBean)objectInputStream.readObject();
            System.out.println(tempBean);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
