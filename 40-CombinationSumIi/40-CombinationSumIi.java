// Last updated: 3/24/2026, 11:32:02 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // skip duplicates at same recursion level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // pruning
            if (candidates[i] > target) break;

            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
