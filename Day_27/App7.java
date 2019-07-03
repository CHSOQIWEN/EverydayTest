package com.bittch.Day_27;

/**
 * @author CHAOQIWEN
 * @data 2019/7/3 21:58
 */
class Cylinder
{
    private static double pi=3.14;
    private double radius;
    private int height;
    public Cylinder(double r,int h)
    {
        radius = r;
        height = h;
    }
    public void compare(Cylinder volu)
    {
        if(this== volu)
        {
            System.out.println("这两个对象相等");
        }
        else
        {
            System.out.println("这两个对象不相等");
        }
    }
}


public class App7 {
    public static void main(String[] args)
    {
        Cylinder volu1 = new Cylinder(1,2);
        Cylinder volu2 = new Cylinder(1,2);
        Cylinder volu3 = volu1;
        volu1.compare(volu2);
        volu1.compare(volu3);
    }

}
