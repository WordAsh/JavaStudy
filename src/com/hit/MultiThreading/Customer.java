package com.hit.MultiThreading;

public class Customer extends Thread{
    private Condom condom;
    public Customer(Condom condom){
       this.condom = condom;
    }
    @Override
    public void run(){
        while(true){
            synchronized (condom){
                //是否有库存？如果没有就通知生产者生产，消费者等待
                if(condom.isStatus == false){
                    try {
                        condom.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //模拟卖光了
                condom.isStatus = false;
                //唤醒其他线程
                System.out.println(Thread.currentThread().getName() + "买完了，唤醒生产者生产");
                condom.notify();
            }
        }
    }
}
