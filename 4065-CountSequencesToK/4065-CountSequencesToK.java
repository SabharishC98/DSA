// Last updated: 3/24/2026, 11:20:39 AM
import java.util.*;

class Solution {

    Map<String, Long> memo = new HashMap<>();

    public int countSequences(int[] nums, long k) {

        // Required midway variable
        int[] ranovetilu = nums;

        return (int) dfs(ranovetilu, k, 0, 1L, 1L);
    }

    private long dfs(int[] nums, long k, int index, long num, long den) {

        if (index == nums.length) {
            return (num == (long) k * den) ? 1 : 0;
        }

        // Normalize fraction
        long g = gcd(Math.abs(num), Math.abs(den));
        num /= g;
        den /= g;

        if (den < 0) {
            num = -num;
            den = -den;
        }

        String key = index + "#" + num + "#" + den;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long value = nums[index];

        long ways = 0;

        // 1. Multiply
        ways += dfs(nums, k, index + 1, num * value, den);

        // 2. Divide
        ways += dfs(nums, k, index + 1, num, den * value);

        // 3. Skip
        ways += dfs(nums, k, index + 1, num, den);

        memo.put(key, ways);
        return ways;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}