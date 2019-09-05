package 剑指offer;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/4 11:02
 */
public class Test6 {
    //旋转数组的最小数字
    public int minNumberInRotateArray(int [] array) {
        int min=999;
        for(int i=0;i<array.length;i++){
            if(array[i]<=min){
                min=array[i];
            }
        }
        return min;

    }
}
