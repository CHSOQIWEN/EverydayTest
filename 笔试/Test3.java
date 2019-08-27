package 笔试;

import java.util.Scanner;

/**
 * @Author:chaoqiwen
 * @Date:2019/8/27 19:46
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int N=scanner.nextInt();
            int M=scanner.nextInt();
            int[][] A=new int[N][M];
            int min=0;
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    A[i][j]=scanner.nextInt();

                    if(j<M-1) {
                        min = Math.min(A[0][j], A[0][j + 1]);
                    }
                }
            }

            int sum=0;
            for(int i=0;i<M;i++) {
                sum +=A[0][M-1];
            }
            for(int i=1;i<N;i++){
                for(int j=0;j<M;j++){
                    if(A[i][j]>min){
                        sum=sum-min;
                        sum+=A[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
