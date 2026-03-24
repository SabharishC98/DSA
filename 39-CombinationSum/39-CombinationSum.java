// Last updated: 3/24/2026, 11:32:05 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        check(candidates,ans,target,new ArrayList<>(),0);
        return ans;
    }
    public void check(int[] candidates,List<List<Integer>> ans,int target,List<Integer> temp,int st){
        if(target==0){
            if(!ans.contains(temp)) ans.add(new ArrayList(temp));
            return;
        }
        if(target<0) return;
        for(int i=st;i<candidates.length;i++){
            temp.add(candidates[i]);
            check(candidates,ans,target-candidates[i],temp,i);
            temp.remove(temp.size()-1);
        }
    }
}