package com.bittch.Day_41;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/20 19:59
 */
public class MaxArr {
    public static int Max(int[] a){
        int maxsum=-999;
        int thisum=0;
        for(int i=0;i<a.length;i++){
            thisum+=a[i];
            if(thisum>maxsum){
                maxsum=thisum;
            }
            if(thisum<0){
                thisum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();

            }
            System.out.println(Max(a));
        }

    }
}
