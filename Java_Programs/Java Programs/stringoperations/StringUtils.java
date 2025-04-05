// File: stringoperations/StringUtils.java
package stringoperations;

public class StringUtils {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}