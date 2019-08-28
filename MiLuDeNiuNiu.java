package Day_48;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/fc72d3493d7e4be883e931d507352a4a?tpId=98&tqId=32827&tPage=1&rp=1&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 * @Author:chaoqiwen
 * @Date:2019/8/28 19:28
 */
public class MiLuDeNiuNiu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            String[] a={"N","E","S","W"};

            String[] b=new String[n];
            for(int i=0;i<n;i++){
                 b[i]=scanner.next();
            }
            int tmp=0;
            for(int i=0;i<n;i++){
               if(b[i].equals("L")){
                   tmp--;

               }else {
                   tmp++;
               }
            }


            if(tmp >= 0) {
               tmp=tmp%4;
            }else {
                tmp = -tmp;
                tmp=4-tmp%4;
            }
            System.out.println(a[tmp]);
        }
    }
}
