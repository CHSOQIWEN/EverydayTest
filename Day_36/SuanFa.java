package com.bittch.Day_36;

/**
 * 运行时间中的对数
 * @author CHAOQIWEN
 * @data 2019/7/13 14:43
 */
public class SuanFa {
    //折半查找
    //在数组a找到x，使得a[i]==x;

    public static int binarySearch(int[] a ,int x){
        int low=0;
        int high=a.length-1;
        while (low<high){
            int mid=(high+low)/2;
            if(a[mid]<x){
                low=mid+1;
            }else if(a[mid]>x){
                high=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //计算最大公因数的欧几里得算法
    public static int gcb(int a,int b){
        while (b!=0){
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    //幂运算
    public static  int pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2==0){
            return pow(x*x,n/2);
        }else {
            return pow(x*x,n/2)*x;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,4,6,7,8,9};
        System.out.println(binarySearch(a,2));
        System.out.println(gcb(36,6));

    }
}
