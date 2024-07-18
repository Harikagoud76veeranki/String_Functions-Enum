package com.apjfsa;

// Demonstrating different functions of arrays
public class StringFunctions {
    public static void main(String[] args) {
        // Initializing a string variable
        String name = "Anudip";
        System.out.println(name); // Printing the initial string value

        // Reassigning the string variable
        name = "Anudip Foundation";
        System.out.println(name); // Printing the updated string value

        // Initializing another string variable
        String name1 = "anudip foundation";
        System.out.println("Concatenation both Strings: " + (name.concat(" Foundation"))); // Combining two strings using concat()

        // Comparing strings using compareTo() method
        System.out.println("Calculating Unicode of Strings: " + name.compareTo(name1));

        // Checking if a string contains another string using contains() method
        System.out.println("Comparing both strings: " + name.contains(name1));

        // Comparing strings ignoring case using compareToIgnoreCase() method
        System.out.println("Comparing both by ignoring case: " + name.compareToIgnoreCase(name1));

        // Checking if two strings are equal ignoring case using equalsIgnoreCase() method
        System.out.println("Comparing By ignore case and return boolean value: " + name.equalsIgnoreCase(name1));

        // Converting a string to lower case using toLowerCase() method
        System.out.println("To Lower Case: " + name.toLowerCase());

        // Converting a string to upper case using toUpperCase() method
        System.out.println("To Upper Case: " + name.toUpperCase());

        // Getting the character at a specific index using charAt() method
        System.out.println("Character at given index number: " + name.charAt(15));

        // Finding the index of a specific character using indexOf() method
        System.out.println(name.indexOf('n')); // Finding the first occurrence of 'n'

        // Finding the last index of a specific character using lastIndexOf() method
        System.out.println(name.lastIndexOf('n')); // Finding the last occurrence of 'n'

        // Finding the index of a specific character starting from a specified index using indexOf() method
        System.out.println(name.indexOf('n', 2)); // Finding 'n' starting from index 2

        // Getting the length of a string using length() method
        System.out.println("String Length: " + name.length());

        // Checking if a character is present in the string using indexOf() method
        System.out.println(name.indexOf('c')); // Character 'c' is not present

        // Checking if two strings are equal ignoring case using equalsIgnoreCase() method
        System.out.println(name.equalsIgnoreCase(name1));
    }
}
