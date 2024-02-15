/* Implement your classes here. Do not use access modifiers in your class declarations:

SHAPE CLASSES - In this challenge you will write 3 shape classes that return a calculated area for each shape.

Implement the following classes and methods: A circle class with...
~Constructor
~getArea() method

*/


import java.io.*;
import java.util.*;

class Circle {

    float radius;

    // constructor
    Circle(float radius){
        this.radius = radius;
    }

    // method
    public int getArea(){
        return (int)Math.ceil(3.14159265 * radius * radius);
    }

}



class Rectangle {

    float width;
    float height;

    // constructor
    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    // method
    public int getArea() {
        return (int)Math.ceil(width*height);
    }
}



class Square {

    float width;

    // constructor
    Square(float width) {
        this.width = width;
    }

    public int getArea() {
        return (int)Math.ceil(width * width);
    }
}

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        float radius = Float.parseFloat(sc.nextLine());
        Circle c1 = new Circle(radius);
        System.out.println(c1.getArea());

        float width = sc.nextFloat();
        float height = sc.nextFloat();
        Rectangle r1 = new Rectangle(width, height);
        System.out.println(r1.getArea());
        sc.nextLine();

        radius = Float.parseFloat(sc.nextLine());
        Circle c2 = new Circle(radius);
        System.out.println(c2.getArea());

        width = Float.parseFloat(sc.nextLine());
        Square s1 = new Square(width);
        System.out.println(s1.getArea());

        width = sc.nextFloat();
        height = sc.nextFloat();
        Rectangle r2 = new Rectangle(width, height);
        System.out.println(r2.getArea());

        sc.close();
    }
}
