package com.my.callable;

public interface TestFace<K,V> {
    TestFace.M1<K,V> addOne();
    interface  M1<K,V>{
        void addTwo();
        String addT();
    }
}

