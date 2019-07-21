package com.bittch.Day_42;

/**
 * @author CHAOQIWEN
 * @data 2019/7/21 15:01
 */
class Meal{
    Meal(){
        System.out.println("meal");
    }
}
class Bread{
    Bread(){
        System.out.println("bread");
    }
}
class Cheese{
    Cheese(){
        System.out.println("cheese");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("lettuce");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("lunch");
    }
}
class ProtableLunch extends Lunch{
    ProtableLunch(){
        System.out.println("pretablelunch");
    }
}
public class Sandwich extends ProtableLunch{
    Bread b=new Bread();
    Cheese c=new Cheese();
    Lettuce l=new Lettuce();
    public Sandwich(){
        System.out.println("sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
