package com.bittch.Day_40;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/7/18 9:04
 */
public class DeleteStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();

            String a="["+str2+"]";
            String b=str1.replaceAll(a,"");
            System.out.println(b);


        }
    }

}
