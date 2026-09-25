// Last updated: 9/25/2026, 2:34:02 PM
import java.util.*;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Max-heap comparator: larger numbers come first
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length(); // longer first
            }
            return b.compareTo(a); // lexicographically descending
        });

        // Add all numbers to the heap
        for (String num : nums) {
            pq.offer(num);
        }

        // Remove k-1 largest
        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        // The k-th largest
        return pq.peek();
    }
}
