package com.jason.temp.io;

import java.io.*;

public class DataDemo {

    public static void main(String[] args) {
//        File file = new File("5.txt");
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("5.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(12800000);
            dataOutputStream.writeByte(64);
            dataOutputStream.writeDouble(3.141592653589);
            dataOutputStream.writeUTF("www中文");

            fileInputStream = new FileInputStream("5.txt");
            dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
