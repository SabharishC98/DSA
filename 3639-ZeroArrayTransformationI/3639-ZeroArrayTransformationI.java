// Last updated: 3/24/2026, 11:20:58 AM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int cs=0;
        int dif[]=new int[nums.length];
        for(int i=0;i<queries.length;i++){
            dif[queries[i][0]]-=1;
            if(queries[i][1]<nums.length-1)
            dif[queries[i][1]+1]+=1;
        }
        for(int i=0;i<nums.length;i++){ 
            cs+=dif[i]; 
            if(nums[i]+cs>0) return false;
        }
        return true;
    }
}