// Last updated: 3/24/2026, 11:25:17 AM
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
    List<Integer> n = new ArrayList<>();
    
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        check(root, 0);  
        int sum = 0;
        for (int val : n) {
            sum += val;  
        }
        return sum;
    }

    public void check(TreeNode root, int sum) {
        if (root == null) return;

        sum = (sum << 1) | root.val;

        if (root.left == null && root.right == null) {
            n.add(sum);  
            return;
        }

        check(root.left, sum);
        check(root.right, sum);
    }
}
