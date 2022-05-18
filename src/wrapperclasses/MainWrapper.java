package javatrainning.wrapperclasses;

public class MainWrapper {
    public static void main(String[] args) {
        WrapperClass wc=new WrapperClass();
        System.out.println("The Value of wrapperClass Integer : " +wc.getA());
        System.out.println("The Value of wrapperClass Float : " +wc.getF1());
        System.out.println("The Value of wrapperClass Double : "+wc.getA1());
        System.out.println("The Value of wrapperClass Double : "+wc.getB());
        System.out.println("The Value of wrapperClass Double : "+wc.getC());
        System.out.println("The Value of wrapperClass Double : "+wc.getC1());
        // unboxing
        Integer i = new Integer(50);
        int a=i;
        System.out.println(a);
    }
}
