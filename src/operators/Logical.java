package javatrainning.operators;

public class Logical {
    public static void main(String [] args){
        int num1=15;
        int num2=25;

        System.out.println((num1>num2) && (num2>num1));
        System.out.println((num1>num2) ||(num2>num1));
        System.out.println(!(num1<num2));
    }
}
