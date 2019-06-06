package com.bittch.Day_16;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/6 0:28
 */
public class Xipai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//数据组数
        while (T > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] p = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                p[i] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                int[] z = new int[2 * n];
                for (int i = 0; i < 2 * n; i++) {
                    z[i] = p[i];
                }
                for (int i = 0; i < 2 * n; i++) {
                    if (i % 2 == 0) {
                        p[2 * n - 1 - i] = z[2 * n - 1 - i / 2];
                    } else {
                        p[2 * n - 1 - i] = z[n - (i + 1) / 2];
                    }
                }
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.print(p[2 * n - 1]);
            System.out.println();
            T--;
        }
    }
}

