// Last updated: 3/24/2026, 11:32:31 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int a=0,b=0,c=0,d=0;
        for(a=0;a<nums.length-3;a++){
            if(a>0 && nums[a]==nums[a-1]) continue;
            for(b=a+1;b<nums.length-2;b++){
                if(b>a+1 && nums[b]==nums[b-1]) continue;
                c=b+1;
                d=nums.length-1;
                while(c<d){
                    long sum=(long)nums[a]+nums[b]+nums[c]+nums[d];
                    if(sum==(long)target){
                        List<Integer> cur=new ArrayList<>();
                        cur.add(nums[a]);
                        cur.add(nums[b]);
                        cur.add(nums[c]);
                        cur.add(nums[d]);
                        ans.add(cur);
                        while(c<d && nums[c]==nums[c+1]) c++;
                        while(c<d && nums[d]==nums[d-1]) d--;
                        c++;
                        d--;
                    }
                    else if(sum<target) c++;
                    else if(sum>target) d--;
                }
            }
        }
        return ans;
    }
}