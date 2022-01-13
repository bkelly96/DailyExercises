package com.revature.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    
    @Test
    void addAndTestEqual() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5,7);
        assertEquals(12,result);
        calculator = null;

    }

    @Test
    void addAndTestNotEquals(){
        Calculator calculator = new Calculator();
        int result = calculator. add(5,7);
        assertNotEquals(15, result);
    }

    @Test
    void subtractAndTestEquals() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,3);
        assertEquals(7, result);
        calculator = null;
    }

    @Test
    void subtractAndTestNotEquals(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,3);
        assertNotEquals(3, result);
        calculator = null;
    }
}