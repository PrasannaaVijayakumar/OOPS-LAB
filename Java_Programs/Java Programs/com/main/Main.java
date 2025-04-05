// File: com/main/Main.java
package com.main;

import com.math.utils.Calculator;
import com.string.utils.StringOperations;
import com.exceptions.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        // Test Calculator
        System.out.println("Addition: " + Calculator.add(10, 5));
        
        try {
            System.out.println("Subtraction: " + Calculator.subtract(10, 5));
            System.out.println("Subtraction: " + Calculator.subtract(5, 10)); // Throws exception
        } catch (InvalidInputException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test StringOperations
        System.out.println("Reversed String: " + StringOperations.reverseString("Hello"));
        System.out.println("Vowel Count: " + StringOperations.countVowels("Programming"));
    }
}