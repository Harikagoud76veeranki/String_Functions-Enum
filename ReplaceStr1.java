package com.apjfsa;

// Demonstrating String replacing function to hide all characters except the last 4
import java.util.Scanner;

public class ReplaceStr1 {
    // Method to replace the characters with 'x' except the last 4
    String ReplaceStr(String s) {
        // Converting the string to a character array
        char arr[] = new char[s.length()];
        arr = s.toCharArray();

        // Loop to replace characters with 'x' except the last 4
        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = 'x';
        }

        // Creating a new string from the modified character array
        String str1 = new String(arr);

        // Returning the modified string
        return str1;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter their mobile number
        System.out.println("Enter your mobile number:");

        // Reading the input string
        String str = sc.nextLine();

        // Creating an object of the ReplaceStr1 class
        ReplaceStr1 rp = new ReplaceStr1();

        // Calling the ReplaceStr method to replace the characters
        System.out.println(rp.ReplaceStr(str));
    }
}
