package com.apjfsa;

// Demonstrating enum for Department
enum Department {
    Accounts, // department for accounts
    Develops, // department for development
    Testing, // department for testing
    HR // department for human resources
}

public class DemoEnum {
    public static void main(String[] args) {
        // Assigning the Testing department to variable d
        Department d = Department.Testing;

        // Assigning the Accounts department to variable d1
        Department d1 = Department.Accounts;

        // Printing the value of d
        System.out.println(d);

        // Comparing d with d1 departments
        System.out.println(d.compareTo(d1));

        // Checking if d is equal to d1
        System.out.println(d.equals(d1));

        // Getting the ordinal of d (position in the enum declaration)
        System.out.println(d.ordinal());

        // Getting the ordinal of d1
        System.out.println(d1.ordinal());

        // Getting the hash code of d
        System.out.println(d.hashCode());

        // Getting the hash code of d1
        System.out.println(d1.hashCode());
    }
}
