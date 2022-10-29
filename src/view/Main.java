package view;

import data.University;
import persistance.DataLoader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University globantU = DataLoader.loadUniversity();

        System.out.println("Welcome to " + globantU.getName());
        System.out.println("----------------------------");
        System.out.println("Please choose one of the following options:");
        Scanner scan = new Scanner(System.in);

        int option;
        do{
            System.out.println("1. Show all the Teachers");
            System.out.println("2. Show all the Courses");
            System.out.println("3. Create a new Student");
            System.out.println("4. Create a new Course");
            System.out.println("5. Search to Student's courses");
            System.out.println("6. Close the app");
            option = scan.nextInt();
                switch (option){
                    case 1:
                        printTeachersList(globantU);
                        break;
                    case 2:
                        printMenuCourses(globantU);
                        break;
                    case 3:
                        createNewStudent(globantU);
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Thanks for use our app, have a nice day!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("You must choose a valid option!");
                        break;
                }
        } while (option != 5);
    }

    public static void printTeachersList(University university){
        System.out.println("The Globant University teachers are:");
        System.out.println("------------------------");
        System.out.println(university.getTeacherList());
        System.out.println("------------------------");
    }
    public static void printMenuCourses(University university){
        Scanner scan = new Scanner(System.in);
        System.out.println("Globant University Courses:");
        System.out.println("------------------------");
        System.out.println(university.getCoursesName());
        System.out.println("------------------------");
        System.out.println("Choose a course to see their data:");
        int option;
        do{
            System.out.println("1. Python");
            System.out.println("2. Java");
            System.out.println("3. Javascript");
            System.out.println("4. C++");
            System.out.println("5. Back to the main menu");
            option = scan.nextInt();
                switch (option){
                    case 1:
                        System.out.println(university.getPythonData(0));
                        break;
                    case 2:
                        System.out.println(university.getJavaData(1));
                        break;
                    case 3:
                        System.out.println(university.getJavascriptData(2));
                        break;
                    case 4:
                        System.out.println(university.getCData(3));
                        break;
                    case 5:
                        System.out.println("Back to the previous menu");
                        break;
                    default:
                        System.out.println("You must choose a valid option!");
                        break;
                }
        } while (option != 5);
    }
    public static void createNewStudent(University university){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entry the new student name");
        String name = scan.nextLine();
        System.out.println("Entry the new student age");
        int age = scan.nextInt();
        System.out.println(university.createNewStudent(name, age));
        System.out.println("--Current students--");
        System.out.println(university.getStudentList());
        System.out.println("**NOTE** keep in mind the order of the list, the list starts at 0, so add the student with the last number of the list");
        System.out.println("The class codes are:");
        System.out.println("0. Python");
        System.out.println("1. Java");
        System.out.println("2. Javascript");
        System.out.println("3. C++");
        System.out.println("Type the number in list of the new student");
        int studentNumber = scan.nextInt();
        System.out.println("type the code of the course");
        int courseCode = scan.nextInt();
        university.addStudentInCourse(studentNumber, courseCode);
    }
}
