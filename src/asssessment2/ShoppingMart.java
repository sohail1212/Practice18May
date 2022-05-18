package javatrainning.asssessment2;

import java.util.Scanner;

public class ShoppingMart {


    int total = 0;
    Scanner sc = new Scanner(System.in);
    public void mart() {
        System.out.println("Welcome to the RVS Market");
        System.out.println("1.Oil-200\n2.Red Label-250\n3.Clinic Plus-180\n4.Salt-40\n5.Lux-50\n6.Eggs-70\n7.GoodDay-45\n8.Surf Excel-60");

//        int total = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.println("Enter the Product Number : ");
            int item = sc.nextInt();
            switch (item) {
                case 1:
                    System.out.println("Oil");
                    total += 200;
                    System.out.println("Do you want to buy any extra product");
                    String st=sc.next();
                    switch (st){
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }

                    break;
                case 2:
                    System.out.println("Red Label");
                    total += 250;
                    System.out.println("Do you want to buy any extra product");
                    String st1=sc.next();
                    switch (st1) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 3:
                    System.out.println("Clinic Plus");
                    total += 180;
                    System.out.println("Do you want to buy any extra product");
                    String st2=sc.next();
                    switch (st2) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 4:
                    System.out.println("Salt");
                    total += 40;
                    System.out.println("Do you want to buy any extra product");
                    String st3=sc.next();
                    switch (st3) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 5:
                    System.out.println("Lux");
                    total += 50;
                    System.out.println("Do you want to buy any extra product");
                    String st4=sc.next();
                    switch (st4) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 6:
                    System.out.println("Eggs");
                    total += 70;
                    System.out.println("Do you want to buy any extra product");
                    String st5=sc.next();
                    switch (st5) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 7:
                    System.out.println("Good Day");
                    total += 45;
                    System.out.println("Do you want to buy any extra product");
                    String st6=sc.next();
                    switch (st6) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
                case 8:
                    System.out.println("Surf Excel");
                    total += 60;
                    System.out.println("Do you want to buy any extra product");
                    String st7=sc.next();
                    switch (st7) {
                        case "yes":
                            System.out.println("Ok");
                            break;
                        case "no":
                            mart2();
                            return;
                    }
                    break;
            }

        }
        System.out.println("The Total Amount is : " + total);
    }

    public void mart2(){
        System.out.println("Should I go for the Bill");
        String str = sc.next();
        switch (str) {
            case "yes":
                System.out.println("Enter Your Account Balance : ");
                int accountbalance = sc.nextInt();
                if (accountbalance >= total) {
                    System.out.println("The Bill is Generated successfully\nThank You & Visit Again");

                } else {
                    System.out.println("Insufficient Balance\nPlease Reduce the Products");
                }
                break;
            case "no":
                System.out.println("Rajat");
        }
    }
}



