package com.company;
import java.util.Scanner;


public class Calculator {
    
    Scanner sc = new Scanner(System.in);

    public static void Add(double a, double b) {
        System.out.println(a + b);
    }

    public static void Subtract(double a, double b) {
        System.out.println(a + b);
    }

    public static void Multiply(double a, double b) {
        System.out.println(a + b);
    }

    public static void Divide(double a, double b) {
        System.out.println(a + b);
    }
    



    public void menu(){
        int a,b;
        boolean quit=false;
        while(!quit){
            System.out.println("""
                    choose 1 for addition\s
                    choose 2 for subtraction
                    choose 3 for multiplication\s
                    choose 4 for division\s
                    choose 5 to quit""");
            int menuitem=sc.nextInt();


            switch (menuitem) {
                case 1 -> {
                    System.out.println("Enter first number.");
                    a = sc.nextInt();
                    System.out.println("Enter second number ");
                    b = sc.nextInt();
                    Add(a, b);

                }
                case 2 -> {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    Subtract(a, b);
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    Multiply(a, b);
                }
                case 4 -> {
                    System.out.println("Enter first number");
                    int c = sc.nextInt();
                    System.out.println("Enter second number");
                    int d = sc.nextInt();
                    //ternary operators instead of an else if statement
                    if (c||d == 0) {
                        System.out.println("Identified");
                    }

                   /* else if (d == 0) {
                        System.out.println("Identified");
                    }*/

                    else {
                        Divide(c, d);

                    }
                    
                }

                
                case 5 -> {
                    quit = true;
                    System.out.println("Quiting...");
                }



            }


        }


    }


}
