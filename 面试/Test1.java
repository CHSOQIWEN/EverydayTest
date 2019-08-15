package 面试;

/**
 * @Author:chaoqiwen
 * @Date:2019/8/15 19:21
 */
/*多线程交替打印奇偶数*/
public class Test1 {
    static Object object=new Object();
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {

            @Override
            public void run() {
                synchronized (object){
                    for(int i=0;i<100;i+=2){
                        System.out.println(Thread.currentThread().getName()+" "+(i));
                        object.notifyAll();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }


        };
        Runnable runnable2=new Runnable() {

            @Override
            public void run() {
                synchronized (object){
                    for(int i=1;i<100;i+=2){
                        System.out.println(Thread.currentThread().getName()+" "+(i));
                        object.notifyAll();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }


        };

        Thread thread2=new Thread(runnable,"偶数");
        Thread thread1=new Thread(runnable2,"奇数：");

        thread2.start();
        thread1.start();
    }
}
