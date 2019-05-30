package com.bittch.Day_11;

import java.util.Scanner;

public class NumberOfMembers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] chN = str.toCharArray();
            int[] arr = new int[10];
            for (int i = 0; i < chN.length; i++) {
                arr[chN[i] - '0']++;


            }

            for (int i = 0; i < 10; i++) {
                if (arr[i] != 0) {
                    System.out.println(i + ":" + arr[i]);
                }
            }
        }





    }
}
