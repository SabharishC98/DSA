// Last updated: 9/25/2026, 2:52:58 PM
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return ans;
        dfs(root, targetSum, new ArrayList<>());
        return ans;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> path) {
        if (node == null) return;

        path.add(node.val);

        // Leaf node check
        if (node.left == null && node.right == null && targetSum == node.val) {
            ans.add(new ArrayList<>(path)); // Add a copy
        } else {
            dfs(node.left, targetSum - node.val, path);
            dfs(node.right, targetSum - node.val, path);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}
