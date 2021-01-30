.java
package com.company;
// Main class can be found at Main_Class file in this repo

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Calc {




    HashMap<Range, String> func = new HashMap<>();
    List<Range> box = new ArrayList<>();

    public static void newClassfile() {
        File obj = new File("classGpa.txt");
        File obj2 = new File("className.txt");
        File obj3 = new File("classGrade");
    }

   public static String writeToClass(String class_Name, double classGrade, String classGpa){
       try {
           FileWriter myWriter = new FileWriter("classGpa.txt");
           myWriter.write(classGpa + " ");
           myWriter.close();

       } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }
       try {
           FileWriter myWriter = new FileWriter("className.txt");
           myWriter.write(class_Name+ " ");
           myWriter.close();

       } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }
       try {
           FileWriter myWriter = new FileWriter("classGrade.txt");
           myWriter.write(Double.toString(Double.parseDouble(classGrade+ " ")));
           myWriter.close();

       } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }

       return "...";

   }

   public static void readClass() throws FileNotFoundException {
       Scanner sc = new Scanner(System.in);
       File myObj = new File("data.txt");
       Scanner myReader = new Scanner(myObj);
       while (myReader.hasNextLine()) {
           String classes = myReader.nextLine();
           System.out.println("Your previous  classes was " + classes);
       }
       myReader.close();
   }

    public static void deleteFile(String fileToDelete) {
        File myObj = new File(fileToDelete);
        if (myObj.delete()) {
            System.out.println();
        } else {
            System.out.println("Failed to delete the file.");
        }


    }












    public static void new_File() throws IOException {
        File myObj = new File("data.txt");

    }

    public static void read_File() {
        try {
            Scanner sc = new Scanner(System.in);
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Your previous grade average was " + data);
                System.out.println("Would you like to erase your previous grade average? y/n");
                String y_n = sc.nextLine();
                if (y_n.equals("y")) {
                    deleteFile("data.txt");
                } else if (y_n.equals("n")) {
                    System.out.println("okay");
                } else {
                    System.out.println("Invalid response Enter y or n.");
                }
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
            myWriter.write(Double.toString(Write_This));
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return "...";
    }




    public void menu() throws IOException {

        Range class1 = new Range(0, 64);
        Range class2 = new Range(65, 66);
        Range class3 = new Range(67, 69);
        Range class4 = new Range(70, 72);
        Range class5 = new Range(73, 76);
        Range class6 = new Range(77, 79);
        Range class7 = new Range(80, 82);
        Range class8 = new Range(83, 86);
        Range class9 = new Range(87, 89);
        Range class10 = new Range(90, 92);
        Range class11 = new Range(93, 100);
        func.put(class1, "0.0 GPA");
        func.put(class2, "1.0 GPA");
        func.put(class3, "1.3 GPA");
        func.put(class4, "1.7 GPA");
        func.put(class5, "2.0 GPA");
        func.put(class6, "2.3 GPA");
        func.put(class7, "2.7 GPA");
        func.put(class8, "3.0 GPA");
        func.put(class9, "3.3 GPA");
        func.put(class10, "3.7 GPA");
        func.put(class11, "4.0 GPA");
        box.add(class1);
        box.add(class2);
        box.add(class3);
        box.add(class4);
        box.add(class5);
        box.add(class6);
        box.add(class7);
        box.add(class8);
        box.add(class9);
        box.add(class10);
        box.add(class11);

        Scanner sc = new Scanner(System.in);
        boolean quit = false;


        while (!quit) {
            new_File();
            read_File();
            System.out.println("Enter your grade average in percent form. Type 1010 to exit.");
            int grade_Average = (int) sc.nextDouble();
            System.out.println(getGpa(grade_Average));
            if (grade_Average == 1010) {
                quit = true;
            }

            write_File(grade_Average);
        }
    }


    public String getGpa(double average) {
        for (int i = 0; i < box.size(); i++) {
            Range tmp = box.get(i);
            if (tmp.contains(average)) {
                return func.get(tmp);
            }


        }
        return "";

    }

}
