package javatrainning.strings;

public class StringMethods {
    public static void main(String[] args){
        StringBuffer sb1= new StringBuffer ("ABCD");
        String s="Sohail";
        String s1="Hyderabad";
        String s2="HyDeRaBaD";
        String s3= "";
        StringBuffer sb2= new StringBuffer ("Charminar");
        sb1.append(sb2);
        s.concat(s2);


        System.out.println(s.concat(" Java"));
        System.out.println(s.charAt(5));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(s3.codePointCount(0,0));
        System.out.println(s2.codePointCount(0,8));
        System.out.println(sb1);
        System.out.println(s);
        System.out.println(s1);
        String str8=String.join("=",s,s1,s2);
        System.out.println(str8);


    }
}
