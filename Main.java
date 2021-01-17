import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What operation would you like to do?");
        System.out.println("Options: Type a for Addition...");
        System.out.println("Options: Type b for Multiplication...");
        System.out.println("Options: Type c for Division...");
        System.out.println("Options: Type d for Subtraction...");
        System.out.println("Options: Type e to quit...");
        String choice_1 = sc.nextLine();

        if (choice_1.equals("a")) {
            System.out.println("Enter first number");
            String first_number_1 = sc.nextLine();

            System.out.println("Enter second number");
            String second_number_1 = sc.nextLine();

            int inum2 = Integer.parseInt(second_number_1);
            int inum1 = Integer.parseInt(first_number_1);

            System.out.println(inum1 + inum2);

        }

        else if (choice_1.equals("b")) {
            System.out.println("Enter first number");
            String first_number_2 = sc.nextLine();

            System.out.println("Enter second number");
            String second_number_2 = sc.nextLine();

            int inum3 = Integer.parseInt(first_number_2);
            int inum4 = Integer.parseInt(second_number_2);

            System.out.println(inum3 * inum4);

        }

        else if (choice_1.equals("c")) {
            System.out.println("Enter first number");
            String first_number_3 = sc.nextLine();

            System.out.println("Enter second number");
            String second_number_3 = sc.nextLine();

            int inum5 = Integer.parseInt(first_number_3);
            int inum6 = Integer.parseInt(second_number_3);

            System.out.println(inum5 / inum6);


        }

        else if(choice_1.equals("d")) {
            System.out.println("Enter first number");
            String first_number_4 = sc.nextLine();

            System.out.println("Enter second number");
            String second_number_4 = sc.nextLine();

            int inum7 = Integer.parseInt(first_number_4);
            int inum8 = Integer.parseInt(second_number_4);

            System.out.println(inum7 - inum8);


        }
        else if (choice_1.equals("e")) {
            System.out.println("Quiting...");
            System.exit(0);
        }
        else {
            System.out.println("you did not enter a letter try it again without a captial letter.");
            System.exit(0);
        }

    }
}
