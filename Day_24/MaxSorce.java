package com.bittch.Day_24;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/14 19:58
 */
public class MaxSorce {
    public static void getUQ(String UQ,int A,int B,int[] array){
        int end=0;
        int  begin=0;

        if(UQ.equals("Q")){
            end=Math.max(A,B);
            begin=Math.min(A,B)-1;
            int max=array[begin];
            for(int i=begin;i<end;i++){
                if(array[i]>max){
                    max=array[i];
                }
            }
            System.out.println(max);


        }else  if(UQ.equals("U")){
            array[A-1]=B;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int N=scanner.nextInt();//学生数目
            int M=scanner.nextInt();//操作数目
            int[] ID=new int[N];
            String UQ=null;
            int A=0;
            int B=0;
            for(int i=0;i<N;i++){
                ID[i]=scanner.nextInt();
            }
            for(int i=0;i<M;i++){
                UQ=scanner.next();
                A=scanner.nextInt();
                B=scanner.nextInt();
                getUQ(UQ,A,B,ID);


            }


        }
    }
}
