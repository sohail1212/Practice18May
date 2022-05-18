package javatrainning.abstract1;

public class BenzCar extends Car {
    private String colour;
    private int amount;
    BenzCar(int amount,String colour){
        this.amount=amount;
        this.colour=colour;
    }

   void abc() {


       System.out.println("Benzcar amount is : " +amount);
       System.out.println("Benzcar colour is : " +colour);
    }

    @Override
    void Cartypes(int a) {

    }

    void m3()
    {
        super.m2();
        System.out.println("juhgfd");
    }
}
