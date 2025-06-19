package com.java.test;

public class CalculatorService {

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    public static double sumAnyNumbers(int... numbers) {
        int s = 0;
        for (int n : numbers) {
            s += n;
        }
        return s;
    }
}

