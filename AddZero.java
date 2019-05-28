package com.bittch.Day_09;

import java.util.Scanner;

public class AddZero {
    public static Integer JieCheng(Integer n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*JieCheng(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        /*
        for(int i=0;i<n;i++){
            n=n/5;
            count+=n;
        }

         */

        System.out.print(n/5+n/25);
    }
}
