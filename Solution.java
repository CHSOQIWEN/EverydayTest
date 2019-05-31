package com.bittch.Day_11;

public class Solution {
    public  static int[] multiply(int[] A) {
        int n=A.length;
        int[] B=new int[n];
        int Bleft=1;
        int Bright=1;
        A[0]=1;
        //下三角
        for(int i = 0;i < n;i++)
        {
            B[i] = Bleft;
            Bleft *= A[i];
        }
        //上三角
        for(int i = n - 1;i >= 0;i--)
        {
            B[i] *= Bright;
            Bright *= A[i];
        }


        return B;
    }
    public  static int[] multiply2(int[] A) {
        int n = A.length;
        int[] B = new int[n];


        A[0] = 1;
        for(int i=0;i<n;i++){
            int Bleft = 1;
            for(int j=0;j<i;j++){
                Bleft*=A[j];
            }
            int Bright = 1;
            for(int j=i+1;j<n;j++){
                Bright*=A[j];
            }
            B[i]=Bleft*Bright;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int[] arr = multiply2(A);
        for(int i = 0;i < 5;i++)
            System.out.println(arr[i]);
    }
}
