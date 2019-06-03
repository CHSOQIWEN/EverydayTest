package com.bittch.Day_13;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/3 0:46
 */
public class LongStringAdd {

        public static String AddLongInteger(String added, String augend){

                BigInteger N1=new BigInteger(added);
                BigInteger N2=new BigInteger(augend);
                BigInteger sum=N1.add(N2);
                String SUM=sum.toString();
                return SUM;


        }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String n1=scanner.next();
            String n2=scanner.next();
            System.out.println(AddLongInteger(n1,n2));
    }

    }
}
