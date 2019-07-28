package com.bittch.Day_46;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/25 10:07
 */
public class Mistake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.nextLine();
            String[] a=str1.split("\\\\");
            for(int i=0;i<a.length;i++) {
                System.out.println(a[i]);
            }
        }
    }
}
