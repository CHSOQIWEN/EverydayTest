package com.bittch.Day_19;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/11 19:28
 */
public class ChengjiPaixu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();//人数
            int flag = scanner.nextInt();//判断升序还是降序
            boolean[] ppp = new boolean[N];
            int[] a = new int[N];//成绩数组
            String[] name = new String[N];//名字数组
            for (int i = 0; i < N; i++) {
                name[i] = scanner.next();
                a[i] = scanner.nextInt();
                ppp[i] = true;

            }
            if (flag == 0) {
                int tmp = N;
                int max = -1;

                while (tmp-- > 0) {
                    int e = 0;
                    for (int i = 0; i < N; i++) {
                        if (a[i] > max && ppp[i] == true) {
                            max = a[i];
                            e = i;
                        }

                    }
                    System.out.println(name[e] + " " + a[e]);
                    ppp[e] = false;
                    max = -1;
                }

            } else {
                int tmp = N;
                int e = 0;
                int min = 999;
                while (tmp-- > 0) {
                    for (int i = 0; i < N; i++) {
                        if (a[i] < min && ppp[i] == true) {
                            min = a[i];
                            e = i;
                        }

                    }
                    System.out.println(name[e] + " " + a[e]);
                    ppp[e] = false;
                    min = 999;
                }

            }
        }
    }
}
