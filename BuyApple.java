package com.bittch.Day_04;

import java.util.Scanner;

public class BuyApple {
    public static int PlasticBags(int n){
        int bigPlasticBags=0;
        int smallPlaticBags=0;
        if(n==0){
            return 0;
        }else if(n%2!=0||n<6) {
            return -1;

        }else if(n%8==0) {
            return n/8;
        }else {
            return 1+n/8;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextByte();
        System.out.println(PlasticBags(n));
    }
}
