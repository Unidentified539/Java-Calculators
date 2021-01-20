import java.util.Scanner;
public class Calculator {
    Scanner sc = new Scanner(System.in);

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
                    System.out.println(a + b);
                }
                case 2 -> {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println(a - b);
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println(a * b);
                }
                case 4 -> {
                    System.out.println("Enter first number");
                    int c = sc.nextInt();//you can still use the same variables here 
                    System.out.println("Enter second number");
                    int e = sc.nextInt();
                    //you can use ternary operators here instead of writing another if statement here is where to read about them 
                    //https://www.tutorialspoint.com/Java-OR-Operator-Examples
                    //this will have the same output try and run the code i have commented out your code 
                    if (c||e == 0) {
                        System.out.println(0);
                    }
                    /*if (e == 0){
                        System.out.println(0);
                    }*/
                    else {
                        System.out.println(c / e);
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
