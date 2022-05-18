package javatrainning.strings;

public class Constructor {
    private static String name;
    int i;
    Constructor(){
        i=5;
        System.out.println("Constructor Called");

    }

    public static void main(String[] args) {
       Constructor c=new Constructor();
        System.out.println("Value of i : " + c.i);
    }
}
