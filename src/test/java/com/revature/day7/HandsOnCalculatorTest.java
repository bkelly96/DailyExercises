package com.revature.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandsOnCalculatorTest {

    @Test
    void addAndTestEqual() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator.add(5,7);
        assertEquals(12,result);
        calculator = null;

    }

    @Test
    void addAndTestNotEquals(){
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator. add(5,7);
        assertNotEquals(15, result);
    }

    @Test
    void subtractAndTestEquals() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator.sub(10,3);
        assertEquals(7, result);
        calculator = null;
    }

    @Test
    void subtractAndTestNotEquals(){
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator.sub(10,3);
        assertNotEquals(3, result);
        calculator = null;
    }

    @Test
    void divAndTestEqual() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        double result = calculator.div(10,2);
        assertEquals(5, result);
        calculator = null;

    }

    @Test
    void divAndTestNotEqual() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        double result = calculator.div(10,3);
        assertNotEquals(8, result);
        calculator = null;
    }


    @Test
    void multAndTestEqual() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator.mult(10,3);
        assertEquals(30, result);
        calculator = null;
    }

    @Test
    void multAndTestNotEqual() {
        HandsOnCalculator calculator = new HandsOnCalculator();
        int result = calculator.mult(10,3);
        assertNotEquals(3, result);
        calculator = null;
    }
}