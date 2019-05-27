package com.bittch.Day_07;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=0;
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        n = (x/4) * (y/4) * 8;

        n += (x/4)*(y%4)*2 + (x%4)*(y/4)*2;
        n += (x%4>1?2:x%4) * (y%4>1?2:y%4);
        n += (x%4 == y%4 && x%4 == 3)?1:0;
        System.out.println(n);



    }
}
