// Last updated: 3/24/2026, 11:26:52 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int h = height(root);
        int cols = (1 << h) - 1;

        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add("");
            }
            ans.add(row);
        }

        check(ans, root, 0, (cols - 1) / 2, h);
        return ans;
    }

    public void check(List<List<String>> ans, TreeNode node, int r, int c, int h) {
        if (node == null) return;

        ans.get(r).set(c, String.valueOf(node.val));

        int t = 1 << (h - r - 2);

        if (node.left != null) {
            check(ans, node.left, r + 1, c - t, h);
        }
        if (node.right != null) {
            check(ans, node.right, r + 1, c + t, h);
        }
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}