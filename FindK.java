package com.bittch.Day_01;

import java.util.Arrays;

public class FindK {
    //快速排序
    public  static int parition(int[] array,int left,int right){

        int p=array[right];
        while (left<right){
            while (left<right&&array[left]>=p){
                left++;
            }
            array[right]=array[left];
            while (left<right&&array[right]<=p){
                right--;
            }
            array[left]=array[right];


        }

        array[left]=p;
        return left ;

    }

    public static int Findkth(int[] array,int low,int high,int k){
        int p=parition(array,low,high);
        if(p-low+1==k) {
            return array[p];
        }
        else if(k>p-low+1) {
            return Findkth(array, p + 1, high, k - (p - low + 1));
        }
        else {
            return Findkth(array, low, p-1, k);
        }


    }
    public static int FindKth(int[] array,int n,int k){
        return Findkth(array,0,n-1,k);
    }


    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(FindKth(array,9,3));


    }
}
