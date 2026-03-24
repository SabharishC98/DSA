// Last updated: 3/24/2026, 11:27:59 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int ind=nums[i]-1;
            if(nums[i]!=nums[ind]){
                int t=nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) l.add(nums[i]);
        }
        return l;
    }
}