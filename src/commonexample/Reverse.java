package javatrainning.commonexample;

public class Reverse {
    public static void main(String[] args) {
        int  number=12456789;
        int remainder;
        int reverse=0;
        while(number!=0)
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println(+reverse);
    }
}
