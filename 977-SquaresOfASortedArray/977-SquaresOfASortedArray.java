// Last updated: 9/25/2026, 2:41:22 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int l=0,r=n-1;
        int pos=n-1;
        while(l<=r){
            int lsq=nums[l]*nums[l];
            int rsq=nums[r]*nums[r];
            if(lsq>rsq){
                res[pos--]=lsq;
                l++;
            }
            else{
                res[pos--]=rsq;
                r--;
            }
        }
        return res;
    }
}