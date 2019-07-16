package com.bittch.Day_39;

/**
 * @author CHAOQIWEN
 * @data 2019/7/16 22:06
 */
public class ErWeiShuZuPaint {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] A=new int[n*n];
        int p=0;
        for(int i=n-1;i>-1;i--){
            for(int j=0;j<n-i;j++){
                A[p]=arr[j][i+j];
                A[n*n-1-p]=arr[n-1-j][n-1-i-j];
                p++;
            }
        }
        return A;

    }
}
