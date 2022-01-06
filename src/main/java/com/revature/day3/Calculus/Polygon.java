package com.revature.day3.Calculus;

abstract class Polygon {

    double dim1;
    double dim2;

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public Polygon(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Polygon() {
        dim1 = 0;
        dim2 = 0;
    }

    public double getArea(){
        double area = 0;
        return area;
    }

    @Override
    public String toString() {
        return "Polygon[" + "dim1= " + dim1 + ", dim2= " + dim2 + ']';
    }
}
