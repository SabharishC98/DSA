// Last updated: 3/24/2026, 11:26:54 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=1;i<nums.length-k+1;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            if(sum>max) max=sum;
        }
        return max/k;

    }
}