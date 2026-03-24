// Last updated: 3/24/2026, 11:31:04 AM
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }

    private List<TreeNode> build(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r) {
            res.add(null);
            return res;
        }

        for (int i = l; i <= r; i++) {
            List<TreeNode> left = build(l, i - 1);
            List<TreeNode> right = build(i + 1, r);

            for (TreeNode L : left) {
                for (TreeNode R : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = L;
                    root.right = R;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
