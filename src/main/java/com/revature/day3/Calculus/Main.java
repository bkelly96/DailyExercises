package com.revature.day3.Calculus;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(5, 8);

        Rectangle r1 = new Rectangle(10, 12);

        System.out.println("Area of " +t1+ " is " + t1.getArea());
        System.out.println("Area of " +r1+ " is " + r1.getArea());
    }
}
