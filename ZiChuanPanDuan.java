package com.bittch.Day_19;

/**
 * @author CHAOQIWEN
 * @data 2019/6/11 0:21
 */
public class ZiChuanPanDuan {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] a=new boolean[n];
        for(int i=0;i<n;i++){
            a[i]=s.contains(p[i]);
        }
        return a;
    }
}
