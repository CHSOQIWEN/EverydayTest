package com.bittch.Day_42;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/20 10:43
 */
public class TranslateDay {
    public static boolean IsRunYear(int a){
        if(a%4==0||a%400==0){
            return true;
        }
        return false;
    }
    public static int Day(int y,int m){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            return 31;
        }else if(m==4||m==6||m==9||m==11){
            return 30;
        }else if(m==2){
            if(IsRunYear(y)){
                return 29;
            }else {
                return 28;
            }
        }
        return 0;
    }
    public static int DateToDay(int year,int month,int day){
        int a=0;

            for(int i=1;i<month;i++){
                a+=Day(year,i);
            }
            a+=day;
            return a;


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int year=scanner.nextInt();
            int month=scanner.nextInt();
            int day=scanner.nextInt();
            System.out.println(DateToDay(year,month,day));
        }
    }
}
