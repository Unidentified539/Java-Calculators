package com.company;
// Main class can be found at Main_Class file in this repo
import java.io.*;
import java.util.Scanner;

public class beta_Gpa_Calculator {


    public static void new_File() {
        try {
            File myObj = new File("data.txt");
            if (myObj.createNewFile()) {
                String result = "Done";
            } else {
                String status = "file on machine";
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void read_File() {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static String write_File(double Write_This) {
        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write((int) Write_This);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return "...";
    }


    public static void delete_File() {
        File myObj = new File("data.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }


    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean quit = false;


        while (!quit) {
            new_File();
            read_File();

            System.out.println("Enter your grade average in percent form. Type 1010 to exit.");
            int grade_Average = (int) sc.nextDouble();
            if (grade_Average <= 59) {
                System.out.println("0.0 GPA");
            } else if (grade_Average <= 62) {
                System.out.println("0.7 GPA");

            } else if (grade_Average <= 63) {
                System.out.println("1.0 GPA");

            } else if (grade_Average <= 69) {
                System.out.println("1.3 GPA");

            } else if (grade_Average <= 72) {
                System.out.println("1.7 GPA");
            } else if (grade_Average <= 76) {
                System.out.println("2.0 GPA");

            } else if (grade_Average <= 79) {
                System.out.println("7.3 GPA");

            } else if (grade_Average <= 82) {
                System.out.println("2.7");

            } else if (grade_Average <= 86) {
                System.out.println("3.0 GPA");

            } else if (grade_Average <= 89)
                System.out.println("3.3");

            else if (grade_Average <= 92) {
                System.out.println("3.7 GPA");

            } else if (grade_Average <= 100) {
                System.out.println("4.0 GPA");
            } else if (grade_Average == 1010) {
                System.out.println("Quiting...");
                quit = true;
            } else {
                System.out.println(" Invalid Input Please try again");
            }

            write_File(grade_Average);



        }


    }


}

