package 笔试;

/**
 * @Author:chaoqiwen
 * @Date:2019/8/16 18:50
 */
public class Test2 {
    public static void chazhao(int[] array,int left,int right,int p){


            int mid=left+(right-left)/2;
            if(array[mid]>p){
                chazhao(array,left,mid,p);
            }else if(array[mid]<p){
                chazhao(array,mid,right,p);
            }else {
                System.out.println(mid+1);
            }

    }

    public static void main(String[] args) {
        int[] array={11,13,15,17,19,21};
        chazhao(array,0,array.length-1,11);

    }
}
