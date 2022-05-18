package javatrainning.parentchildexample;

public class Dog extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHarmful() {
        return harmful;
    }

    public void setHarmful(String harmful) {
        this.harmful = harmful;
    }

    private String harmful;
}
