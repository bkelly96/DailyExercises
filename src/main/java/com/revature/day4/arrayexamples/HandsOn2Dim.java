package com.revature.day4.arrayexamples;

import java.util.Scanner;

public class HandsOn2Dim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many arrays ?");
        int m = sc.nextInt();
        int[][] arr = new int[m][];
        for (int c = 0; c < m; c++) {
            System.out.println("How many elements in " + c + " each array?");
            int n = sc.nextInt();
            arr[c] = new int[n];
        }

        for (int c = 0; c < arr.length; c++) {
            for (int d = 0; d < arr[c].length; d++) {
                arr[c][d] = sc.nextInt();
            }
        }
        System.out.println("Enter elements below: ");
        for (int c = 0; c < arr.length; c++) {
            for (int d = 0; d < arr[c].length; d++) {
                System.out.println(arr[c][d] + " ");
            }
            System.out.println();
        }

        System.out.println(getMinValue(arr));
        System.out.println(getMinValue(arr));
        System.out.println(getSum(arr));
    }

    public static int getMinValue(int[][] arr) {
        int minValue = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] < minValue) {
                    minValue = arr[j][i];
                }
            }
        }

        return minValue;
    }



    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getSum(int[][] numbers){
        int sum = 0;

        for(int i = 0; i < numbers[0].length; i++){
            sum += numbers[0][i] + numbers[numbers.length - 1][i];
        }

        for (int j = 1; j < numbers.length - 1; j++){
            sum += numbers[j][0] + numbers[j][numbers[0].length - 1];
        }

        return sum;
    }


}
