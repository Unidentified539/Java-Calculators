import java.util.Scanner;

public class gpa_Calculator {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter your grade average in percent form.");
        int grade_Average = sc.nextInt();


        if (grade_Average <= 59) {
            System.out.println("0.0 GPA");

        }

        else if (grade_Average <= 62) {
            System.out.println("0.7 GPA");

        }

        else if (grade_Average <= 63) {
            System.out.println("1.0 GPA");

        }

        else if (grade_Average <= 69) {
            System.out.println("1.3 GPA");

        }

        else if (grade_Average <= 72) {
            System.out.println("1.7 GPA");
        }

        else if (grade_Average <= 76) {
            System.out.println("2.0 GPA");

        }

        else if (grade_Average <= 79) {
            System.out.println("7.3 GPA");

        }

        else if (grade_Average <= 82) {
            System.out.println("2.7");

        }

        else if (grade_Average <= 86) {
            System.out.println("3.0 GPA");

        }

        else if (grade_Average <= 89)
            System.out.println("3.3");

        else if (grade_Average <= 92) {
            System.out.println("3.7 GPA");

        }

        else if (grade_Average <= 100) {
            System.out.println("4.0 GPA");
        }
    }




}
