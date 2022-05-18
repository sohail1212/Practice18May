package javatrainning.operators;

public class Arithmetic {
    public static void main (String [] args) {
        int num1 = 10 ;
        int num2 = 20 ;
        int sum,sub,multiply,divide,percentile;
        sum = num1+num2;
        System.out.println("sum :" +sum );
        sub =  num1-num2;
        System.out.println("sub:" +sub);
        multiply = num1*num2;
        System.out.println("multiply:" +multiply);
        divide = num2/num1;
        System.out.println("divide:" +divide);
        percentile =num1%num2;
        System.out.println("percentile:" +percentile);
    }
}
