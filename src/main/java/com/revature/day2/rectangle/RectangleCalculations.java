package com.revature.day2.rectangle;

import java.util.Scanner;

public class RectangleCalculations {

    double perm;
    double area;

    public double area(Scanner sc){
        System.out.println("Enter Length");
        double num1 = sc.nextDouble();
        System.out.println("Enter Breadth");
        double num2 = sc.nextDouble();

        area = (num1 * num2);

        return area;
    }

    public double perimeter(Scanner sc) {


        System.out.println("How long is side 1");
        double num1 = sc.nextDouble();
        System.out.println("How long is side 2");
        double num2 = sc.nextDouble();
        System.out.println("How long is side 3");
        double num3 = sc.nextDouble();
        System.out.println("How long is side 4");
        double num4 = sc.nextDouble();

        perm = num1 + num2 + num3 + num4;

        return perm;

    }

    public double getPerm() {
        return perm;
    }

    public void setPerm(double perm) {
        this.perm = perm;
    }


    public RectangleCalculations(double perm) {

        this.perm = perm;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public RectangleCalculations() {

    }

    @Override
    public String toString() {
        return "RectangleCalculations{" +
                "perm=" + perm +
                ", area=" + area +
                '}';
    }
}
