package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        double area;
        double radius;
        String convert;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius");
        radius = input.nextDouble();
        input.close();

        public static void checkRadius(String[] args){
        convert = String.valueOf(radius);
        while (convert = "0" || convert = ""){
            System.out.println("Please enter a positive number");
            checkRadius();
        }
        }

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "  + radius + " is: "  + area);


    }
}
