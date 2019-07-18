package com.bittch.Day_40;

/**
 * @author CHAOQIWEN
 * @data 2019/7/18 10:26
 */
class Point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

public class FanXingTest {
    public static void main(String[] args) {
        Point<String> p=new Point<>();
        Point<Double> G=new Point<>();
        G.setX(10.2);
        p.setY("北纬20度");
        double x=G.getX();

        String y=p.getY();
        System.out.println("x="+x+"、y="+y);
    }
}
