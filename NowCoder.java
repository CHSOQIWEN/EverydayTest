package com.bittch.Day_21;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/11 21:31
 */
public class NowCoder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            char[] a=s.toCharArray();
            String str="";
            for(int i=0;i<a.length;i++){
                if(a[i]==' '){
                    str=str+" ";
                }else if((int)a[i]>=65&&(int)a[i]<=69){
                    int b=a[i]+21;
                    str=str+(char)b;

                }else{
                    int c = ((int)a[i]-5);
                    str+=(char)c;
                }
            }
            System.out.println(str.toString());
            str="";


        }
        
    }
}
