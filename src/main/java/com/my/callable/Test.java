package com.my.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        FutureTask<String> ft = new FutureTask<String>(new MyCall());
        for (int i = 0; i < 10;i++) {
            new Thread(ft,"dd").start();
        }

        try {
            String s1 = ft.get();
            System.out.println(s1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCall implements Callable<String>{

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }
}
