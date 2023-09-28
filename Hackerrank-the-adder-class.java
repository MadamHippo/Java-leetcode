import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

/*
 Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
 
 Sam wants to make a calculator which can return the sum of 2 integers...

 https://foxstack.blogspot.com/2022/05/the-adder-class-java-basic.html
 
 */

class Adder extends Calculator{
    
    // this is a method..? is it the default method? Wheres the access mod? Or static? or void?
    int add(int a, int b){
        return a+b;
    }
}
