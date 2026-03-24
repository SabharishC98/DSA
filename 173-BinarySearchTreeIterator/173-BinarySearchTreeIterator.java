// Last updated: 3/24/2026, 11:29:49 AM
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
 * }  3 7 9 15 20
 */
class BSTIterator {
    Queue<Integer> q;
    public BSTIterator(TreeNode root) {
        this.q=new LinkedList<>();
        inorder(root);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        q.offer(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return q.poll();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */