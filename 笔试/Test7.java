package 笔试;

import java.util.Scanner;

/**
 * 青蛙跳台阶
 * @Author:chaoqiwen
 * @Date:2019/9/1 10:42
 */
public class Test7 {
    public static int jump(int n){
        if(n==0){
           return 0;
        }else if(n==1){
            return 1;
        }else {
            return 2*jump(n-1);
        }


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(jump(n));
        }
    }
}
