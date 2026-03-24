// Last updated: 3/24/2026, 11:27:50 AM
import java.util.*;

class Solution {
    public boolean makesquare(int[] nums) {

        int sum = 0;

        for(int n : nums) sum += n;

        if(sum % 4 != 0) return false;

        int target = sum/4;

        int[] sides = new int[4];

        Arrays.sort(nums);

        return dfs(nums, nums.length-1, sides, target);
    }

    boolean dfs(int[] nums, int index, int[] sides, int target){

        if(index < 0)
            return true;

        int val = nums[index];

        for(int i = 0; i < 4; i++){

            if(sides[i] + val > target) continue;

            sides[i] += val;

            if(dfs(nums, index-1, sides, target))
                return true;

            sides[i] -= val;
            if(sides[i]==0) break;
        }

        return false;
    }
}