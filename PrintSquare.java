package com.bittch.Day_13;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/2 23:25
 */
public class PrintSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        char C=scanner.next().charAt(0);
/*
        for(int i=0;i<N;i++){
            System.out.print(C);
        }
        System.out.println();
        for(int i = 1; i < N / 2 - 1; i++){
            System.out.print(C);
            for(int j = 1;j < N - 2;j++){
                System.out.print(" ");
            }
            System.out.print(C);
            System.out.println();

        }
        for(int i = 0;i < N;i++){
            System.out.print(C);
        }
        System.out.println( );

 */




        for(int i=0;i<(N+1)/2;i++){//正方形行数
           for(int j=0;j<N;j++){//正方形列数
               if(i==0||j==0){
                   System.out.print(C);
               }else if(i==(N+1)/2-1||j==N-1){
                   System.out.print(C);
               }
               else {
                   System.out.print(" ");
               }


           }
           System.out.println();
        }



    }
}
