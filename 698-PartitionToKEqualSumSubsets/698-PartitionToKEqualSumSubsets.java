// Last updated: 3/24/2026, 11:26:43 AM
import java.util.*;

class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for(int n : nums) sum += n;

        if(sum % k != 0) return false;

        int target = sum / k;

        Arrays.sort(nums);

        int[] bucket = new int[k];

        return back(nums, nums.length - 1, bucket, target);
    }

    boolean back(int[] nums, int index, int[] bucket, int target){

        if(index < 0) return true;

        int num = nums[index];

        for(int i=0;i<bucket.length;i++){

            if(bucket[i] + num > target)
                continue;

            bucket[i] += num;

            if(back(nums, index - 1, bucket, target))
                return true;

            bucket[i] -= num;

            if(bucket[i] == 0)
                break;
        }

        return false;
    }
}