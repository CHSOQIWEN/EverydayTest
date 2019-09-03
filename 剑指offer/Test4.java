package 剑指offer;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/3 11:05
 */
public class Test4 {
    //数值的整数次方
    public double Power(double base, int exponent) {
        if(base==0) {
            return 0;
        }else if(exponent==0){
            return 1;
        } else {
            return Math.pow(base,exponent);
        }

    }
}
