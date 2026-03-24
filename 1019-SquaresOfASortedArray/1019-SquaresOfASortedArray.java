// Last updated: 3/24/2026, 11:25:33 AM
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