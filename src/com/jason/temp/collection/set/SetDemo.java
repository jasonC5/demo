package com.jason.temp.collection.set;

import com.jason.temp.HashDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
//        Set<String> stringSet = new HashSet<>();//不可重复，无序   构造方法：map = new HashMap<>();  无序原因： hashMap.put()  哈希表原理 hashCode()  红黑树实现
//        stringSet.add("123");
//        stringSet.add("demo");
//        stringSet.add("false");
//        stringSet.add("more");
//        stringSet.add("123");
//        System.out.println(stringSet);
//        stringSet.get();//不能根据下标取值，无序

        Set treeSet = new TreeSet<>();//this(new TreeMap<>());  红黑树
        treeSet.add("123");
        treeSet.add("demo");
//        treeSet.add(false);//报错  涉及到排序，需要同一类型
        treeSet.add("more");
        treeSet.add("123");
        System.out.println(treeSet);
//
        Set demoSet = new TreeSet();
        demoSet.add(new HashDemo("123"));
        demoSet.add(new HashDemo("123"));
        demoSet.add(new HashDemo("1234"));
        System.out.println(demoSet);

//        Set hasSet = new HashSet();
//        hasSet.add(new HashDemo("123"));
//        hasSet.add(new HashDemo("123"));
//        hasSet.add(new HashDemo("1234"));
//        System.out.println(hasSet);
    }

}
