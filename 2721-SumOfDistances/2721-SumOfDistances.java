// Last updated: 3/24/2026, 11:21:58 AM
class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        
        // Map from number to list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> indices : map.values()) {
            int size = indices.size();
            long[] prefix = new long[size];
            prefix[0] = indices.get(0);
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + indices.get(i);
            }

            for (int i = 0; i < size; i++) {
                int idx = indices.get(i);
                long left = (long)i * indices.get(i) - (i == 0 ? 0 : prefix[i - 1]);
                long right = (prefix[size - 1] - prefix[i]) - (long)(size - 1 - i) * indices.get(i);
                result[idx] = left + right;
            }
        }

        return result;
    }
}
