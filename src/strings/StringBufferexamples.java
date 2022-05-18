package javatrainning.strings;

import java.util.Scanner;

public class StringBufferexamples {
    public static void main (String [] args){
        String s=new String ("I am from Raichur.");
        StringBuffer sbf=new StringBuffer("I work in Hyderabad.");
        StringBuilder sbd=new StringBuilder("I Studied in Bangalore.");

        System.out.println(sbf.append(s));
//        System.out.println(sbd.append(sbf));

//        sbf.append(sbd);
//        System.out.println(sbf);
//        // to remove I Studied in bangalore
//        sbf.indexOf("Bangalore");
//        System.out.println(sbf);
        System.out.println(sbf.length());
  //      System.out.println(sbf);
//        System.out.println(sbf.indexOf("Raichur"));
//        System.out.println(sbf.lastIndexOf("."));
//        System.out.println(sbf.replace(30,37,"Gadwal"));
        System.out.println(sbf.reverse());
    }
}
