package com.revature.day2;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me a number up to 100");
        int num1 = sc.nextInt();

        if (num1 <= 100){
            int i = 1;
            while (i <= num1){
                if(i%2 == 0){
                    System.out.println(i + " even");
                    i++;
                } else {
                    System.out.println(i + " odd");
                    i++;
            }

        }
    } else {
            System.out.println(num1 + "is greater than 100");
        }

}
}
