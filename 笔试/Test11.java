package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/4 19:40
 */
public class Test11 {
    public static int num(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return num(n-1)+num(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(num(n));
        }
    }
}
