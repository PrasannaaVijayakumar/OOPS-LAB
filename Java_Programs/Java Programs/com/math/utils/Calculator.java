// File: com/math/utils/Calculator.java
package com.math.utils;

import com.exceptions.InvalidInputException;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) throws InvalidInputException {
        if (a < b) {
            throw new InvalidInputException("Result cannot be negative!");
        }
        return a - b;
    }
}