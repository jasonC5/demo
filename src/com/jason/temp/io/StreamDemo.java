package com.jason.temp.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *  流表示从一个文件将数据发送到另一个文件，包含一个流向的问题
 *      最终需要一个参照物
 *
 *      XXX-->程序    输入流
 *      程序-->XXX    输出流
 */
public class StreamDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("1.txt");
//            int read = inputStream.read();
//            System.out.println((char) read);

//            int temp = 0;
//            while((temp = inputStream.read()) != -1){
//                System.out.println((char) temp);
//            }

            int length = 0;
            byte[] buffer = new byte[1024];//添加缓冲区
            while((length = inputStream.read(buffer,2,2)) != -1){
                System.out.println(new String(buffer,2,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();//一定要关闭，占用系统资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
