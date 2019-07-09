package com.bittch.Day_31;

/**
 * @author CHAOQIWEN
 * @data 2019/7/9 10:48
 */
class MyThread2 implements  Runnable{
    private String who;
    public MyThread2(String str){
        who=str;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep((int)(1000*Math.random()));
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            System.out.println(who+"正在运行");
        }
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread you=new MyThread("你");
        MyThread she=new MyThread("她");
        Thread t1=new Thread(you);
        Thread t2=new Thread(she);
        t1.start();
        t2.start();
    }

}
