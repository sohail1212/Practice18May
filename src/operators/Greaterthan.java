package javatrainning.operators;

import java.util.Scanner;

public class Greaterthan {
    int a;
    int b;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a : " );
        Greaterthan gt = new Greaterthan();
        gt.a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        gt.b=sc.nextInt();
        System.out.println("Value of m : ");
        int m = sc.nextInt();
        System.out.println("Value of j : " );
        int j = sc.nextInt();
        System.out.println("Value of k : " );
        int k = sc.nextInt();
        System.out.println("The greatest value is");

            if(m>k) {
                System.out.println(m);
            }
             if(j>k) {
                System.out.println(j);
            }
             if (k>m){
                System.out.println(k);
            }
           if (m>k){
                System.out.println(m);
            }
             if (j>m){
                System.out.println(j);
            }
        }
    }



