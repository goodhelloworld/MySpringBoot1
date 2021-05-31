package com.util.data;

public class M2 extends M1{

    @Override
    public void show(){
        System.out.println("子类的show===========");
    }
    public void show2(){
        System.out.println("使用super访问弗雷==========");
        super.show();
        System.out.println("子类自己的show2===========");
    }
}
