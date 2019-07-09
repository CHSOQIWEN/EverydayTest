package com.bittch.Day_31;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/questionTerminal/aced908691df4ebca6744f9fbd437749
 * @author CHAOQIWEN
 * @data 2019/7/7 20:19
 */
public class ShuoFanHua {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String[] a1=a.split(" ");
        for(int i=a1.length-1;i>0;i--){
            System.out.print(a1[i]+" ");
        }
        System.out.print(a1[0]);
    }
}
