// Part of Java Docs...https://docs.google.com/document/d/1ixgYGfNQ4XN9-dom-clmC-O5TkgJ7e1fbcrMaVhaMpA

public class BinarySearchClass {
   public static void main(String[] args) {
       int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}; // Create an array of integers.
       int searchKey = 11; // Define the value to be searched for.
       int i = BinarySearchClass.binarySearch(list, searchKey); // Call the binarySearch method to find the index of the searchKey.
       System.out.println(searchKey  + " found at index " + i); // Print the result.
   }
   public static int binarySearch(int[] list, int key) {
       int low = 0; // Initialize the lower bound of the search range.
       int high = list.length - 1; // Initialize the upper bound of the search range.
       while (high >= low) { // Start a loop to continue searching until the search range is valid.
           int mid = (low + high) / 2; // Calculate the midpoint of the search range.
           if (key < list[mid]) // Check if the search key is less than the value at the midpoint.
           {
               high = mid - 1; // Update the upper bound to search the left half of the current range.
           }
           else if (key == list[mid]) // Check if the search key is equal to the value at the midpoint.
           {
               return mid; // Return the index of the found element.
           }
           else
           {
               low = mid + 1; // Update the lower bound to search the right half of the current range.
           }
       }
       return -low - 1; // Return a negative value indicating that the search key was not found.
   }
}
