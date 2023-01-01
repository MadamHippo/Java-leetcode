import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

/*
 Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
 
 Sam wants to make a calculator which can return the sum of 2 integers...
 
 */

class Adder extends Calculator{
    
    // this is a method..? is it the default method? Wheres the access mod? Or static? or void?
    int add(int a, int b){
        return a+b;
    }
}
