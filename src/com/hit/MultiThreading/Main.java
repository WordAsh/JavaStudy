package com.hit.MultiThreading;

import org.junit.Test;
import org.junit.experimental.theories.Theories;

public class Main {
    public static void test1(String args[]) {
        SubThread subThread = new SubThread();
        Thread thread = new Thread(subThread);
        thread.start();
        while(true){
            System.out.println("Main thread is running..." + Thread.currentThread().getName());
        }
    }

    public static void test2(String args[]){
        DaemonThread daemonThread = new DaemonThread();
        Thread dThread = new Thread(daemonThread);
        ShoesThread shoesThread = new ShoesThread();
        new Thread(shoesThread,"Jimmy").start();
        new Thread(shoesThread,"Tom").start();
        new Thread(shoesThread,"Lio").start();

        dThread.setDaemon(true);
        dThread.start();
    }

    public static void test3(String args[]){
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
    }

    public static void test4(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        Thread maxThread = new Thread(new PriorityThread(),"maxThread");
        Thread minThread = new Thread(new PriorityThread(),"minThread");
        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);

        maxThread.start();
        minThread.start();
    }

    public static void test5(String[] args) throws InterruptedException {
        SubThread subThread = new SubThread();
        Thread thread = new Thread(subThread);

        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            if(i == 3){
                thread.join();
            }
        }
    }

    public static void test6(String[] args) {
        PriorityThread priorityThread = new PriorityThread();
        YieldThread yieldThread = new YieldThread();

        Thread thread1 = new Thread(priorityThread);
        Thread thread2 = new Thread(yieldThread);

        thread2.start();
        thread1.start();
    }

    public static void main(String[] args) {
        Condom condom = new Condom();
        new Customer(condom).start();
        new Producer(condom).start();
    }
}
