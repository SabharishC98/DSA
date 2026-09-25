// Last updated: 9/25/2026, 2:26:31 PM
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