package com.bittch.Day_03;

import java.util.Scanner;

public class ReadLongestMathString {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int nowlength = 0;

            int maxlength = 0;
            int end = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    nowlength++;


                    if (nowlength > maxlength) {
                        maxlength = nowlength;
                        end = i;
                    }
                } else {
                    nowlength = 0;
                }
            }

            System.out.println(str.substring(end - maxlength + 1, end + 1));
        }
    }
}
