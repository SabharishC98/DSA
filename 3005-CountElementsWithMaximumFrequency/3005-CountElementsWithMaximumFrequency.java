// Last updated: 9/25/2026, 2:28:04 PM
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