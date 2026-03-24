// Last updated: 3/24/2026, 11:22:04 AM
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Long> l=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int t=q.size();
            long sum=0;
            for(int i=0;i<t;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                sum+=temp.val;
            }
            l.add(sum);
        }
        if(l.size()<k) return -1;
        Collections.sort(l);
        return l.get(l.size()-k);
    }
}