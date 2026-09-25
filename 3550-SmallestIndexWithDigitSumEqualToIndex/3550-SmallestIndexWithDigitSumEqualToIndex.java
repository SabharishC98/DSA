// Last updated: 9/25/2026, 2:25:56 PM
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=nums[i],s=0;
            while(j>0){
                s+=j%10;
                j/=10;
            }
            if(i==s) return i;
        }
        return -1;
    }
}