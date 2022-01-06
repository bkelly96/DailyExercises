package com.revature.day3.Calculus;

public class Triangle extends Polygon{

    public Triangle(){
        super();
    }

    public Triangle(double d1, double d2){
        super(d1,d2);
        dim1 = d1;
        dim2 = d2;
    }


    public double getArea(){
        double area;
      area = dim1 * dim2 / 2;
      return area;
   }

    @Override
    public String toString() {
        return "Triangle[" + "dim1: " + dim1 +  ",dim2=" + dim2 + "]";
    }

}
