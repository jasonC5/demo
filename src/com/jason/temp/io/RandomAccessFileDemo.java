package com.jason.temp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 分块读取文件
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) {
        File file = new File("log.txt");
        //文件大小
        long length = file.length();
        //规定块的大小
        int blockSize = 1024;
        //文件可以被切分成多少块
        int size = (int)Math.ceil(length * 1.0 / blockSize);
        System.out.printf("要被切成 %s 块", size);
        System.out.println();
        int beginPos = 0;
        int realSize = (int)(blockSize > length?length:blockSize);
        for (int i = 0; i < size ; i++) {
            beginPos = i * blockSize;
            if (i == size - 1) {
                //最后一块
                realSize = (int) length;
            } else {
                realSize = blockSize;
                length -= realSize;
            }
            System.out.println(i+"|| 起始位置："+beginPos+"||读取大小："+realSize);
            read(beginPos, realSize, file);
        }
    }

    public static void read(int begin, int size, File file){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            //表示从哪个偏移量开始读取
            randomAccessFile.seek(begin);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = randomAccessFile.read(bytes)) != -1) {
                if (size > length) {
                    System.out.println(new String(bytes, 0, length));
//                    size -= length;
                } else {
                    System.out.println(new String(bytes, 0, size));
//                    size -= length;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
