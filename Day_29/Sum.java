package com.bittch.Day_29;


import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/6 21:03
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            long[] arr = new long[sum + 1];
            arr[0]=1;
            int tmp = 0;
            for (int i = 0; i < n; i++) {


                for (int j = sum; j >= 0; j--) {
                    if (j >= A[i]) {
                        arr[j] += arr[j - A[i]];
                    }
                }


            }
            System.out.println(arr[sum]);
        }
    }
}

