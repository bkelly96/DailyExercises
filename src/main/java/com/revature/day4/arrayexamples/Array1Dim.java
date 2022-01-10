package com.revature.day4.arrayexamples;

import java.util.Scanner;

public class Array1Dim {

    public static void main(String[] args) {

        //square brackets are associated to the data type

        int[] marks;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        marks = new int[size];

        for (int c = 0; c < marks.length; c++) {
            System.out.println("Enter element: ");
            marks[c] = sc.nextInt();
        }

        System.out.println("Elements entered");
        for (int c = 0; c < marks.length; c++) {
            System.out.println(marks[c]);
        }

        System.out.println("all done");


    }
}

//    public static int sum (int []arr){
//
//    }

    //Display Sum of Elements
//Greatest and smallest element in the array
