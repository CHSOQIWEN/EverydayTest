package com.bittch.Day_02;

import java.util.Scanner;

public class ChangeBottle {
    //n为自己的汽水瓶个数，i为可以兑换的汽水瓶的个数
    //n<2时，i=0
    //n=2时，i=1（可以向老板借一个汽水瓶兑换后还给老板）
    //n>=3时，每次兑换完相当于n=n-2；
    static int i=0;
    public static int Change(int n) {

             if (n < 2) {
                 i = 0 + i;
             } else if (n == 2) {
                 i = 1 + i;
             } else {
                 i++;
                 Change(n-2);

             }

        return i;
    }

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println(Change(scanner.nextByte()));
        //System.out.println(Change(10));
    }
}
