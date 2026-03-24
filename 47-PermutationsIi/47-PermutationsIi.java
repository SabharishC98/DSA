// Last updated: 3/24/2026, 11:31:54 AM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        Map<Integer, Boolean> vis = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            vis.put(i, false);
        }
        
        back(nums, ans, new ArrayList<>(),vis);
        List<List<Integer>> res=new ArrayList<>();
        for(List<Integer> i:ans){
            res.add(i);
        }
        return res;
    }

    public void back(int[] nums, Set<List<Integer>> ans, List<Integer> temp,Map<Integer,Boolean> vis) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            
            if (vis.get(i) == false) {
                vis.put(i, true);
                temp.add(nums[i]);
                back(nums, ans, temp,vis);
                temp.remove(temp.size() - 1);
                vis.put(i, false);
            }
        }
    }
}