package 笔试;

import sun.plugin.javascript.navig.Array;

import java.util.*;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/3 16:26
 */
public class Test10 {
    /*public static boolean pair(int a, int b) {
        if (a + b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        while (scanner.hasNext()) {
            a.add(scanner.nextInt());

            Arrays.sort(a.toArray());

            int begin = 0;
            int end = a.size() - 1;
            int num = 0;
            while (begin < end) {
                if (pair(a.get(begin), a.get(end)) == true) {
                    num++;

                } else if (a.get(begin) + a.get(end) > 0) {
                    end--;
                } else {
                    begin++;
                }
            }
            System.out.println(num);

        }
    }
*/
    public static void ppp(String str){
        String[] a=str.split(",");
        int[] b=new int[a.length];
       // Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++) {
             b[i] = Integer.valueOf(a[i]);
        }
        int num=0;
        boolean[] c=new boolean[a.length];
        for(int i=0;i<b.length;i++){
            int x1=b[i];
            c[i]=true;
            for(int j=i+1;j<b.length;j++){
                if(c[j]==false) {
                    if (-x1 == b[j]) {
                        c[j] = true;
                        num++;
                    }
                }
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        String str="1,2,3,4,-1,-2";
        ppp(str);
    }


}

