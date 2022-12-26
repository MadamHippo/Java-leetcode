class Result {

    /*
     * Complete the 'lastLetters' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    public static String lastLetters(String word) {
    // Write your code here

    
    char last = word.charAt(word.length()-1);
    char secondLast = word.charAt(word.length()-2);
    
    // " " forces to switch to string; implicit casting.
    String newString = last + " " + secondLast;
        
    return newString;
    
    }
}


/*
~ USING Character.toString() instead of implicitly casting with " "

class Result {


    public static String lastLetters(String word) {
    // Write your code here
    
    char lastWord = word.charAt(word.length()-1);
    char secondLastWord = word.charAt(word.length()-2);
    
   
    1. Using concatenation of strings
    2. Using toString() method of Character class

    
    String last = Character.toString(lastWord);
    String secondLast = Character.toString(secondLastWord);
    
    
    return last + " " + secondLast;
    }
}
*/
