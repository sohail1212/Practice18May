package javatrainning.scannerexample;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Username:");
        String a=s.nextLine();

        System.out.println("Password:");
        String b=s.nextLine();

        System.out.println("Submit:");
        String c=s.nextLine();
    }
}
