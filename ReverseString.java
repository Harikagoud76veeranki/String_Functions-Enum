package com.apjfsa;

// Demonstrating program to reverse a string
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a string to reverse
        System.out.println("Enter a string to reverse: ");

        // Reading the input string
        String str = sc.nextLine();

        // Converting the string to a character array
        char[] charArray = str.toCharArray();

        // Using a for loop to iterate from start and end of the given string
        for (int first = 0, last = charArray.length - 1; first < last; first++, last--) {
            // Swapping characters at the start and end positions
            char temp = charArray[first];
            charArray[first] = charArray[last];
            charArray[last] = temp;
        }

        // Creating a new string from the modified character array
        String rs = new String(charArray);

        // Printing the reversed string
        System.out.println("Reversed string is: " + rs);
    }
}
