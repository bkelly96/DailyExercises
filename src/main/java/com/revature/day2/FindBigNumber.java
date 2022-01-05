package com.revature.day2;

import java.util.Scanner;

public class FindBigNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the biggest");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest");
        }else{
            System.out.println("No number is the biggest");
        }


    }
}
