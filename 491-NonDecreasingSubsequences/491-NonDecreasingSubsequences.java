// Last updated: 3/24/2026, 11:27:46 AM
class Solution {
    Set<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        back(nums,0,new ArrayList<>());
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i:set) ans.add(i);
        return ans;
    }
    public void back(int[] nums,int ind,List<Integer> temp){
        if(ind==nums.length){
            if(temp.size()>=2)
            set.add(new ArrayList(temp));
            return;
        }
        if(temp.size()>=2) set.add(new ArrayList(temp));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            if((temp.size()!=0 && temp.get(temp.size()-1)<=nums[i])||temp.size()==0){
                temp.add(nums[i]);
                back(nums,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}