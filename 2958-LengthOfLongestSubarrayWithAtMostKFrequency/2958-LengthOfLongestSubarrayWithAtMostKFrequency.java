// Last updated: 9/25/2026, 2:28:14 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int i=0,j=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(i<nums.length && map.get(nums[j])>k){
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}