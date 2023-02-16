// Part of Java Docs....https://docs.google.com/document/d/1ixgYGfNQ4XN9-dom-clmC-O5TkgJ7e1fbcrMaVhaMpA

public class BinarySearchClass {
   public static void main(String[] args) {
       int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
       int searchKey = 11;
       int i = BinarySearchClass.binarySearch(list, searchKey); // Returns 0
       System.out.println(searchKey  + " found at index " + i);
   }
   public static int binarySearch(int[] list, int key) {
       int low = 0;
       int high = list.length - 1;
       while (high >= low) {
           int mid = (low + high) / 2;
           if (key < list[mid])
           {
               high = mid - 1;
           }
           else if (key == list[mid])
           {
               return mid;
           }
           else
           {
               low = mid + 1;
           }
       }
       return -low - 1; // Now high < low
   }
}
