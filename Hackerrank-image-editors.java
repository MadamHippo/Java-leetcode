import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*

Create the Shape class here
 
Most image editors can retain the properties of a drawn shape. In this challenge, implement the Shape class per the following following constructor and methods:

*/

class Shape {

    String type;
    String color;

    // constructor 
    Shape(String type, String color){
        this.type = type;
        this.color = color;
    }

    // getter method 
    String getType(){
        return type;
    }

    // setter method
    void setType(String type){
        this.type = type;
    }

    // getter method
    String getColor(){
        return this.color;

    }

    // setter method
    void setColor(String color){
        this.color = color;
    }

    // method
    Shape cloneShape(){
        // to clone, i create new object with same parameter requirements and just return it.
        Shape newShape = new Shape(type, color);
        return newShape;
    }
}

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        int numberOfShapes = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfShapes-- > 0) {
            String[] shape = INPUT_READER.nextLine().split(" ");
            shapes.add(new Shape(shape[0], shape[1]));
        }

        int numberOfOperations = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfOperations-- > 0) {
            String[] operation = INPUT_READER.nextLine().split(" ");
            Shape shape = shapes.get(Integer.parseInt(operation[1]) - 1);

            if (operation[0].equals("CS")) {
                Shape clonedShape = shape.cloneShape();

                if (clonedShape == shape) {
                    shapes.add(new Shape("Bad-type", "No-color"));
                }

                shapes.add(clonedShape);
            } else if (operation[0].equals("UT")) {
                shape.setType(operation[2]);
            } else if (operation[0].equals("UC")) {
                shape.setColor(operation[2]);
            }
        }

        shapes.forEach((shape) -> {
            System.out.println(shape.getType() + " " + shape.getColor());
        });
    }
}
