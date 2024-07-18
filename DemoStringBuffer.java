package com.apj1;

public class DemoStringBuffer {
    public static void main(String[] args) {
        // Creating a StringBuffer object with the value "Anudip"
        StringBuffer strbuff = new StringBuffer("Anudip");
        System.out.println(strbuff); // Printing the initial value

        // Appending " Foundation" to the StringBuffer
        strbuff.append(" Foundation");
        System.out.println(strbuff); // Printing the updated value

        // Reversing the StringBuffer
        System.out.println(strbuff.reverse()); // Printing the reversed value

        // Getting the character at index 3
        System.out.println(strbuff.charAt(3));

        // Finding the index of character 'c'
        System.out.println(strbuff.indexOf("c"));

        // Getting the capacity of the StringBuffer
        System.out.println(strbuff.capacity());

        // Creating another StringBuffer object with a longer string
        StringBuffer strb = new StringBuffer("Advance program on java full stack using angular");

        // Printing the default capacity of the StringBuffer
        System.out.println(strb.capacity());

        // Deleting the character at index 19
        System.out.println(strb.deleteCharAt(19));

        // Getting the ASCII value of the character at index 1
        System.out.println(strb.codePointAt(1));

        // Comparing the two StringBuffers
        System.out.println(strb.compareTo(strbuff)); // Returns a negative value
        System.out.println(strbuff.compareTo(strb)); // Returns a positive value

        // Converting the StringBuffer to a String
        String s = strbuff.toString();
        System.out.println(s); // Printing the converted string
    }
}
