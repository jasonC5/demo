package com.jason.temp.fanXing;

import com.jason.temp.HashDemo;

public class FanXingTest {

    public static void main(String[] args) {
        FanXingDemo<String> demo = new FanXingDemo<>();
        demo.setId(1L);
        demo.setX(new String("123"));
        System.out.println(demo);

        FanXingDemo<HashDemo> hashDemoFanXingDemo = new FanXingDemo<>();
        hashDemoFanXingDemo.setId(2L);
        hashDemoFanXingDemo.setX(new HashDemo("123"));
        System.out.println(hashDemoFanXingDemo);

        FanXingInterfaceImpl fanXingInterface = new FanXingInterfaceImpl();

        fanXingInterface.otherThing(1234);
        fanXingInterface.otherThing("123");
    }


}
