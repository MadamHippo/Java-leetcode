import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
** Abstract and Extend class practice!!
Nutrition in food can be broken down in proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge.

astract class Food having the following properties:
 ~double proteins
 ~double fats
 ~double carbs
 ~double tastyScore
 ~void getMacroNutrients[Abstract Method]

*/

// create an abstract class
abstract class Food {
    
    // fields
    double proteins;
    double fats;
    double carbs;
    double tastyScore;
    
    // abstract method
    abstract void getMacroNutrients();
    
    /* for example, this is regular method:
    // void getMacroNutrients(){
        System.out.println("This is a regular method.")
    }
    */
    
}

class Egg extends Food {
    
    int tastyScore = 7;
    String type = "non-vegetarian";
    
    
    // constructor to initalize the attributes    
    Egg(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    
    // method:
    public void getMacroNutrients(){
        System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }
}

class Bread extends Food {
    
    int tastyScore = 8;
    String type = "vegetarian";
    
    // constructor to initalize the attributes
    Bread(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    
    // method:
    public void getMacroNutrients(){
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            String name = sc.nextLine();

            if(name.equals("Bread")) {
                Bread breadObj = new Bread(4, 1.1, 13.8);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        breadObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + breadObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Bread is " + breadObj.type);
                    }
                }
            } else if (name.equals("Egg")) {
                Egg eggObj = new Egg(6.3, 5.3, 0.6);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        eggObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + eggObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Egg is " + eggObj.type);
                    }
                }
            }
        }
    }
}
