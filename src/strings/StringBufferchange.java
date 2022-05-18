package javatrainning.strings;

public class StringBufferchange {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("My name is Sohail.My Brother is Sohail.My uncle name is Sohail.");
        //output shud be My name is Sohail.My brother0 is sameer.My uncle name is XYZ
        //First step
        sb.lastIndexOf("Sohail");
        System.out.println(sb.delete(56,62));
        System.out.println(sb.lastIndexOf("Sohail"));
        System.out.println(sb.insert(56,"XYZ"));
                //2nd Step
        System.out.println(sb.lastIndexOf("Sohail"));
        System.out.println(sb.delete(32,38));
        System.out.println(sb.insert(32,"Sameer"));
    }
}
