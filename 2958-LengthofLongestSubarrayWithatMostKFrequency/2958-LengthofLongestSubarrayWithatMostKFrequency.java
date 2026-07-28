// Last updated: 7/28/2026, 2:53:08 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int max=0;
4        int i=0,j=0;
5        Map<Integer,Integer> map=new HashMap<>();
6        while(j<nums.length){
7            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
8            while(i<nums.length && map.get(nums[j])>k){
9                map.put(nums[i],map.get(nums[i])-1);
10                i++;
11            }
12            max=Math.max(max,j-i+1);
13            j++;
14        }
15        return max;
16    }
17}