// Last updated: 6/14/2026, 9:15:45 AM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        long[] sorted = Arrays.stream(nums)
4                              .distinct()
5                              .sorted()
6                              .asLongStream()
7                              .toArray();
8        
9        long sum=0;
10        long next=1; 
11        
12        for (long num : sorted) {
13            if (k <= 0) break;
14            
15            if (num > next) {
16                // Gap exists: [next, num-1] are all available
17                long available = Math.min(num - next, k);
18                // Sum of arithmetic sequence: next + (next+1) + ... + (next+available-1)
19                sum += (next + next + available - 1) * available / 2;
20                k -= available;
21            }
22            // Move past this number (it's taken)
23            next = Math.max(next, num + 1);
24        }
25        
26        // Still need more numbers after all of nums is exhausted
27        if (k > 0) {
28            // Add next, next+1, ..., next+k-1
29            sum += (next + next + k - 1) * (long) k / 2;
30        }
31        
32        return sum;
33    }
34}