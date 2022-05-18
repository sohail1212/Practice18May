package javatrainning.abstract1;

public class  Ford extends Car{
    private int amount;
    private String colour;

    Ford(int amount,String colour){
        this.amount=amount;
        this.colour=colour;
    }
    void asd(){
        System.out.println("Ford amount is : " +amount);
        System.out.println("Ford colour is : " +colour);
    }


    @Override
    void Cartypes(int a) {
        System.out.println("1233");
    }
}

