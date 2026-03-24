// Last updated: 3/24/2026, 11:25:29 AM
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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return false;
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
                temp.add(cur.val);
                if(cur.left!=null && cur.right!=null && ((cur.left.val==x && cur.right.val==y) || (cur.left.val==y && cur.right.val==x))) return false;

            }
            if(temp.contains(x) && temp.contains(y)) return true;
        }
        return false;
    }
}