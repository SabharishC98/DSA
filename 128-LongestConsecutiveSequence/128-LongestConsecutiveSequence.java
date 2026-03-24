// Last updated: 3/24/2026, 11:30:27 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> numsSet = new HashSet<>();
        int longest = 1;
        for (int i : nums) {
            numsSet.add(i);
        }

        for (int i : numsSet) {
            if (!(numsSet.contains(i - 1))) {
                int cnt = 1;
                int start = i;
                while(numsSet.contains(start + 1)) {
                    cnt+=1;
                    start+=1;
                }
                longest = Math.max(cnt,longest);
            }
        }
        return longest;
    }
}