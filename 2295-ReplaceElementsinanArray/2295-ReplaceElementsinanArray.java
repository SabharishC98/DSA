// Last updated: 6/13/2026, 2:03:59 PM
1class Solution {
2    public int[] arrayChange(int[] nums, int[][] operations) {
3        Map<Integer,Integer> index=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            index.put(nums[i],i);
6        }
7        for(int[] i:operations){
8            int in=index.get(i[0]);
9            nums[in]=i[1];
10            index.remove(i[0]);
11            index.put(i[1],in);
12        }
13        return nums;
14    }
15}