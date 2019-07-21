package com.bittch.Day_42;


/**
 * @author CHAOQIWEN
 * @data 2019/7/21 11:49
 */
class Instrument{
    public void play(Note n){

       System.out.println("Instrumen.play()");
    }
}
class Wind extends Instrument{
    public void play(Note n){
        System.out.println("wind.play() "+n);
    }
    public void print(){
        System.out.println("只有子类有");
    }
}
public class DuoTaiTest {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {

        Instrument flute= new Wind();


       System.out.println( flute instanceof Instrument);
       System.out.println(flute instanceof Wind);
       if(flute instanceof  Wind){
           Wind f=(Wind) flute;
           f.print();
           f.play(Note.MIDDLE_C);
       }
    }

}
