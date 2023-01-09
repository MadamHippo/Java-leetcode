import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
ItemSeparator is a class which filters a given raw input string of the format "ItemName$$##ItemPrice$$##ItemQuantity", and stores it as these class attributes.
*/

class ItemSeparator {
    String name;
    double price;
    int quantity;

    // constructor
    ItemSeparator(String rawInput){
        // espcae characters because $ is a special character for regular expression. without it we will get array index out of bounds because it will not have split properly.
        String[] input = rawInput.split("\\$\\$##");
        name = input[0];
        price = Double.valueOf(input[1]);
        quantity = Integer.valueOf(input[2]);
    }



    // getter methods
    String getName(){
        return this.name;
    }

    Double getPrice(){
        return this.price;
    }

    Integer getQuantity(){
        return this.quantity;
    }

}
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        ItemSeparator itemData = new ItemSeparator(sub);
        System.out.println("Item Name: " + itemData.getName());
        System.out.println("Item Price: " + itemData.getPrice());
        System.out.println("Item Quantity: " + itemData.getQuantity());
    }
}
