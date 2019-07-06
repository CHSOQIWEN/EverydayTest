package com.bittch.Day_29;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/6 18:14
 */
public class ChouJiang {
    public static long D(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(D(n-1)+D(n-2));
        }
    }
    public static long F(int n){
        if(n==1){
            return 1;
        }else {
            return n*F(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int n = s.nextInt();
            double a = (1.0* D(n) /  F(n)) * 100;
            System.out.println(D(n)+"   "+F(n));


            System.out.println(String.format("%.2f", a ) + "%");
        }

    }
}

