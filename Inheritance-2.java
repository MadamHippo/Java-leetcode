import java.util.*;

interface MyList{
    void convert(String[] a);
    void replace(int idx);
    ArrayList<String> compact();
}

/*
Write the implementation of the InvalidStringException and the ArrayToList classes
Model strings for cut and paste:
I have added the string: {string} at the index: {index}
I have replaced the string: {string} with a null string
*/

class InvalidStringException extends Exception {

    // constructor (the only Uppercase character - Pascale)
    public InvalidStringException(String s){
        super(s);
    }

}

class ArrayToList implements MyList {
    // instance variable with type arraylist string named arrayToList
    ArrayList<String> arrayToList;


    // constructor - where you initialize instance variables
    public ArrayToList(){
        // initializing arrayToList syntax
        arrayToList = new ArrayList<>();
    }


    // methods (camel cases)
    public void convert(String[] a){
        // for loop
        for (int i = 0; i < a.length; i++){
            arrayToList.add(a[i]);
            System.out.printf("I have added the string: %s at the index: %d %n", a[i], i);
        }
    }

    public void replace(int idx){
        // set returns the value...
        String returnedSet = arrayToList.set(idx, "");
        System.out.printf("I have replaced the string: %s with a null string %n", returnedSet);
    }

    public ArrayList<String> compact(){
        // while loop
        while (arrayToList.remove("")){
            continue;
        }
        return arrayToList;
    }





}



public class Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();



        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }


    }
}
