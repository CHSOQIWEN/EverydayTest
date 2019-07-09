package com.bittch.Day_30;

/**
 * @author CHAOQIWEN
 * @data 2019/7/7 9:21
 */
public class JiOuJiaoYan {
    public static void jijiaoyan(int n){
        StringBuffer sb=new StringBuffer();
        if(n%2==1) {
            while (n != 0) {

                sb.append(n % 2);
                n=n/2;
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {


    }
}
