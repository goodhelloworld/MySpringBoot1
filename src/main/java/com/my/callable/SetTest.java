package com.my.callable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
       // testa1();
        testa2();
    }

    // set: 无序  唯一
    // null 和空串 可以放进去
    private static void testa1() {
        Set<String> s = new HashSet<>();
        s.add(null);
        s.add("");
        System.out.println(s.size());
    }
    // set 便利
    // 重复的数据会被覆盖
    private static void testa2(){
        Set<String> s1 = new HashSet<>();
        s1.add("aa");
        s1.add("aa");

        System.out.println("===="+s1);
        Iterator<String> iterator = s1.iterator();
        while(iterator.hasNext()){
            System.out.println("便利====="+iterator.next());
        }

        for(;iterator.hasNext();){
            System.out.println("pp==="+iterator.next());
        }

    }
}
