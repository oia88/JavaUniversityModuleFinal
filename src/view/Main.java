package view;

import data.University;
import persistance.DataLoader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University globantU = DataLoader.loadUniversity();

        System.out.println("Welcome to " + globantU.getName());
        System.out.println("Please choose one of the following options:");
        Scanner scan = new Scanner(System.in);

        int option;
        do{
            System.out.println("1. Show all the Teachers");
            System.out.println("2. Show all the Courses");
            System.out.println("3. Create a new Student");
            System.out.println("4. Create a new Course");
            System.out.println("5. Search to Student's courses");
            System.out.println("Close the app");
        } while (option != 5);
    }
}