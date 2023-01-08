import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface OnlineAccount {
    int basePrice = 120;
    int regularMoviePrice = 45;
    int exclusiveMoviePrice = 80;
}

/*
Given an interface named "OnlineAccount" that models the accont of popular online video streaming plaforms, perform the operations listed below. The interface "OnlineAccount" consists of the basePrice, regular MoviePrice, and exclusiveMoviePrice.

You need to implement an incomplete class named "Account" which implements the "OnlineAccount" interface as well as the "Comparable<Account>" interface.

It's about overriding and the Java compareTo object class...

The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.

*/

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfRegularMovies and noOfExclusiveMovies.
    Account(String name, int numRegularMovies, int numExclusiveMovies){
        this.ownerName = name;
        this.noOfRegularMovies = numRegularMovies;
        this.noOfExclusiveMovies = numExclusiveMovies;
    }

    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice;
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    @Override
    // overriding the built in compareTo that all java objects have...
    // otherObject = 
    public int compareTo(Account otherObject){
        if (this.monthlyCost() > otherObject.monthlyCost()){
            return 1;
        } else {
            return -1;
        }
    }


    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + this.monthlyCost() + " USD.";
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();

        int t = Integer.parseInt(sub);

        ArrayList<Account> list = new ArrayList<Account>();

        for(int i=0; i<t; i++) {
            String[] input = sc.nextLine().split(" ");
            list.add(new Account(input[0],
                    Integer.parseInt(input[1]),
                    Integer.parseInt(input[2])));
        }

        Collections.sort(list);

        System.out.println("Most valuable account details:");
        System.out.println(list.get(list.size() - 1));
    }
}
