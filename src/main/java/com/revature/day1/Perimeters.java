package com.revature.day1;

import java.util.*;

public class Perimeters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        triangle(sc);
        rectangle(sc);
        circle(sc);

    }

    public static void triangle(Scanner sc){
        System.out.println("How long is side 1");
        double s1 = sc.nextDouble();
        System.out.println("How long is side 2");
        double s2 = sc.nextDouble();
        System.out.println("How long is side 3");
        double s3 = sc.nextDouble();

        double perm = (s1+s2+s3);
        System.out.println("Perimiter of triangle = " + perm);
    }

    public static void rectangle(Scanner sc){
        System.out.println("How long is side 1");
        double s1 = sc.nextDouble();
        System.out.println("How long is side 2");
        double s2 = sc.nextDouble();
        System.out.println("How long is side 3");
        double s3 = sc.nextDouble();
        System.out.println("How long is side 4");
        double s4 = sc.nextDouble();

        double perm = (s1+s2+s3+s4);
        System.out.println("Perimeter of rectangle = " + perm);
        double rad = sc.nextDouble();
    }

    public static void circle(Scanner sc){

        final double PI = Math.PI;

        System.out.println("What is the Radius of the Circle?");
        double rad = sc.nextDouble();

        double perm = (2 * PI * rad);
        System.out.println("Perimeter of triangle = " + perm);
    }
}


