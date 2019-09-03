package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/3 16:18
 */
public class Test9 {
    public  static int NumberOf1(int n) {
        int num = 0;
        if (n > 0) {

            while (n > 1) {
                if (n % 2 == 1) {
                    num++;
                    n /= 2;
                } else {
                    n = n / 2;
                }
            }
            return num + 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(NumberOf1(n));
        }
    }
}
