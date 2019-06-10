package com.bittch.Day_20;

import java.util.Arrays;

/**
 * @author CHAOQIWEN
 * @data 2019/6/10 22:05
 */
public class WeChat {
    public  static int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int a=gifts[n/2];
        int num=0;
        for(int i=0;i<gifts.length;i++){
            if(gifts[i]==a){
                num++;
            }
        }
        if(num>n/2){
            return a;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] gift={1,2,3,2,2};
        System.out.println(getValue(gift,5));
    }
}
