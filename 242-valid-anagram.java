/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

*/

class Solution {
    public boolean isAnagram(String s, String t) {

        // So in first solution we are just checking if their length equal then we will process ahead if not we return false and exit from there
        // O(NlogN) and space complexity-O(N)
        if (s.length()!=t.length()){
            return false;
        }

        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        
        // then we made two char array, sorted them, and compared them if they are equal
        Arrays.sort(char_s);
        Arrays.sort(char_t);

        s = new String(char_s);
        t = new String(char_t);

        // (s==t) this will check references which are not equal. we use built in method .equals() to compare string if their content is equal
        return (s.equals(t));
        
    }
}


/* the optimized solution is....use hashmap 

Time complexity -O(N) and space complexity-O(N) this is efficient as we are not using limited memory now array of 256 space only which we can consider low space

So in first solution we are just checking if their length equal then we will process ahead if not we return false and exit from there

For every character we are maintain they frequency if they exit in both of string same no. of time this will make every Array element position to be zero


class Solution {
    static final int CHAR=256;
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] count=new int[CHAR];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
            if(count[i]!=0)
                return false;
        return true;
    }
}

*/
