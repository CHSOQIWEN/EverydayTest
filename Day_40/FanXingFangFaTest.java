package com.bittch.Day_40;

/**
 * @author CHAOQIWEN
 * @data 2019/7/18 10:53
 */
class MyClass<T>{
    public <T> T testMethod1(T t){
        return t;
    }//泛型类的泛型方法
    public void testMethods2(T t){
        System.out.println(t);
    }//泛型类的普通方法


}
public class FanXingFangFaTest {
    public static void main(String[] args) {
        MyClass<Integer> myClass=new MyClass<>();
        int i=myClass.testMethod1(20);
        myClass.testMethods2(22);
        System.out.println(i);
    }

}
