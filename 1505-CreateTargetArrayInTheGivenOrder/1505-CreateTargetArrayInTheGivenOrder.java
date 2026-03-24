// Last updated: 3/24/2026, 11:24:23 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(index[i],nums[i]);
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}