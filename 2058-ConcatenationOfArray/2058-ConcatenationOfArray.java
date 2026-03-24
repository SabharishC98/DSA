// Last updated: 3/24/2026, 11:23:23 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}