package javatrainning.overloadandoverride;

public class Overload {
     public static int  sample(
             int a ,int b){
         return a+b;
    }
    float sample(float f, int b){
         return f-b;
    }
    public double sample(short e, long d){
         return e/d;
    }
}
