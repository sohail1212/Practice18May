package javatrainning.abstract1;

import java.sql.SQLOutput;

public class CarMain {
    public static void main(String [] args) {
        Tata t=new Tata();
        t.setAmount(100000);
        t.setColor("White");
        System.out.println( "Tata Car Colour is " +t.getColor());
        System.out.println("Tata Car amount is " +t.getAmount());
        System.out.println("============================");

        Swift s=new Swift();
        s.setAmount(200000);
        s.setColour("Red");
        System.out.println("Swift Amount is " +s.getAmount());
        System.out.println("Swift Colour is " +s.getColour());
        System.out.println("++++++++++++++++++++++++++++++");

        BenzCar b=new BenzCar(5000000,"Black");
       b.abc();
        System.out.println("+++++++++++++++++++++++++++++");

        Ford f=new Ford(400000,"Green");
        f.asd();

        b.m3();
    }
}
