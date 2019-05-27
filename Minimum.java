package com.bittch.Day_07;

import java.util.Scanner;

public class Minimum {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int z=a*b;
        int max=0;//最大公约数
        int min=0;//最小公倍数
        int m=0;
        int n=0;
        if(a>b){
            m=b;
            n=a;
        }else {
            m=a;
            n=b;
        }
        while (m!=0){
            int r=n%m;
            n=m;
            m=r;
        }
        max=n;
        min=z/max;
        System.out.println(min);


    }
}
