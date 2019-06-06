package com.bittch.Day_16;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/5 21:46
 */
public class TheNumberOfStudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int M=0,j = 0;//给定分数
        int count=0;

        int[] tmp=new int[999];
        while (scanner.hasNext()) {

            int N=scanner.nextInt();//学生人数
             count=0;

            if (N == 0) {
              break;
            } else {
                int[] grade=new int[N];//学生分数
                for (int i = 0; i < N; i++) {
                    grade[i] = scanner.nextInt();//学生分数
                }
                M = scanner.nextInt();
                for (int i = 0; i < N; i++) {
                    if (grade[i] == M) {
                        count++;
                    }
                }
                tmp[j++]=count;

            }
        }
        for(int i=0;i<j;i++) {
            System.out.println(tmp[i]);
        }

    }
}
