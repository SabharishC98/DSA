// Last updated: 3/24/2026, 11:31:58 AM
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int i=0,j=0,c=0;
        while(j<n-1){
            int max=-1;
            for(int k=i;k<=j;k++){
                max=Math.max(max,k+nums[k]);
            }
            c++;
            i=j+1;
            j=max;
        }
        return c;
    }
}