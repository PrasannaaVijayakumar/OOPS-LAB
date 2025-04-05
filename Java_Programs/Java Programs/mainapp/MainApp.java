// File: mainapp/MainApp.java
package mainapp;

// Import user-defined packages
import mathoperations.Calculator;
import stringoperations.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        // Use mathoperations package
        int sum = Calculator.add(15, 25);
        System.out.println("Sum: " + sum);

        // Use stringoperations package
        String reversed = StringUtils.reverseString("Java");
        System.out.println("Reversed String: " + reversed);
    }
}