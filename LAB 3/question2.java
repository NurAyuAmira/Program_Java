package com.lab3;

import java.util.Scanner;

public class question2 {


    public static double getAreaRectangle(double w, double l) {
        return (w*l);
    }

    public static double getRadiusCircle(double r) {
        return (Math.PI * Math.pow(r, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        double width, length;

        System.out.println("=======MENU=======");
        System.out.println("1. Calculate Area of Rectangle");
        System.out.println("2. Calculate Area of Circle");
        System.out.println("3. Exit Program");

        System.out.print("\nPlease enter your choice: ");
        int choice = input.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    width = input.nextDouble();
                    System.out.print("Enter length: ");
                    length = input.nextDouble();

                    area = getAreaRectangle(width,length);
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();

                    area = getRadiusCircle(radius);
                    break;

                default:
                    System.out.println("Invalid input.");
                    area = 0;
            }
            System.out.printf("The area is %.2f\n", area);
            System.out.print("\nPlease enter your choice: ");
            choice = input.nextInt();
        }
        System.out.println ("Program End.");
    }
}
