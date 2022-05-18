package javatrainning.parentchildexample;

import java.sql.SQLOutput;

public class Crocodile extends Animal {
    private String color;
    private String harmful;
    private String amphibian;

    Crocodile(String color,String harmful,String amphibian){
        this.color=color;
        this.harmful=harmful;
        this.amphibian=amphibian;

    }
    void ccd(){
        System.out.println("Crocodile color is: " + color);
        System.out.println("Crocodile is : " +harmful);
        System.out.println("Crocodile is an : " +amphibian);


    }
}
