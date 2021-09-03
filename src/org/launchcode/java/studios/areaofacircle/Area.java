package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        if (radius < 0) {
            System.out.println("Invalid input: Negative number");
        } else {
            area = Circle.getArea(radius);
            System.out.println("The area of circle of radius " + radius + " is: " + area);
        }
    }
}