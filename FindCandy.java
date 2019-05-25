package com.bittch.Day_06;

import java.util.Scanner;

public class FindCandy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int A=(a+c)/2;
        int B=(c-a)/2;
        int C=(d-b)/2;
        if((A-B==1)&&(B-C==-2)&&(A+B==3)&&(B+C==4)){
            System.out.println("三个数分别为："+A+" "+ B+" "+C);
        }else {
            System.out.println(0);
        }
    }
}
