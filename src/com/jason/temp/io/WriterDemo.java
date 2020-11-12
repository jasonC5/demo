package com.jason.temp.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("3.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("1231122121");
            writer.write("\n中文");
            writer.flush();//当某一个输出流对账中带有缓冲区的时候，需要flush，最保险的方式输出流关闭之前都flush
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
