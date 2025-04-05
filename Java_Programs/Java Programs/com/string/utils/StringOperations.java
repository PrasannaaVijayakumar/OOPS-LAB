// File: com/string/utils/StringOperations.java
package com.string.utils;

public class StringOperations {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {
        return (int) str.chars()
                        .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                        .count();
    }
}