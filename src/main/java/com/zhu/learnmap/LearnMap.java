package com.zhu.learnmap;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {


        System.out.println("=============迭代器方式=============");

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "apple");
        map1.put(2, "peach");
        map1.put(3, "banana");

        Iterator<Map.Entry<Integer, String>> iterator = map1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }

        System.out.println("=============循环遍历方式=============");

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(1, "apple");
        map2.put(2, "peach");
        map2.put(3, "banana");

        for (Map.Entry<Integer, String> fruitEntry : map2.entrySet()) {
            Integer key = fruitEntry.getKey();
            String value = fruitEntry.getValue();
            System.out.println(key + "->" + value);
        }


        System.out.println("=============Lambda遍历方式=============");
        HashMap<Integer, String> map3 = new HashMap<>();

        map3.put(1, "apple");
        map3.put(2, "peach");
        map3.put(3, "banana");

        map3.forEach((key, value) -> {
            System.out.println(key + "->" + value);
        });

        String str = new String("abc");
        String str1 = new String("abc");
        System.out.println(str.equals(str1));
    }
}
