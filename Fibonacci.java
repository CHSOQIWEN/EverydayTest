package com.bittch.Day_10;

import java.util.Scanner;

public class Fibonacci {
    /*

    public static int Fibonacci1(int n){
        if (n == 1) {
            return 0;

        }else if(n==2){
            return 1;
        }
        else {
            return Fibonacci1(n-1)+Fibonacci1(n-2);
        }
    }

     */
    public static int[] fibo = new int[41];

    static {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 40; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }



    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            for (int i = 0; i < 40; i++) {//40是随机输的，尽量大
                if (N >=fibo[i] && N <= fibo[i+1]) {
                    int a = Math.min(fibo[i+1] - N, N - fibo[i]);
                    System.out.println(a);
                    break;

                }

            }
        }



    }
}
