package com.revature.day3.Calculus;

public class B extends A {
    public B(){
        System.out.println("Sub class no arg constructor");
    }

    public B(int arg){
        super(arg);
        System.out.println("Sub class with one arg constructor with: " +arg);

    }
}
