package com.hit.MultiThreading;

public class SubThread implements Runnable{
    @Override
    public void run() {
            System.out.println("Sub thread is running..." + Thread.currentThread().getName());
    }
}
