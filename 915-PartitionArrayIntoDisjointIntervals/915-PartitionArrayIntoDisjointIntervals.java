// Last updated: 9/25/2026, 2:42:12 PM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        lmax[0]=nums[0];
        rmax[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(nums[i],lmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.min(rmax[i+1],nums[i]);
        }
        for(int i=0;i<n-1;i++){
            if(lmax[i]<=rmax[i+1]) return i+1;
        }
        return 0;
    }
}