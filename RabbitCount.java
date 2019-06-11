package com.bittch.Day_21;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/11 20:44
 */
public class RabbitCount {
    public static int getTotalCount(int monthCount){
        if(monthCount==1||monthCount==2){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int month = scanner.nextInt();
            System.out.println(getTotalCount(month));
        }
    }
}
