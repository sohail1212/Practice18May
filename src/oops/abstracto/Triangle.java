package javatrainning.oops.abstracto;

public  class Triangle extends Shape {
    private int length;
    private int base;
    Triangle(int length,int base) {
        this.length=length;
        this.base=base;

    }

    @Override
    public void area() {
        System.out.println((1d/2f)*base*length);
    }
}
