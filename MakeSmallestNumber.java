package com.bittch.Day_14;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/3 19:29
 */
public class MakeSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];//十个数字组成的数组
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        int x=0;
        int a=0;
        StringBuffer A=new StringBuffer();//用于插入数字

        for(int i=1;i<10;i++){
            if(arr[i]==0){
                continue;
            }else {
               A.append(i);
                x=arr[i]-1;
                a=i;//插进去的第一个数
                break;

            }


        }

        for(int i=0;i<arr[0];i++){
            A.append(0);
        }

        for(int i=0;i<x;i++){
            A.append(a);
        }
        for(int i=a+1;i<10;i++){
            for(int j=0;j<arr[i];j++){
                A.append(i);
            }
        }
        System.out.println(A);


    }
}
