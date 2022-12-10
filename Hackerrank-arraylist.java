import java.io.*;
import java.util.*;

///////////////////////////////////////////////// Problem link: https://www.hackerrank.com/challenges/java-arraylist/problem //////////////////////////////////////////////

public class Solution {

    public static void main(String[] args) {
        
        // user input
        Scanner scan = new Scanner(System.in);
        
        // get first line int...
        int n= scan.nextInt();
        
        // create empty list call arr
        List<List<Integer>> arr = new ArrayList<>();
        
        // while theres still n left
        while(n>0){
            
            // ask for user input
            int a = scan.nextInt();
            
            // store that user input again on the nested list
            List<Integer> list1 = new ArrayList<>();
            
            // nested for loop to go until a ends
            for(int i=0;i<a;i++){
                
                // add the scanned a into list1
                list1.add(scan.nextInt());
            }
            // get list to hold that first line int...
            arr.add(list1);
            
            // decrement n so while loop won't be infinite
            n--;
        }
        
        
        // q is each query
        int q= scan.nextInt();
        
        // for loop to iterate throu all q
        for(int i=0;i<q;i++){
            
            // get position x for query
            // get position y for query
            int x=scan.nextInt();
            int y=scan.nextInt();
            
            
            try{
                // as long as x and y isn't none print out the values in arr from the thingy we made above..
             if(arr.get(x-1).get(y-1)!=null) 
             System.out.println(arr.get(x-1).get(y-1));   
            }
            
            // else throw an error
            catch(Exception e){
                System.out.println("ERROR!");
            }
          
        }
        scan.close();
    }
}
