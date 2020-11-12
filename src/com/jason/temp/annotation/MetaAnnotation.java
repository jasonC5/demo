package com.jason.temp.annotation;

import java.lang.annotation.*;

public class MetaAnnotation {

    public static void main(String[] args) {

    }

    @MyAnnotation(name = "jason", age = 27, color = MyAnnotation.Color.WHITE, method="speak")
    public void speak(String str){
        System.out.println(str);
        return ;
    }
}

//target声明注解使用位置
@Target(ElementType.METHOD)
//注解用于环境：源码级别、类级别、运行环境，一般都是运行环境
@Retention(RetentionPolicy.RUNTIME)
//是否显示在javadoc中
@Documented
//是否能被继承
@Inherited
@interface MyAnnotation{
    enum Color{RED,BLUE,WHITE}
    //使用注解时参数，默认参数为value
    String name() default "222";
    int age();
    Color color();
    String method();
}
