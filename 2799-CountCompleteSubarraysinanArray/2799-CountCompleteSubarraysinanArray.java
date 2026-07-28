// Last updated: 7/28/2026, 4:03:15 PM
1class Solution {
2    public int countCompleteSubarrays(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(int i:nums) set.add(i);
5        int c=0;
6        for(int i=0;i<nums.length;i++){
7            HashMap<Integer,Integer> map=new HashMap<>();
8            for(int j=i;j<nums.length;j++){
9                map.put(nums[j],0);
10                if(map.size()==set.size()) c++;
11            }
12        }
13        return c;
14    }
15}