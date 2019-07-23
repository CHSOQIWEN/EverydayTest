package com.bittch.Day_44;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/23 10:18
 */
public class JuZiNiXu {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            String[] a=str.split(" ");
            StringBuffer sb=new StringBuffer();
            for(int i=a.length-1;i>=0;i--){
                sb.append(a[i]+" ");
            }
           String str2=sb.toString();
            System.out.println(str2.trim());
        }
    }



}
