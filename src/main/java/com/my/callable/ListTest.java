package com.my.callable;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        /*listone1();
        listone2();*/
        //listone3();
        //listone4();
        listone5();
    }

    /**
     调用Arrays.asList()生产的List的add、remove方法时报异常，这是由Arrays.asList() 返回的市Arrays的内部类ArrayList，
     而不是java.util.ArrayList。Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，remove、add
     等方法AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。java.util.ArrayList重新
     了这些方法而Arrays的内部类ArrayList没有重新，所以会抛出异常
     */
    private static void listone4() {
        List<String> m = Arrays.asList("aa","bb","cc");  //这种数组专成的集合不要掉add remove方法

        List<String> m2 = new ArrayList<>();
        m2.add("v1"); m2.add("v2");

        m.addAll(m2);  // java.lang.UnsupportedOperationException
        System.out.println("ff===="+m);

    }
    // 解决liston4的问题
    private static void listone5() {
        List<String> m = Arrays.asList("aa","bb","cc");  //这种数组专成的集合不要掉add remove方法
        List<String> m1 = Arrays.asList("aa1","bb1","cc1");  //这种数组专成的集合不要掉add remove方法

        List<String> m2 = new ArrayList<>(m);
        m2.add("v1"); m2.add("v2");
        m2.addAll(m1);
       // m.addAll(m2);  // java.lang.UnsupportedOperationException
        System.out.println("ff===="+m2+"===="+m);

    }




    private static void listone3() {
        List<String> m = Arrays.asList("aa","bb","cc");
        System.out.println("===="+m.get(0)); //索引是从0开始
         m.set(1,"ppp");
        System.out.println("==替换指定位置的数据=="+m.get(1)); //索引是从0开始

        ListIterator<String> stringListIterator = m.listIterator();


        ///   System.out.println("11===="+stringListIterator.previous()); // 没有前一个元素会造成异常


        /**
         * 开始指针处于： -1
          第一次： next 进入第一个元素 0
         */



        System.out.println("==当前==1=="+ stringListIterator.next());  // aa
        System.out.println("==当前==1=="+ stringListIterator.next());  // aa
        System.out.println("====2===="+stringListIterator.previous());  //aa  会造成指针走动
        System.out.println("=====上一个索引====:"+stringListIterator.previousIndex());  // -1
        System.out.println("=====下一个索引===:"+stringListIterator.nextIndex()); //下一个索引0
        System.out.println("==当前==1=="+ stringListIterator.next());  //aa
     /*
        System.out.println("==当前==1=="+ stringListIterator.next());
        System.out.println("==当前===2="+ stringListIterator.next()
                +"====="+stringListIterator.hasPrevious()+"===="+stringListIterator.previous());
        System.out.println("==当前===3="+ stringListIterator.next());
        System.out.println("==当前===4="+ stringListIterator.next()); //报出一场 java.util.NoSuchElementException
*/





     /*  while(stringListIterator.hasNext()){
           System.out.println("索引---"+stringListIterator.nextIndex()+"===="+stringListIterator.hasPrevious());
           System.out.println(stringListIterator.next());
       }
*/

    }


    private static void listone2() {
        List<String> mm = new ArrayList<>();
        mm.add("a");
        mm.add("b");
        Iterator<String> iterator = mm.stream().iterator();
        while(iterator.hasNext()){
            System.out.println("aa====="+iterator.next());
        }

    }

    private static void listone1() {
        List<String> st = Arrays.asList("a","b","c");
        for(Iterator mm = st.iterator();mm.hasNext();){
            System.out.println("==="+mm.next());
        }
    }
}
