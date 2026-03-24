// Last updated: 3/24/2026, 11:20:52 AM
class Solution {
    public int[] transformArray(int[] nums) {
        int arr[]=new int[nums.length];
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) e++;
            else o++;
        }
        for(int i=0;i<e;i++){
            arr[i]=0;
        }
        for(int i=e;i<nums.length;i++){
            arr[i]=1;
        }
        return arr;
    }
}