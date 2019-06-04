package com.bittch.Day_15;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/5 0:05
 */
public class HungryYi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int a=4*x+3;
        int b=8*x+7;
        int c=1000000007;
        int count=0;

      for(int i=0;i<100000;i++){
            if(a%c==0||b%c==0){
                count++;
                System.out.println(count);
                break;
            }else {
                a=4*a+3;
                b=8*b+7;
                continue;
            }

        }

    }
}
