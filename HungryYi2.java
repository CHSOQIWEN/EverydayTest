package com.bittch.Day_15;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/5 1:27
 */
public class HungryYi2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x = scanner.nextInt();
        int a=1000000007;
        //scanner.close();
        int count = 0;
        while (x != 0 && count <= 300000) {
            x = ((x << 1) + 1) % a;
            count++;
        }
        int res = (count + 2) / 3;
        System.out.println(res > 100000 ? -1 : res);
    }
}
