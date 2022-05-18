package javatrainning.immutabilityConcept;

public class MainImmutability {
    public static void main(String[] args) {
        ImmutabilityExample im=new ImmutabilityExample("Raj",123456789,25000,"12345");
        Long value = new Long(im.getSalary());
        System.out.println(value);
    }
}
