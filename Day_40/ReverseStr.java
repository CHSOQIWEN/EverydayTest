package com.bittch.Day_40;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/18 9:32
 */
public class ReverseStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
            StringBuffer sb=new StringBuffer();
            String[] b=a.split(" ");
            for(int i=b.length-1;i>=0;i--){
                sb.append(b[i]+" ");


            }
            System.out.println(sb.toString());


        }
    }
}
