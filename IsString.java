package com.bittch.Day_01;

import java.util.Scanner;

public class IsString {
    public static boolean ishuiwen(String array){
        int left=0;
        int right=array.length()-1;

        char ch1=array.charAt(left);
        char ch2=array.charAt(right);
        while (left<right){
            if(ch1!=ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String insertString(String str1, String str2, int off){
        StringBuffer sb=new StringBuffer();
        sb.append(str1);
        sb.insert(off,str2);

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        int count=0;
        for(int i=0;i<=str1.length();i++){

            insertString(str1,str2,i);
            if(ishuiwen(insertString(str1,str2,i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
