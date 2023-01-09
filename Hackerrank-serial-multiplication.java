import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SerialMultiplier {
    int first = 1;
    int second = 1;
    int third = 1;
    int fourth = 1;
    int fifth = 1;

    int result;

    // constructors
    SerialMultiplier(int first) {
        this.first = first;
        result = first;
    }

    SerialMultiplier(int first, int second) {
        this.first = first;
        this.second = second;
        result = first * second;
    }

    SerialMultiplier(int first,int second,int third) {
        this.first = first;
        this.second = second;
        this.third = third;
        result = first * second * third;
    }

    SerialMultiplier(int first,int second,int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        result = first * second * third * fourth;
    }

    SerialMultiplier(int first,int second,int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        result = first * second * third * fourth * fifth;
    }

    // toString, toHashCode, equals are the 3 main common things defined in the base of the Java object class. it is common to override these...
// Overriding toString to be able to print out the object in a readable way when it is later read from the file
    @Override
    public String toString() {
        // you cannot cast -- Integer and String are different types. String and Integer are not in the same Object hierarchy.
        // return (String)result;
        
        
        
        /* To convert an integer to string use:

        String.valueOf(integer), or Integer.toString(integer) for primitive,

        or

        Integer.toString() for the object.
        */


        return Integer.toString(result);
    }

}

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");;
        int first=1, second=1, third=1, fourth=1, fifth=1;
        first = Integer.parseInt(input[0]);
        if(n > 1) {
            second = Integer.parseInt(input[1]);
            if(n >= 3) {
                third = Integer.parseInt(input[2]);
                if(n >= 4) {
                    fourth = Integer.parseInt(input[3]);
                    if(n == 5) {
                        fifth = Integer.parseInt(input[4]);
                    }
                }
            }
        }

        SerialMultiplier result;

        switch(n) {
            case 1:
                result = new SerialMultiplier(first);
                System.out.println(result);
                break;
            case 2:
                result = new SerialMultiplier(first,second);
                System.out.println(result);
                break;
            case 3:
                result = new SerialMultiplier(first,second,third);
                System.out.println(result);
                break;
            case 4:
                result = new SerialMultiplier(first,second,third,fourth);
                System.out.println(result);
                break;
            case 5:
                result = new SerialMultiplier(first,second,third,fourth,fifth);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Inputs");
        }
    }
}
