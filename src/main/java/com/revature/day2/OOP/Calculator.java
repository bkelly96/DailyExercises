package com.revature.day2.OOP;

public class Calculator {


    int num1;
    int num2;

    public static String brand;

    public Calculator() {
        this.num1 = num1;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        if (num1 < 5) {
            this.num1 = 5;
            return;
        }
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {

        int add = num1 + num2;

        return add;

    }

    public int subtract() {
        int sub = num1 - num2;

        return sub;
    }

    public void setVal(int num1) {
        this.num1 = this.num2 = num1;
    }

    public void setVal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculator [num1 = "+num1+", num2 = "+num2+"]";
    }
}
