package com.bittch.Day_18;

/**
 * @author CHAOQIWEN
 * @data 2019/6/8 14:54
 */
public class Millionaire {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<30;i++){
            sum=sum+(int)Math.pow(2,i);
        }
        System.out.println(10*30);
        System.out.println(sum);
    }
}
