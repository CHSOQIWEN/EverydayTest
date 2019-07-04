package com.bittch.Day_28;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/3 20:12
 */
public class ShouXingShu {
    public static void shouxingshu(int n){
        int a=n*n;
        if(n<10) {
            if ((a - n) % 10 == 0) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
        else {
            if ((a - n) % 100 == 0) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            shouxingshu(n);
        }


    }
}
