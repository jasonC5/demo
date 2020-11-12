package com.jason.temp.io;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
//            File file = new File("1.txt");
//            file.createNewFile();
//            System.out.println(file.exists());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.getParent());
//            System.out.println(file.getCanonicalPath());
//            File[] listFiles = file.listFiles();
            File readFile = new File("1.txt");
            File writeFile = new File("2.txt");
            writeFile.createNewFile();//新建文件
            //读书、写
            inputStream = new FileInputStream(readFile);
            outputStream = new FileOutputStream(writeFile);
            int length = 0;
            byte[] buffer = new byte[8];//缓冲区
            while ((length = inputStream.read(buffer)) != -1){
//                outputStream.write(buffer,0,length);
                outputStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
