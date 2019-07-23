package com.bittch.Day_44;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/23 9:36
 */
public class LuoTuoMingMing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.next();
            String[] b=str.split("");
           char[] a=str.toCharArray();


            StringBuffer sb=new StringBuffer();
            for(int i=0;i<a.length;i++){
                if(a[i]=='_'){

                    sb.append( b[i+1].toUpperCase());
                    i++;

                }else {
                    sb.append(a[i]);
                }

            }


            System.out.println(sb.toString());

        }
    }
}
