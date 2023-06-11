import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // create an Object of Scanner class
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    // read input(line of text) from the keyboard
    String name = input.nextLine();
    // prints the name
    System.out.println("My name is " + name);
    // closes the scanner
    input.close();
  } }

/* output: 
Enter your name: Kelvin
My name is Kelvin
*/
