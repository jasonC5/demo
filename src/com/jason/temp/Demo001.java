package com.jason.temp;

import java.util.Objects;

public class Demo001 {

    private Integer aaa;

    private String bbb;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo001 demo001 = (Demo001) o;
        return getAaa().equals(demo001.getAaa()) &&
                getBbb().equals(demo001.getBbb());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAaa(), getBbb());
    }

    public Integer getAaa() {
        return aaa;
    }

    public void setAaa(Integer aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public static void main(String[] args) {
        System.out.println("111");
    }
}
