package com.apj1;

public class DemoStringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object with the value "Hello World"
        StringBuilder strb = new StringBuilder("Hello World");

        // Printing the initial value
        System.out.println(strb);

        // Getting the length of the string
        System.out.println(strb.length()); // Printing the length

        // Finding the last index of the character 'o'
        System.out.println(strb.lastIndexOf("o")); // Printing the last index

        // Finding the index of the character 'o'
        System.out.println(strb.indexOf("o")); // Printing the index

        // Converting the StringBuilder to a String
        String s = strb.toString();

        // Printing the converted string
        System.out.println(s);

        // Creating a new StringBuffer object using the StringBuilder
        StringBuffer strb1 = new StringBuffer(strb);

        // Printing the new StringBuffer object
        System.out.println(strb1);
    }
}
