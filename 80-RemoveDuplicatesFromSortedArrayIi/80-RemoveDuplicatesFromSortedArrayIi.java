// Last updated: 3/24/2026, 11:31:19 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int temp = 1, index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (temp < 2 && nums[i] == nums[i - 1]) {
                nums[index]=nums[i];
                index++;
                temp++;
            }
            else if(temp >= 2 && nums[i] == nums[i - 1]){
                continue;
            }
            if (nums[i] != nums[i - 1]) {
                temp=1;
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}