package com.bittch.Day_14;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/3 20:29
 */
public class Nikechesi {


    public static String   GetSequeOddNum(int m){

        int FirstNum = (int) (Math.pow(m, 2) - (m - 1));


        if (m > 100 || m < 1) {
            System.out.print(-1);

        }else {

            System.out.print(FirstNum);
            for (int i = 1; i < m; i++) {

               FirstNum+=2;
                System.out.print("+" + FirstNum);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();


        GetSequeOddNum(m);


    }
}
