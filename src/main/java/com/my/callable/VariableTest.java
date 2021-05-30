package com.my.callable;

public class VariableTest {
    public static void main(String[] args) {
        testone1("a");
        testone1("abb","vv"); //不定参数
        testone1(new String[]{"aaa","ddd"});//不定参数
    }

    //
    private static void testone1(String ... m) {
        System.out.println("不定参数====");

    }

    /*
      不允许定义，他认为是和上面不定参数是重复了
    private static void testone1(String[] m) {
    }
    */

    private static void testone1() {
        System.out.println("无参数====");
    }

    private static void testone1(String m) {
        System.out.println("一个参数====");

    }
}
