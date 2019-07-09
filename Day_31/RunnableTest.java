package com.bittch.Day_31;

/**
 * @author CHAOQIWEN
 * @data 2019/7/9 10:55
 */
public class RunnableTest {

    public static void main(String[] args) {
        //设置线程名字
        Thread.currentThread().setName("main thread:");
        Thread thread = new Thread(new MyRunnable());
        thread.setName("子线程:");
        //开启线程
        thread.start();
        for(int i = 0; i <5;i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
