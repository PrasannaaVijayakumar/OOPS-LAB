/*Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd. */

public class exception_2{
    public static void main(String[] args) {
      int n = 18;
      trynumber(n);
      n = 7;
      trynumber(n);
    }
  
    public static void trynumber(int n) {
      try {
        checkEvenNumber(n);
        System.out.println(n + " is even.");
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
  
    public static void checkEvenNumber(int number) {
      if (number % 2 != 0) {
        throw new IllegalArgumentException(number + " is odd.");
      }
    }
  }