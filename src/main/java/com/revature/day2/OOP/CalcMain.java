package com.revature.day2.OOP;

public class CalcMain {

    public static void main(String[] args) {

        Calculator.brand = "Canon";

        Calculator cal1 = new Calculator();
//        cal1.setNum1(3);
//        cal1.setNum2(12);
        cal1.setVal(3,12);

        Calculator cal2 = new Calculator();
//        cal2.setNum1(20);
//        cal2.setNum2(22);
        cal2.setVal(22);

        Calculator cal3 = new Calculator(12, 12);

        int s1 = cal1.add();
        int s2 = cal2.add();
        int s3 = cal3.add();

        int a = cal1.add();
        System.out.println("Sum given by calculator : " + a);

        int s = cal1.subtract();
        System.out.println("Sum given by Calc subtract: " + s);

        System.out.println("sum given by calc1 with " + cal1.getNum1() + " and " + cal1.getNum2() + " : " + s1+ "and brand is " + Calculator.brand);
        System.out.println("sum given by calc2 with " + cal2 + " : " + s2 + " and brand is " + Calculator.brand);
        System.out.println("sum given by calc3 with " + cal3.toString() + " and "+ s3 + " and brand is " + Calculator.brand);
    }
}
