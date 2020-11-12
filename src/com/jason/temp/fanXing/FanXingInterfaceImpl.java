package com.jason.temp.fanXing;

public class FanXingInterfaceImpl implements FanXingInterface<String> {
    @Override
    public String test() {
        return null;
    }

    @Override
    public void doSomething(String o) {

    }

    public <Y> void otherThing(Y y){
        System.out.println(y);
    }
}
