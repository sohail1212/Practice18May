package javatrainning.strings;

import java.util.StringTokenizer;

public class StringTokenizersExample {
    public static void main (String[] args){

        StringTokenizer d=new StringTokenizer("Happy: Birthday: Divya", ":");
        while (d.hasMoreElements()){

        System.out.println(d.nextToken());
    }
    }
}
