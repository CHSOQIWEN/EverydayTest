package com.bittch.Day_06;

import java.util.Scanner;

public class FindN2 {

        // 不考虑【1,1,1,2,2,2】的情况
        public static int solution(String[] arr) {
            int num = Integer.parseInt(arr[0]);
            int count = 0;
            for(int i = 1; i < arr.length; i++) {
                int temp = Integer.parseInt(arr[i]);
                if(temp == num) {
                    count++;
                }else if(count > 0) {
                    count--;
                }else {
                    num = temp;
                }
            }
            return num;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in

            );
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            int result = solution(arr);
            System.out.println(result);
            sc.close();
        }
    }


