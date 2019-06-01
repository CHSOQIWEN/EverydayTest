package com.bittch.Day_12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CHAOQIWEN
 * @data 2019/5/31 23:57
 */
public class GrayCode {
    public static String[] getGray(int n) {
        // write code here
        //输入1   0 1
        //输入2   00 01 11 10
        //输入3   000 001 011 010 110 111 101 100
        //List<String> tmp= new ArrayList<>();
        String[] tmp=new String[2];
        if(n==1){
           tmp[0]="0";
           tmp[1]="1";
            return tmp;
        }else {
            //递归调用就要先生成n-1的格雷码，然后在以此在之前的格雷码 前补0和补1
            String[] AA=getGray(n-1);

            //n与n-1的格雷码个数相差两倍
            String[] tmp2=new String[AA.length*2];
            //n=3:000 001 011 010    110 111 101 100
            //n=2:00 01 11 10
            //n=3的前四位等于n=2前补0
            for(int i=0;i<AA.length;i++){
                tmp2[i]="0"+AA[i];
            }
            //n=3的后四位等于n=2倒序前补1
            for(int i=0;i<AA.length;i++){

               tmp2[i+AA.length]="1"+AA[AA.length-1-i];
            }
            return tmp2;
        }

    }

    public static void main(String[] args) {

        String[] A=getGray(2);
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }


    }
}