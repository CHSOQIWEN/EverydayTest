package com.bittch.Day_35;

/**
 * @author CHAOQIWEN
 * @data 2019/7/13 21:05
 */
public class GuShiShouYi {
    public static int getMax(int[] arr,int start,int end){
        int max=0;
        int min=arr[start];
        for(int i=start+1;i<=end;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min>max){
                max=arr[i]-min;
            }
        }
        return max;
    }
    public static int calculateMax(int[] prices) {
        int sum=0;
        int tmp=0;
        for(int i=0;i<prices.length;i++){
            tmp=getMax(prices,0,i)+getMax(prices,i,prices.length-1);
            if(tmp>sum){
                sum=tmp;
            }
        }
        return sum;

    }
}
