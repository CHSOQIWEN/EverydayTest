package com.bittch.Day_38;

/**
 * @author CHAOQIWEN
 * @data 2019/7/16 15:35
 */
public class CommonZuXian {
    public int getLCA(int a, int b) {
        // write code here
        int c=a>b?getLCA(a/2,b):getLCA(a,b/2);
       return a==b?a:c;
    }


}
