import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        int a,b;
        boolean quit=false;
        while(!quit){
            System.out.println("choose 1 for addition \n"+"" +
                    "choose 2 for subtraction\n"+
                     "choose 3 for multiplication \n"+
                    "choose 4 for division \n" +
                    "choose 5 to quit");
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
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println(a / b);
                }
                case 5 -> {
                    quit = true;
                    System.out.println("Quiting...");
                }
            }





        }






    }





}
