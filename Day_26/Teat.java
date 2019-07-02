package com.bittch.Day_26;

/**
 * @author CHAOQIWEN
 * @data 2019/7/2 17:48
 */
public class Teat {
    public static int FIB(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return FIB(n-1)+FIB(n-2);
        }

    }
    public static int Ditui(int n){
        int[] a=new int[n+5];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        System.out.print(Ditui(5));
    }

}
