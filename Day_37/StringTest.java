package com.bittch.Day_37;

/**
 * @author CHAOQIWEN
 * @data 2019/7/15 16:12
 */
public class StringTest {
    public static void main(String[] args)throws Exception {
        /*//字符数组转换成字符串
        char[] data={'h','e','l','l','o'};
        String str=new String(data);
        System.out.println(str);
        String str2=new String(data,0,2);
        System.out.println(str2);
        //将字符串转为单个字符
        char c="hello".charAt(2);
        System.out.println(c);
        //将字符串转为字符数组
        char[] ll="helloa".toCharArray();
        System.out.println(ll);*/

/*

        //将字节数组转为字符串
        byte[] data2={1,2,3,4,5};
        String str21=new String(data2);
        System.out.println(str21);
        //字符串转为字节数组
        byte[] a="hello".getBytes();
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        //将 字符串按照指定编码转为字节数组
        byte[] b="hellok".getBytes("ISO-8859-1");
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        System.out.println(new String(b));
*/

      /*  //字符串比较
        //不区分大小写相等比较
        System.out.println("hello".equalsIgnoreCase("HELLO"));
        //比较两个字符串大小
        System.out.println("hello".compareTo("HEllo"));
*/
  /*     // 判断str在本字符串中是否存在
        String str="e";
        String str2="hello";
        System.out.println(str2.contains(str));
        //判断是否以指定字符串开头
        System.out.println(str2.startsWith(str,1));
*/
   /*      String str="hello world";
         System.out.println(str.replaceAll("l","-"));
        System.out.println(str.replaceFirst("l","-"));*/



 /*       //将字符串按照指定格式全部拆分
        String str="hello bit hello java";
        String[] result=str.split(" ");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        //将字符串部分拆分，数组长度为limit

        String[] result2=str.split(" ",3);
        for(int i=0;i<result2.length;i++){
            System.out.println(result2[i]);
        }*/

/*
        //从指定位置截取到字符串结尾
        String str="helloworld";
        String result=str.substring(5);
        System.out.println(result);
        //截取部分内容
        String result2=str.substring(5,7);
        System.out.println(result2);

*/

        //去掉左右空格
        String str=" heLlo woRlD ";
       
        System.out.println(str);
        System.out.println(str.trim());
        //转大小写
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //判断是否为空（只能判断是否为空字符串，而不是null）
        System.out.println(str.isEmpty());



    }


}
