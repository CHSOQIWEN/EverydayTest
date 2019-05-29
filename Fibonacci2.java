package com.bittch.Day_10;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int fib1=0;
        int fib2=1;
        int fib=0;
        int min=0;
        int max=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<40;i++){//这的40也是随便输的
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;

            if(fib>n){
                min=fib-n;
                break;
            }else {
                max=n-fib;
            }

        }
        System.out.println(Math.min(max,min));
    }
}
