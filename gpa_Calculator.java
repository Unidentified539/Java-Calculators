package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CalcV2 {

    HashMap<RangeV2, String> func=new HashMap<>();
    List<RangeV2>box=new ArrayList<>();
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
        try {
            File myObj = new File("className.txt");
            if (myObj.createNewFile()) {
            } else {
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

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
                if (y_n.equals("y")){
                    delete_File("data.txt");
                }
                else if (y_n.equals("n")) {
                    System.out.println("okay");
                }

                else {
                    System.out.println("Invalid response Enter y or n.");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            Scanner sc = new Scanner(System.in);
            File myObj = new File("className.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String classOfUser = myReader.nextLine();
                System.out.println("Your previous classes were " + classOfUser);
                System.out.println("Would you like this data to be deleted? y/n");
                String choice = sc.nextLine();
                if (choice.equals("y")) {
                    delete_File("classes.txt");
                }
            }
            myReader.close();


        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }



    public static void write_File(double writeGradeAverage, String writeClass, String writeClass2, String writeClass3, String writeClass4, String writeClass5, String writeClass6, String writeClass7) {
        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write(Double.toString(writeGradeAverage));
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("classes.txt");
            myWriter.write(writeClass + ", " +writeClass2+", "+writeClass3+", "+writeClass4+", "+writeClass5+", "+writeClass6+", "+writeClass7);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }



    public static void delete_File(String fileToDelete) {
        File myObj = new File(fileToDelete);
        if (myObj.delete()) {
            System.out.println();
        } else {
            System.out.println("Failed to delete the file.");
        }


    }


    public void menu() {

        RangeV2 class1 = new RangeV2(0, 64);
        RangeV2 class2 = new RangeV2(65, 66);
        RangeV2 class3 = new RangeV2(67, 69);
        RangeV2 class4 = new RangeV2(70, 72);
        RangeV2 class5 = new RangeV2(73, 76);
        RangeV2 class6 = new RangeV2(77, 79);
        RangeV2 class7 = new RangeV2(80, 82);
        RangeV2 class8 = new RangeV2(83, 86);
        RangeV2 class9 = new RangeV2(87, 89);
        RangeV2 class10 = new RangeV2(90, 92);
        RangeV2 class11 = new RangeV2(93, 100);
        func.put(class1, "0.0 GPA");
        func.put(class2, "1.0 GPA");
        func.put(class3,"1.3 GPA");
        func.put(class4,"1.7 GPA");
        func.put(class5,"2.0 GPA");
        func.put(class6,"2.3 GPA");
        func.put(class7,"2.7 GPA" );
        func.put(class8,"3.0 GPA");
        func.put(class9,"3.3 GPA" );
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



            System.out.println("Enter your first class name");
            String className1 = sc.next();
            System.out.println("Enter your " + className1 +   " grade point average 1 - 100");
            double gradeAverageForClass1 = sc.nextDouble();

            System.out.println("Enter your second class name");
            String className2 = sc.next();
            System.out.println("Enter your " + className2 +   " grade point average 1 - 100");
            double gradeAverageForClass2 = sc.nextDouble();


            System.out.println("Enter your third class name");
            String className3 = sc.next();
            System.out.println("Enter your " + className3 +   " grade point average 1 - 100");
            double gradeAverageForClass3 = sc.nextDouble();

            System.out.println("Enter your fourth class name");
            String className4 = sc.next();
            System.out.println("Enter your " + className4 +   " grade point average 1 - 100");
            double gradeAverageForClass4 = sc.nextDouble();

            System.out.println("Enter your fifth class name");
            String className5 = sc.next();
            System.out.println("Enter your " + className5 +   " grade point average 1 - 100");
            double gradeAverageForClass5 = sc.nextDouble();

            System.out.println("Enter your sixth class name");
            String className6 = sc.next();
            System.out.println("Enter your " + className6 +   " grade point average 1 - 100");
            double gradeAverageForClass6 = sc.nextDouble();

            System.out.println("Enter your seventh class name");
            String className7 = sc.next();
            System.out.println("Enter your " + className7 +   " grade point average 1 - 100");
            double gradeAverageForClass7 = sc.nextDouble();


            double grade_Average_Classes = gradeAverageForClass1 + gradeAverageForClass2 + gradeAverageForClass3 + gradeAverageForClass4 + gradeAverageForClass5 + gradeAverageForClass6 + gradeAverageForClass7 / 7;
            getGpa(grade_Average_Classes);
            write_File(grade_Average_Classes, className1,className2,className3,className4,className5,className6,className7);
            if (grade_Average_Classes == 1010) {
                quit = true;
            }
        }
    }
    public String getGpa(double average) {
        for (int i = 0; i < box.size(); i++) {
            RangeV2 tmp = box.get(i);
            if (tmp.contains(average)) {
                return func.get(tmp);
            }


        }
        return "";

    }

}
