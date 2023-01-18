import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    // In this solution, we use a dictionary to store the frequency of each element in the input list, by iterating through the input list and adding the element to the dictionary, if the element is already in the dictionary the value for the key is incremented by one. Then we sort the dictionary by value in descending order and get the first k elements using list slicing.

    // The runtime of this solution is O(nlogn), The space complexity is O(n) where n is the number of elements in the input list.

    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element in the array
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        // Create a PriorityQueue to store the elements based on their frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> frequency.get(b) - frequency.get(a)
        );
        // Add all elements from the HashMap to the PriorityQueue
        for (int num : frequency.keySet()) {
            pq.offer(num);
        }
        // Retrieve the top k frequent elements from the PriorityQueue
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        // Convert List to Array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
