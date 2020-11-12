package com.jason.temp;

public class HashDemo implements Comparable {

    private String val;

    public HashDemo(String val){
        this.val = val;
    }

    @Override
    public int hashCode() {
        return val.hashCode();
//        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  HashDemo)){
            return false;
        }
        HashDemo demo = (HashDemo) obj;
        return val.equals(demo.val);
//        return false;
    }

    @Override
    public int compareTo(Object o) {
        HashDemo demo = (HashDemo) o;
        return this.val.compareTo((demo.val));
//        return 0;
    }
}
