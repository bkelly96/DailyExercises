package com.revature.day3.Calculus;

public class Rectangle extends Polygon {
    public Rectangle(){
        super();
    }

    public Rectangle(double d1, double d2){
        super(d1,d2);
    }

    public double getArea(){
        double area;
        area = dim1 * dim2;
        return area;
    }
}
