package com.jason.temp.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
        Set<Map.Entry> entries =  hashMap.entrySet();//获取Map中的键值对
        Iterator<Map.Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
        System.out.println();
    }
}
