package com.bittch.Day_45;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/24 9:21
 */
public class PingPong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.next();
            String str2=scanner.next();
            char[] a1=str1.toCharArray();
            char[] a2=str2.toCharArray();
            boolean[] p=new boolean[a1.length];
            boolean[] p2=new boolean[a2.length];
            for(int i=0;i<a1.length;i++){
                for(int j=0;j<a2.length;j++){
                    if(a1[i]==a2[j]&&p[i]==false){
                        p[i]=true;
                        p2[j]=true;
                    }
                }
            }
            int flag=0;
            for(int i=0;i<p2.length;i++) {
                if (p2[i] == false) {
                   flag=1;
                   break;
                }
            }
            System.out.println(flag==1?"No":"Yes");
        }
    }
}
