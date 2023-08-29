package com.perscholas.java_basics.practiceproblems;

// failed this question, couldn't fully do it with two for loops...will analyze this code below for help

/*
This is a Java Program to Print Diamond Pattern.
Enter the number of rows as an input. Now we use for loops to print two equiateral triangles facing away from each other but with same base.
*/

import java.util.Scanner;

public class PracticeQuestion4 {
    public static void main(String args[]) {
        int n, i, j, space = 1;
        
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        
        // Create a Scanner object to read input from the user
        Scanner s = new Scanner(System.in);
        
        // Read the number of rows provided by the user
        n = s.nextInt();
        
        // Calculate the initial number of spaces
        space = n - 1;
        
        // Loop to print the upper half of the pattern
        for (j = 1; j <= n; j++) {
            // Print spaces before the asterisks
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            
            // Decrease the number of spaces for the next row
            space--;
            
            // Print asterisks in a pyramid pattern
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            
            // Move to the next line after printing a row
            System.out.println("");
        }
        
        // Reset the value of the space variable
        space = 1;
        
        // Loop to print the lower half of the pattern
        for (j = 1; j <= n - 1; j++) {
            // Print spaces before the asterisks
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            
            // Increase the number of spaces for the next row
            space++;
            
            // Print asterisks in an inverted pyramid pattern
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            
            // Move to the next line after printing a row
            System.out.println("");
        }
    }
}

