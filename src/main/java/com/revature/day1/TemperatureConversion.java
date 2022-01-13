package com.revature.day1;

import java.util.*;

public class TemperatureConversion {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        farToCel(sc);
        celToFar(sc);
        
    }

    private static void celToFar(Scanner sc) {

        System.out.println("Enter the Celsius");
        double cel = sc.nextFloat();

        double far = (cel * 1.8) + 32;

        System.out.println("The Farenheit is " + far);
    }

    private static void farToCel(Scanner sc) {
        System.out.println("Enter the Farenheit");

        double far = sc.nextFloat();

        double cel = ((far - 32) * 5/9);

        System.out.println("The Celsius is " + cel);

    }


}
