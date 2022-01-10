package com.revature.day4.arrayexamples;

import java.util.Scanner;

public class HandsOn {
    public static void main(String[] args) {

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

        System.out.println("Smallest: " + getSmallest(marks));


    }

    public static int getSmallest(int [] a){

        int temp;

        for (int i = 0; i < a.length; i ++){

            for (int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[0];
    }


}

