package com.hit.MultiThreading;

public class YieldThread implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                System.out.println("线程开始让步");
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
