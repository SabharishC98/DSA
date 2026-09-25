// Last updated: 9/25/2026, 2:28:55 PM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int c=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],0);
                if(map.size()==set.size()) c++;
            }
        }
        return c;
    }
}