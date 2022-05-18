package javatrainning.oops.abstracto;

import javatrainning.oops.abstracto.Rectangle;
import javatrainning.oops.abstracto.Triangle;

public  class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 30);
        r.area();
        Triangle t = new Triangle(50, 50);
        t.area();
    }
}

