package com.perscholas.java_basics.practiceproblems;

// failed this question, couldn't fully do it with two for loops...will analyze this code below for help

/*
This is a Java Program to Print Diamond Pattern.
Enter the number of rows as an input. Now we use for loops to print two equiateral triangles facing away from each other but with same base.
*/

import java.util.Scanner;
public class PracticeQuestion4
{
    public static void main(String args[])
    {
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
