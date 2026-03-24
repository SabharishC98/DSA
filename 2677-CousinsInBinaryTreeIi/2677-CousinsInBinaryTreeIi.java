// Last updated: 3/24/2026, 11:22:01 AM
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
    public TreeNode replaceValueInTree(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size(),sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            l.add(sum);
        }
        root.val=0;
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int j=0;j<size;j++){
                int dif=0;
                TreeNode temp=q.poll();
                if(temp.left!=null) dif+=temp.left.val;
                if(temp.right!=null) dif+=temp.right.val;
                if(temp.left!=null){temp.left.val=l.get(i)-dif; q.add(temp.left);}
                if(temp.right!=null){temp.right.val=l.get(i)-dif; q.add(temp.right);}
            }
            i++;
        }
        return root;
    }
}