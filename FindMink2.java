package com.bittch.Day_08;

import java.util.Arrays;
import java.util.Scanner;

public class FindMink2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length-1];
            for(int i=0;i<s.length-1;i++){
                num[i] = Integer.parseInt(s[i]);
            }

            int k = Integer.parseInt(s[s.length-1]);
            int start = 0;
            int end = num.length-1;
            int index = qSort(num, start,end);

            while(index != k){
                if(index>k){
                    end = index - 1;
                    index = qSort(num, start, end);

                }else{
                    start = index + 1;
                    index = qSort(num, start, end);
                }
            }
            Arrays.sort(num, 0, k);
            for(int i=0;i<k;i++){
                System.out.print(i==k-1?num[i]:num[i] + " ");
            }
        }
    }
    public static int qSort(int[] array, int left, int right){
        int p = array[right];
        while(left<right){
            while(left<right && array[right]>=p){
                right--;
            }
           array[left]=array[right];
            while(left<right && array[left]<=p){
                left++;
            }
            array[right]=array[left];
        }
        array[left]=p;
        return left;
    }
}

