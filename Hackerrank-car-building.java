import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Car{
    
    // fields
    int no_of_tires = 4;
    String bodyType = "Plastic";  
    
    // constructor is using built in (invisible)
    
    
    
    // method
    public void reverseGear(){
        System.out.println("Reverse Gear is Applied...");
    }

    // method
    public void switchOnHeadlights(){
        System.out.println("Headlights turned on...");
    }  
}

class BMW extends Car{
    
    // fields
    String modelName = "X3";
    
    
    // method
    public void topSpeed(){
        System.out.println("TopSpeed of BMW is 200 kmph");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            BMW b = new BMW();
            if(name.equals("reverseGear")){
                b.reverseGear();
            }
            if(name.equals("switchOnHeadlights")){
                b.switchOnHeadlights();
            }
            if(name.equals("topSpeed")){
                b.topSpeed();
            }
        }
    }
}




/*

!!!!!!!!!!!!!!! #20 Car Fueling

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

   
    * public void topSpeed() prints "Top Speed of the vehicle is 100 kmph" with a newline.
    * public void fuelType() prints "Car fuel type is Petrol" with a new line.
    * public void fuelType() prints  "SUV fuel type is Diesel" with a new line.
    

class Car{
    
    // An example of overriding;
    
    public void topSpeed(){
        System.out.println("Top Speed of the vehicle is 100 kmph");
    }
    
    public void fuelType(){
        System.out.println("Car fuel type is Petrol");
    }
}

class SUV extends Car{
    
    @Override
    public void fuelType(){
        System.out.println("SUV fuel type is Diesel");
    }
}

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++) {
            String input = sc.nextLine();
            Car suv = new SUV();
            if(input.equals("topSpeed")){
                suv.topSpeed();
            }
            if(input.equals("fuelType")){
                suv.fuelType();
            }
            Car car = new Car();
            if(input.equals("topSpeed")){
                car.topSpeed();
            }
            if(input.equals("fuelType")){
                car.fuelType();
            }
        }
    }
}



!!!!!!!!!!!! 21. Car Engine

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


* public void printTopSpeed() prints "Top speed of the vehicle is 100 kmph"
* public void printTopSpeed(int topSpeed) prints "Top speed of the vehicle is " + topSpeed + " kmph"
* public void printTopSpeed(String vehicleName, int topSpeed) prints "Top speed of the vehicle " + vehicleName +" is " + topSpeed + " kmph" 

class Car{
    
    // example of method overloading 
    
    public void printTopSpeed(){
        System.out.println("Top speed of the vehicle is 100 kmph");
    }
    
    public void printTopSpeed(int topSpeed){
        System.out.println("Top speed of the vehicle is " + topSpeed + " kmph");
    }
    
    public void printTopSpeed(String vehicleName, int topSpeed){
        System.out.println("Top speed of the vehicle " + vehicleName + " is " + topSpeed + " kmph");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int n = Integer.parseInt(sub);
        for(int i=0;i<n;i++) {
            String[] input = sc.nextLine().split(" ");
            Car c = new Car();
            if(input.length ==1){
                c.printTopSpeed();
            }
            if(input.length ==2){
                c.printTopSpeed(Integer.parseInt(input[1]));
            }
            if(input.length ==3){
                c.printTopSpeed(input[1], Integer.parseInt(input[2]));
            }
        }
    }
}


*/
