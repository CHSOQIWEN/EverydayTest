package 剑指offer;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/1 20:36
 */
public class Test1 {
    // * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //斐波那契数列
    public int Fibonacci(int n) {

        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    //https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
    //跳台阶
    public int JumpFloor(int target) {
        //0  0,1  1,2  2,3  3,4  1111  121  211  112  22  5
        if(target==0){
            return 0;
        }else if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }

    }

    //https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
    //变态跳台阶
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }else {
            return (int )Math.pow(2,target-1);
        }

    }


}
