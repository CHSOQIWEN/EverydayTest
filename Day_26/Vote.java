package com.bittch.Day_26;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/2 14:44
 */
public class Vote {
    public static int[] vote(String[] str1,String[] str2){
        int[] vote=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str2[j].equals(str1[i])){
                    vote[i]++;
                }
            }
        }
        return vote;
    }
    public static int youxiaopiaoshu(int[] vote){
        int tmp=0;
        for(int i=0;i<vote.length;i++){
            tmp+=vote[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n1=scanner.nextInt();
            String[] str1=new String[n1];
            for(int i=0;i<n1;i++){
                 str1[i]=scanner.next();
            }
            int n2=scanner.nextInt();
            String[] str2=new String[n2];
            for(int i=0;i<n2;i++){
                str2[i]=scanner.next();
            }
            int[] vote=vote(str1,str2);
            for(int i=0;i<vote.length;i++){
                System.out.print(str1[i]+" : "+vote[i]);
                System.out.println();
            }
            System.out.println("Invalid : "+(n2-youxiaopiaoshu(vote)));
        }
    }
}
