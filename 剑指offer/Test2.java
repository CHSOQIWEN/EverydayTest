package 剑指offer;

/**
 * @Author:chaoqiwen
 * @Date:2019/9/1 20:48
 */
public class Test2 {
    //替换空格
    //https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    public String replaceSpace(StringBuffer str) {

        String n1=str.toString();
        String n2=n1.replaceAll(" ","%20");
        return n2;
    }
}
