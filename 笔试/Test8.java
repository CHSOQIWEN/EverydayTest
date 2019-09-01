package 笔试;

import java.util.Scanner;

/**
 * 最大乘积
 * @Author:chaoqiwen
 * @Date:2019/9/1 10:56
 */
public class Test8 {
    public static int ppp(int n){
        if(n<4){
            return n-1;
        }
        if(n%3==0){
            return (int)Math.pow(3,n/3);
        }else if(n%3==1){
            return (int)Math.pow(3,(n/3-1))*4;
        }else {
            return (int)Math.pow(3,n/3)*2;
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(ppp(n));
        }
    }
}
