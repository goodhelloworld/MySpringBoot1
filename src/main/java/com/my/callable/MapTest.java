package com.my.callable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //testmap1();
       // testmap2();
        //test1();
        test2();
    }

    //null和 空串都是可以的
    private static void testmap1() {
        Map<String,String> m1 = new HashMap<>();
        m1.put(null,"dd");
        m1.put("","dd11");
        System.out.println(m1.get(null)+"===="+ m1.get(""));
    }

    // keySet
    public static void test1(){
        Map<String,String> m1 = new HashMap<>();
        m1.put("a","1");
        m1.put("b","d");

        Set<String> tt = m1.keySet(); //key 集合
        for(String mm:tt){
            System.out.println(mm+"===="+m1.get(mm));
        }

    }

    public static void test2(){
        Map<String,String> m1 = new HashMap<>();
        m1.put("a","1");
        m1.put("b","d");

        Set<Map.Entry<String, String>> entries = m1.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String k1 = next.getKey();
            String v2 = next.getValue();
            System.out.println("mmm==="+k1+"===="+v2);

        }

    }

    //
    public static void test3(){
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","d");

        for(String key : map.keySet()){
            System.out.println(key);
        }
    //value
        for(String value : map.values()){
            System.out.println(value);
        }
    }


    public static void test4(){
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","d");

        for(Map.Entry<String,String>mm: map.entrySet()){
            System.out.println(mm.getKey()+"===="+mm.getValue());
        }
    }









    private static void testmap2() {
        Map<String,String> m1 = new HashMap<>();
        m1.put("a","1");
        m1.put("b","d");

        Set<Map.Entry<String, String>> entries1 = m1.entrySet();
        Iterator<Map.Entry<String, String>> entries2 = entries1.iterator();
        while(entries2.hasNext()){
           // System.out.println("m====="+entries2.next()); // a=1, b=d
            Map.Entry<String, String> ma=  entries2.next();
            System.out.println("ppp============"+ma.getKey());
        }

    }
}
