// Last updated: 3/24/2026, 11:22:00 AM
// class Solution {
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         long n=0;
//         Arrays.sort(nums);
//         int i=0,j=i+1;
//         while(i<nums.length-1){
//             if(j!=nums.length-1 && nums[j]==nums[j+1]){
//                 j++;
//                 continue;
//             }
//             if(i!=nums.length-2 && nums[i]==nums[i+1]){
//                 i++;
//                 j=i+1;
//                 continue;
//             }
//             if(nums[i]+nums[j]>=lower && nums[i]+nums[j]<=upper){ 
//                 n++;
//             }
//             if(nums[i]+nums[j]>upper || j==nums.length-1){
//                 i++;
//                 j=i+1;
//                 continue;
//             }
//             j++;
//             if(j>=nums.length-1){
//                 i++;
//                 j=i+1;
//             }
//         }
//         return n;
//     }
// }
import java.util.*;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    private long countPairs(int[] nums, int sum) {
        long count = 0;
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] + nums[right] <= sum) {
                count += (right - left); // all pairs with current left are valid
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
