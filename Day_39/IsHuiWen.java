package com.bittch.Day_39;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/17 14:13
 */
public class IsHuiWen {
    public static boolean ishuiwen(String str){
        StringBuffer sb=new StringBuffer(str);
        String a=sb.reverse().toString();
        char[] str1=str.toCharArray();
        char[] a1=a.toCharArray();
        for(int i=0;i<str1.length;i++){
           if(str1[i]!=a1[i]){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            String nohead=str.substring(1);
            String noBehind=str.substring(0,str.length()-1);
            if(ishuiwen(str)==true||ishuiwen(nohead)==true||ishuiwen(noBehind)==true){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

       }
    }
}
