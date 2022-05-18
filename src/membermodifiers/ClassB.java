package javatrainning.membermodifiers;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassA a =new ClassA();
        a.m1();
        ClassB b= new ClassB();
        b.m1();
        ClassA a1= new ClassB();
        a1.m1();
//        ClassB b1= new ClassA();
//        b1.m1();
    }
}
