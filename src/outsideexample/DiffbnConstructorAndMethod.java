package javatrainning.outsideexample;

public class DiffbnConstructorAndMethod {

    public void method() {

        System.out.println("Method");
    }
    {
        System.out.println("Instance Block");
    }

    public void DiffbnConstructorAndMethod() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static Block");

    }

    public static void main(String[] args) {
        DiffbnConstructorAndMethod diff=new DiffbnConstructorAndMethod();
        diff.DiffbnConstructorAndMethod();
        diff.method();

    }
}
