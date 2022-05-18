package javatrainning.scannerexample;

import java.util.Scanner;

public class ScannerExammple3 {
    int a;
    int b;
    int c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        ScannerExammple3 s3 = new ScannerExammple3();
        s3.a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        s3.b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        s3.c = sc.nextInt();
    }
}
