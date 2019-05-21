package com.bittch.TwoForkTree;

import java.util.Scanner;

public class hhhhh{
    //判断是否为回文串
    public static boolean ishuiwen(String array){
        int left=0;
        int right=array.length()-1;

        while (left<right) {
            char ch1 = array.charAt(left);
            char ch2 = array.charAt(right);
            if (ch1 != ch2) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;
    }

    //将一个字符串插入另一个字符串的指定位置
    public static String insertString(String str1, String str2,int off){
        StringBuffer sb=new StringBuffer();
        sb.append(str1);

            sb.insert(off,str2);


        return sb.toString();
    }

    public static void main(String[] args) {
        String str1="aba";
        String str2="b";
        String haha1=insertString(str1,str2,0);
        String haha2=insertString(str1,str2,1);
        String haha3=insertString(str1,str2,2);
        String haha4=insertString(str1,str2,3);
        int i=0;
        if(ishuiwen(haha1)){
            i++;
        }
        if(ishuiwen(haha2)){
            i++;
        }
        if(ishuiwen(haha3)){
            i++;
        }
        if(ishuiwen(haha4)){
            i++;
        }
        System.out.println(i);




    }
}
