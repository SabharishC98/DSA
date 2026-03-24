// Last updated: 3/24/2026, 11:20:45 AM
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