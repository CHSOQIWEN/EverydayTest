package com.bittch.Day_26;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/2 14:03
 */
public class SumOfNumber {
    public static int getN(int n){
        int count=1;
        while (n/10!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int sum1(int n) {
        int a = 0;
        int x=getN(n);
        if (n < 10) {
            a = n;
        } else {
            for(int i=0;i<x;i++){
                a+=n%10;
                n=n/10;
            }
        }
        return a;
    }
    public static int sum2(int n){
        int a=n*n;
        int b=sum1(a);
        return b;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(sum1(n)+" "+sum2(n));
        }
    }
}
