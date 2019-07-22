package com.bittch.Day_42;


/**
 * @author CHAOQIWEN
 * @data 2019/7/21 16:16
 */

public class FanSheTest {
    public static void main(String[] args) throws Exception {

       /* //class对象的三种实例化方式
        java.util.Date date=new java.util.Date();
        //1、通过类.getClass（）
        System.out.println(date.getClass());
        //2、通过类名称.class
        System.out.println(Date.class==date.getClass());
        //3、通过调用Class类提供的静态方法forName（String className）
        System.out.println(Class.forName("java.util.Date"));*/


      /*  //通过反射实例化对象
        //1、取得类的class对象
        Class<Date> c=(Class<Date>)Class.forName("java.util.Date");
        //通过反射取得Date类实例化对象
        Date date=c.newInstance();
        System.out.println(date);*/




    }

}
