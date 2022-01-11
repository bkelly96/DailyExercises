package com.revature.day6;

import com.revature.day6.exception.InsufficientFundException;

import java.util.Scanner;

public class EComm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance");
        int bal = sc.nextInt();
        System.out.println("Enter Cost");
        int cost = sc.nextInt();

        try {

            bal = placeOrder(bal, cost);
            System.out.println("Updating Balance after placing the order" + bal);
            System.out.println("Thanks for using");
        } catch (InsufficientFundException insufficientFundException){
            System.out.println(insufficientFundException.getMessage());
            insufficientFundException.printStackTrace();
        }
    }

    public static int placeOrder (int bal, int cost) throws InsufficientFundException{
        int updatedBal;
        if (bal < cost){
            InsufficientFundException insufficientFundException = new InsufficientFundException("Insufficient fund avaialble" +bal+
                    "to place order at the cost" +cost);
            throw insufficientFundException;
        }

        updatedBal = bal - cost;

        return updatedBal;
    }

}
