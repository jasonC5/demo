package com.jason.temp.innerClass;

public class TempDoing {

    public static void main(String[] args) {

        String[] arr = {"想","做","收拾"};
        DoBefore doBefore = new DoBefore() {
            @Override
            public void doSomeReadyThing() {
                System.out.println("准备事项……"+arr[0]);
            }
        };//匿名内部类

        DoMethod doMethod = new DoMethod() {
            @Override
            public void doSomThing() {
                System.out.println("吭哧吭哧……"+arr[1]);
            }
        };

        DoAfter doAfter = new DoAfter() {
            @Override
            public void doSomeEndingThing() {
                System.out.println("收尾事项……"+arr[2]);
            }
        };
        DoSomeThing doSomeThing = new DoSomeThing(doBefore,doMethod,doAfter);
        doSomeThing.doing();
    }
}
