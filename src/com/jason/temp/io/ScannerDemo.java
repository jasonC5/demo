package com.jason.temp.io;

import java.io.*;

public class ScannerDemo {

    public static void main(String[] args) {
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);//控制台输入  标准输入流
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);//控制台输出  标准输出流
//        //字节流转字符流
//        BufferedReader reader = new BufferedReader(inputStreamReader);
//        BufferedWriter writer = new BufferedWriter(outputStreamWriter);

        String lineStr = "";

        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);//控制台输入  标准输入流
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);//控制台输出  标准输出流
            //字节流转字符流
            BufferedReader reader = new BufferedReader(inputStreamReader);
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);) {//不需要关闭IO流
            while(!(lineStr = reader.readLine()).equals("exit")){
                writer.write(lineStr);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                inputStreamReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                outputStreamWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

    }
}
