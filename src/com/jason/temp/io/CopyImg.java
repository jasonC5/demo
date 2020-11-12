package com.jason.temp.io;

import java.io.*;

public class CopyImg {
    public static void main(String[] args) {
//        FileReader reader = null;
//        FileWriter writer = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
//            reader = new FileReader("1.jpg");
//            writer = new FileWriter("2.jpg");
            //读书、写
            fileInputStream = new FileInputStream("1.jpg");
            fileOutputStream = new FileOutputStream("2.jpg");
            int length = 0;
//            char[] buffer = new char[1024];//缓冲区
            byte[] buffer = new byte[1024];
            while ((length = fileInputStream.read(buffer)) != -1){
//                outputStream.write(buffer,0,length);
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                reader.close();
//                writer.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
