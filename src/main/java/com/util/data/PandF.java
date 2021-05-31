package com.util.data;

public class PandF {
    public static void main(String[] args) {
        M1 m = new M2(); //子类的,无法访问到子类自己的方法

        m.show();//  先用子类，子类没有用父类



        System.out.println("==============================================");
        M2 t1 = new M2(); //存粹的子类
        t1.show();// 父子都有的调用自己的，前提是存子类
        t1.show2(); //子类能访问到自己的方法

    }
}
