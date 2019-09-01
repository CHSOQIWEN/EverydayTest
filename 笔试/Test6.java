package 笔试;

import java.util.Scanner;

/**
 * 求质因数的个数
 * @Author:chaoqiwen
 * @Date:2019/9/1 10:19
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int num = 0;
           /* while (true){
                boolean flag=false;
                for(int i=2;i<Math.sqrt(n);i++){
                    if(n%i==0){
                        num++;
                        n=n/i;
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    num++;
                    break;
                }

            }*/
           for(int i=2;i<=Math.sqrt(n);i++){
               if(n%i==0){
                   num++;
                   n/=i;
                   i--;
               }

           }
            System.out.println(num+1);

        }
    }
}
