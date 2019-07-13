package com.bittch.Day_36;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/12 21:22
 */
public class JinZhiZhuanHuan {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next().substring(2);
            int a=Integer.parseInt(s,16);
            System.out.println(a);


        }
    }

}
