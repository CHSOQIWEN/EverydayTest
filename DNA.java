package com.bittch.Day_18;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/8 14:23
 */
public class DNA {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        int n = scanner.nextInt();

        int max=0;
        String S=null;

        for(int i=0;i<A.length()-n;i++){
            String B=A.substring(i,i+n);
            int n2=0;
            for(char ch:B.toCharArray()){
                if(ch=='C'){
                    n2++;
                }
                if(ch=='G'){
                    n2++;
                }

            }
            if(n2>max){
                max=n2;
                S=B;
            }
        }
        System.out.println(S);


    }
}
