package com.bittch.Day_36;

/**
 * 最大子序列和问题的求解
 * @author CHAOQIWEN
 * @data 2019/7/13 12:21
 */
public class Solution {
    public static int MaxNum(int[] a){
        int maxsum=0;
        int thisum=0;
        for(int i=0;i<a.length;i++){
            thisum+=a[i];
            if(thisum>maxsum){
                maxsum=thisum;
            }else if(thisum<0){
                thisum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] a={1,-2,3,10,-4,7,2,-5};

        System.out.println(MaxNum(a));

    }
}
