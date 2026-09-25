// Last updated: 9/25/2026, 2:26:53 PM
class Solution {
    public long findMaximumScore(List<Integer> nums) {
        if(nums.size()==1) return 0;
        long ans=0;
        int i=0,j=1;
        while(j<nums.size()-1){
            if(nums.get(j)>=nums.get(i)){
                ans+=(j-i)*(long)nums.get(i);
                i=j;
            }
            j++;
        }
        ans+=(j-i)*(long)nums.get(i);
        return ans;
    }
}