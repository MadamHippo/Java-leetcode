/*
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
        
    try{
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        try{
            System.out.println(x/y);

        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    
    catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
    }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
}
