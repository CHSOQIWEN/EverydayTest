package com.bittch.Day_28;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/3 20:48
 */
public class MiMaYanZheng {
    public static boolean yaoqiu1(String a){
        int n=a.length();
        if(n>8){
            return true;
        }else {
           return false;
        }

    }
    public static boolean yaoqiu2(String a){
        char[] n=a.toCharArray();
        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>='0'&&n[i]<='9'){
                a1=1;
                continue;
            }else if(n[i]>='a'&&n[i]<='z'){
                a2=1;
                continue;
            }else if(n[i]>='A'&&n[i]<='Z'){
                a3=1;
                continue;
            }else {
                a4=1;continue;
            }
        }
        int count=a1+a2+a3+a4;
        if(count>=3){
           return true;
        }else {
            return false;
        }
    }
    public static boolean yaoqiu3(String a){
        for(int i=0;i<a.length()-2;i++){
            String n=a.substring(i,i+3);
            String n2=a.substring(i+1);
            if(n2.contains(n)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String a=scanner.nextLine();
            if(yaoqiu1(a)==true&&yaoqiu2(a)==true&&yaoqiu3(a)==true){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }

    }
}
