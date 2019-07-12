package com.bittch.Day_36;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/12 20:57
 */
public class TongJiZiMu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
           // String[] a1=a.split(" ");
            char[] a2=a.toCharArray();

            char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

            int[] s=new int[arr.length];
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<a2.length;j++){
                    if(arr[i]==a2[j]){
                        s[i]++;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+":"+s[i]);
            }
        }
    }
}
