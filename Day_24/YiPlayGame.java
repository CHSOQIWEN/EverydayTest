package com.bittch.Day_24;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/questionTerminal/fe6c73cb899c4fe1bdd773f8d3b42c3d
 * @author CHAOQIWEN
 * @data 2019/6/14 19:32
 */
public class YiPlayGame {
    public static int MaxNUM(int a, int b) {//找最大公约数
        int m = 0;//大数
        int n = 0;//小数
        if (a > b) {
            m = a;
            n = b;
        } else {
            m = b;
            n = a;
        }
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        int max = m;
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();//怪兽数
            int a = scanner.nextInt();//初始战斗值
            int c = a;
            int[] b = new int[n];//怪兽战斗值
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
                if (b[i] < c) {
                    c += b[i];

                } else {
                    c += MaxNUM(c, b[i]);
                }
            }
            System.out.println(c);
        }
    }
}
