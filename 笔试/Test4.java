package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/8/29 16:19
 */
public class Test4 {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int a=0;
            int b=1;
            int min=999;
            if(n==0){
                System.out.println("0");
            }
            while (true){
                if(Math.abs(b-n)>min){
                    break;
                }else {
                    min=Math.abs(b-n);
                    int tmp=b;
                    b=a+b;
                    a=tmp;
                }
            }
            System.out.println(min);
        }
    }
}