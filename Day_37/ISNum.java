package com.bittch.Day_37;

/**
 * @author CHAOQIWEN
 * @data 2019/7/15 16:27
 */
public class ISNum {
    public static boolean isNum(String str){
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]<'0'||a[i]>'9'){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNum("a457"));
    }
}
