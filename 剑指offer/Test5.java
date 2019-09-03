package 剑指offer;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/3 11:13
 */
public class Test5 {
    //二进制中1的个数
    public  static int NumberOf1(int n) {
        int num=0;
        if(n>0){

            while (n>1){
                if(n%2==1){
                    num++;
                    n/=2;
                }else {
                    n=n/2;
                }
            }
            return num+1;
        }
        if (n<0){
            num+=1;
            if(Math.abs(n)%2==0){
                n=Math.abs(n+1);
            }else {
                n=Math.abs(n-1);
            }
            while (n>1){
                if(n%2==1){
                    num++;
                    n/=2;
                }else {
                    n=n/2;
                }
            }
            return num+1;
        }
        return 0;


    }

    public static void main(String[] args) {
        int n=-11;
        System.out.println(NumberOf1(n));
    }
}
