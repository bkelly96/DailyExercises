package com.revature.day2;

public class WhileDemo_01 {
    public static void main(String[] args) {
        double loan = 10000;
        int emi = 1000;
        int noemis = 0;
        double interest;
        double fixedInt = .08;


        while (loan > 0){
            loan -= emi;
            noemis ++;
            interest = loan * fixedInt;
            loan += interest;
            System.out.println("Paying "+emi+" of the installment "+noemis);

        }

        System.out.println("You are free from the loan after " +noemis+" installments has paid");
    }
}
