// Last updated: 3/24/2026, 11:21:56 AM
class Solution {
    public int matrixSum(int[][] nums) {
        int ans=0;
        for(int[] i:nums) Arrays.sort(i);
        for(int i=nums[0].length-1;i>=0;i--){
            int max=nums[0][i];
            for(int j=1;j<nums.length;j++){
                max=Math.max(max,nums[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}