package com.bittch.Day_03;

import java.util.Scanner;

public class ReadLongestMathString {
    public static StringBuffer getString(String str){

        int nowlength=0;
        StringBuffer nowlengthStr=new StringBuffer();
        int maxlength=0;
        StringBuffer maxlengthStr=null;
        for(int i=0;i<str.length();i++){


            if(str.charAt(i)>='0'&&str.charAt(i)<='9') {


                nowlengthStr.append(str.charAt(i));
                nowlength++;

            }
            if(i>nowlengthStr.length()){
                break;
            }



                if (nowlength >= maxlength) {
                    maxlength = nowlength;
                    maxlengthStr = nowlengthStr;
                } else {
                    nowlength = 0;
                    nowlengthStr = null;
                }



        }


        return maxlengthStr;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(getString(str));
    }
}
