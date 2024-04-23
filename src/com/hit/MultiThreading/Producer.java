package com.hit.MultiThreading;

public class Producer extends Thread {
    private Condom condom;

    public Producer(Condom condom) {
        this.condom = condom;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (condom) {
                //是否有库存，如果有，就等消费者购买完再生产
                if (condom.isStatus == true) {
                    try {
                        condom.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                //模拟生产好了
                condom.isStatus = true;
                //唤醒其他线程
                System.out.println(Thread.currentThread().getName() + "生产完了，唤醒消费者");
                condom.notify();
            }
        }
    }
}
