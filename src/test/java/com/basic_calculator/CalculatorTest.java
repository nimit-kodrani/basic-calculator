package com.basic_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Basic_Calculator calculator;

    @BeforeEach
    void setUp() { // Create object before compilation
        calculator = new Basic_Calculator();
    }

    /*
     * testCalc() test method
     */
    @Test
    void testCalc() {
        double first = 3;
        String second = "5";
        double third = 12;
        String fourth = "4";

        try {
            Assertions.assertEquals(8, calculator.calc(first, second, '+'));
            Assertions.assertEquals(-2, calculator.calc(first, second, '-'));
            Assertions.assertEquals(15, calculator.calc(first, second, '*'));
            Assertions.assertEquals(3, calculator.calc(third, fourth, '/'));
            Assertions.assertEquals(2, calculator.calc(fourth, '√');
            Assertions.assertEquals(81, calculator.calc(first, second, '^'));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
