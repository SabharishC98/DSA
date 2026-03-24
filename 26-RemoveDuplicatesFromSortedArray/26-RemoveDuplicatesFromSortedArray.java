// Last updated: 3/24/2026, 11:32:21 AM
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;

            }
        }
        return count;
    }
}