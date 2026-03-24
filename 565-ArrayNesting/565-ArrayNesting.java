// Last updated: 3/24/2026, 11:27:16 AM
class Solution {
    public int arrayNesting(int[] nums) {
        int ans=0;
        Set<Integer> total=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!total.contains(nums[i])){
                int n=0,index=i;
                Set<Integer> set=new HashSet<>();
                while(true){
                    if(set.contains(nums[index])){
                        break;
                    }
                    total.add(nums[index]);
                    n++;
                    set.add(nums[index]);
                    index=nums[index];
                }
                ans=Math.max(n,ans);
            }
        }
        return ans;
    }
}