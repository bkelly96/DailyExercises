package com.revature.day2.rectangle;

import java.util.*;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RectangleCalculations recCalc = new RectangleCalculations();

        recCalc.area(sc);
        recCalc.perimeter(sc);

        System.out.println("The perimeter  of the rectangle is " + recCalc.getPerm());
        System.out.println("The area of the rectangle is " + recCalc.getArea());

    }
}
