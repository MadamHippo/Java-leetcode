import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Getter and Setter examples;

// Implement the library structure using the following class.

class Library{
    
    // Attributes aka fields
    private int number_of_books;
    private String name;
    private Map<String, Integer> bookGenres;
    
    
    // getter 
    public int getNumber_of_books(){
        return this.number_of_books;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Map<String, Integer> getBookGenres(){
        return this.bookGenres;
    }
    
    // setter
    public void setNumber_of_books(int number_of_books){
        this.number_of_books = number_of_books;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBookGenres(Map<String, Integer> bookGenres){
        this.bookGenres = bookGenres;
    }
}
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        int n = Integer.parseInt(sub);
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            Library library = new Library();
            library.setName(name);
            System.out.println("Library with name : " + library.getName() + " is started");


            Integer numberOfBooks = Integer.parseInt(sc.nextLine());
            library.setNumber_of_books(numberOfBooks);
            System.out.println("It contains " + library.getNumber_of_books() + " books");

            Integer bookGenresCount = Integer.parseInt(sc.nextLine());

            Map<String, Integer> bookGenresMap = new LinkedHashMap<>();
            System.out.println("It contains books with following genres :");
            for(int j=0; j<bookGenresCount; j++){
                String[] bookGenres = sc.nextLine().split(" ");
                bookGenresMap.put(bookGenres[0], Integer.parseInt(bookGenres[1]));
            }
            library.setBookGenres(bookGenresMap);
            Map<String, Integer> temp = library.getBookGenres();
            for(Map.Entry t:temp.entrySet()){
                System.out.println(t.getKey() +" "+ t.getValue());
            }

        }
    }
}
