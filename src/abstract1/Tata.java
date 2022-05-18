package javatrainning.abstract1;

public class Tata extends Car {
    private String color;
    private int amount;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    void Cartypes(int a) {
        System.out.println("123");
    }
}
