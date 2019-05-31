package com.bittch.Day_10;

/**
 * @author CHAOQIWEN
 * @data 2019/5/31 11:51
 */
public class Robot2 {
    public  static int countWays2(int x,int y){

        // x++;
        // y++;
        int add=0;
        int[][] arr=new int[1024][1024];
        arr[1][0]=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
                add=Math.max(arr[i][j],add);
            }
        }
        return add;

    }

    public static void main(String[] args) {
        System.out.println(countWays2(2,2));
    }
}
