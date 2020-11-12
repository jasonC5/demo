package com.jason.temp.io;

import java.io.Serializable;

public class TempBean implements Serializable {//

    private Integer a;

    transient private String b;//将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会被序列化。

    private Boolean flag;

    public TempBean() {
    }

    public TempBean(Integer a, String b, Boolean flag) {
        this.a = a;
        this.b = b;
        this.flag = flag;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TempBean{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", flag=" + flag +
                '}';
    }
}
