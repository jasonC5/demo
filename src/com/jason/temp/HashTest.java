package com.jason.temp;

public class HashTest {
    public static void main(String[] args) {
        HashDemo a = new HashDemo("X");
        HashDemo b = new HashDemo("X");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
    }
}
