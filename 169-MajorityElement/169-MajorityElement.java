// Last updated: 3/24/2026, 11:29:53 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        // Arrays.sort(nums);
        // int i=1,m=0,count=1,e=nums[0],ans=0;
        // while(i<nums.length){
        //     if(nums[i]==nums[i-1]){
        //         count++;
        //         i++;
        //         continue;
        //     }
        //     else{
        //         m=Math.max(m,count);
        //         if(m==count){
        //             ans=nums[i-1];
        //         }
        //         count=1;
        //     }
        //     i++;
        // }
        // if(m<count) ans=nums[i-1];
        // return ans;
    }
}