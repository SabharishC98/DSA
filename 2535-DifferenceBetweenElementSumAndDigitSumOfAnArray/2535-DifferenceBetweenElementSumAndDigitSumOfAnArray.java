// Last updated: 9/25/2026, 2:30:16 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int e=0,d=0;
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            e+=c;
            while(c>0){
                d+=c%10;
                c/=10;
            }
        }
        return Math.abs(e-d);
    }
}