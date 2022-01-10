package com.revature.day4.arrayexamples;

import java.util.Scanner;

public class Array2Dim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many arrays ?");
        int m = sc.nextInt();
        int [][]arr = new int[m][];
        for (int c = 0; c < m; c++){
            System.out.println("How many elements in "+c+" each array?");
            int n = sc.nextInt();
            arr[c]= new int[n];
        }

        for(int c = 0; c < arr.length; c++){
            for(int d = 0; d<arr[c].length;d++){
                arr[c][d]= sc.nextInt();
            }
        }
        System.out.println("Enter elements below: ");
        for(int c=0; c<arr.length;c++){
            for(int d = 0;d < arr[c].length; d++){
                System.out.println(arr[c][d]+" ");
            }
            System.out.println();
        }
    }

    //find the elements sum of each row

}
