package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        double Area;
        double Radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius");
        Radius = input.nextDouble();
        input.close();

        Area = Circle.getArea(Radius);
        System.out.println("The area of a circle of radius "  + Radius + " is: "  + Area);


    }
}
