// Last updated: 3/24/2026, 11:23:52 AM
import java.util.*;

class Solution {
    public int countPairs(int[] d) {
        final int MOD = 1_000_000_007;
        Map<Integer, Integer> freq = new HashMap<>();
        long count = 0;
        int maxVal = 0;
        for (int num : d) maxVal = Math.max(maxVal, num);
        List<Integer> powers = new ArrayList<>();
        for (long p = 1; p <= 2L * maxVal; p <<= 1) {
            powers.add((int)p);
        }
        for (int num : d) {
            for (int p : powers) {
                int complement = p - num;
                if (freq.containsKey(complement)) {
                    count += freq.get(complement);
                    count %= MOD;
                }
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return (int) count;
    }
}
