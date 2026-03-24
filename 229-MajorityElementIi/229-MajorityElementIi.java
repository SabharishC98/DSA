// Last updated: 3/24/2026, 11:29:11 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length/3;
        Arrays.sort(nums);
        int i=1,count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
                i++;
                continue;
            }
            else{
                if(count>n) list.add(nums[i-1]);
                count=1;
            }
            i++;
        }
        if(count>n) list.add(nums[i-1]);
        return list;
    }
}