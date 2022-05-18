package javatrainning.oops.abstracto;

import javatrainning.oops.abstracto.Shape;

public class Rectangle  extends Shape {
    private int length;
    private int breadth;

     Rectangle(int length, int breadth){
         super();
      super.length=length;
      super.breadth=breadth;
        int area=length*breadth;

    }
  @Override
    public void area() {
        System.out.println(length*breadth);

    }
}
