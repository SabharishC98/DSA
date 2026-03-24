// Last updated: 3/24/2026, 11:25:34 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0, res = 0;

        for (int num : nums) {
            prefix = ((prefix + num) % k + k) % k;
            res += map.getOrDefault(prefix, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return res;
    }
}
