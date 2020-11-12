package com.jason.temp.fanXing;

public class FanXingDemo<X> {

    private Long id;
    private X x;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    @Override
    public String toString(){
        return "id="+id+",x="+x;
    }
}
