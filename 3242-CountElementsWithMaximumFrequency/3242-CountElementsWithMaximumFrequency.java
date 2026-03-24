// Last updated: 3/24/2026, 11:21:26 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            max=Math.max(max,arr[nums[i]]);
        }
        for(int i=0;i<101;i++){
            if(arr[i]==max){
                c+=max;
            }
        }
        return c;
    }
}