package com.hit.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShoesThread implements Runnable {
    int nike = 10;

/**    Object lock = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (lock){
            if(nike > 0){
                //线程非安全不同步
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "is getting the" + (nike--) + " shoes");
            }}
        }
    }*/


   Lock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            reentrantLock.lock();
            try{
                if(nike > 0){
                    //线程非安全不同步
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "is getting the" + (nike--) + " shoes");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
