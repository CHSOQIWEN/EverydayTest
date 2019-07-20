package com.bittch.Day_41;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/20 20:10
 */
public class ZuoBiaoYiDong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.next();
            String[] A=str.split(";");
            int x=0;
            int y=0;
            for(String a:A){
                if(a.charAt(0)=='D'&&a.substring(1).matches("[0-9]+")){
                    x+=Integer.parseInt(a.substring(1));
                }
                if(a.charAt(0)=='A'&&a.substring(1).matches("[0-9]+")){
                    x-=Integer.parseInt(a.substring(1));
                }
                if(a.charAt(0)=='W'&&a.substring(1).matches("[0-9]+")){
                    y+=Integer.parseInt(a.substring(1));
                }
                if(a.charAt(0)=='S'&&a.substring(1).matches("[0-9]+")){
                    y-=Integer.parseInt(a.substring(1));
                }
            }
            System.out.println(x+","+y);
        }
    }
}
