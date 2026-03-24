// Last updated: 3/24/2026, 11:32:34 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int i=0,j=0,k=0;
        for(i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> cur=new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[k]);
                    ans.add(cur);
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                    
                }
                else if(sum>0) k--;
                else if(sum<0) j++;
                
            }
        }
        return ans;
    }
}