package javatrainning.parentchildexample;

public class Main {
    public static void main(String[] args){

        Snake s=new Snake();
        s.setColor("Black");
        s.setHarmful("Very Harmfull");
        System.out.println("Snake Color is : " +s.getColor());
        System.out.println("Snake is :" +s.getHarmful());

        System.out.println("++++++++++++++++++++++++");

        Dog d=new Dog();
        d.setColor("Brown");
        d.setHarmful("Not Harmful");
        System.out.println("Dog color is :" +d.getColor());
        System.out.println("Dog is " +d.getHarmful());

        System.out.println("++++++++++++++++++++++++");

        Crocodile c= new Crocodile("Grey","Very Harmful","Amphibian");
        c.ccd();



    }
}
