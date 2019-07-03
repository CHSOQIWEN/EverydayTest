package com.bittch.Day_27;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/2 21:04
 */
public class FoundX {
    public static int Found(int[] array,int x){
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
               return i;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            int x=scanner.nextInt();
            System.out.println(Found(a,x));
        }

    }
}
