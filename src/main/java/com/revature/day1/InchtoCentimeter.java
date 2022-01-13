package com.revature.day1;

import java.util.*;

public class InchtoCentimeter {



    public static void main(String[] args) {

        //1 inch = 2.54 centimeters
        Scanner sc =  new Scanner(System.in);

        conversionToCent(sc);
        conversionToInch(sc);
    }

    private static void conversionToInch(Scanner sc) {
        //1 Cent = 0.3937 inmches
        System.out.println("How many Centimeters?");
        double centi = sc.nextFloat();

        double inches = (centi * .3937);

        System.out.println("This many Inches " + inches);



    }

    private static void conversionToCent(Scanner sc) {

        System.out.println("How many Inches?");
        double inches = sc.nextFloat();

        double centi = (inches * 2.54);

        System.out.println("This many Centimeters " + centi);
    }



}
