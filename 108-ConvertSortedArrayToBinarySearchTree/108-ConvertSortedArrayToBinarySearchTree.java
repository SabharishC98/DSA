// Last updated: 3/24/2026, 11:30:47 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length);
    }
    public TreeNode sort(int[] nums,int i,int j){
        if(i>=j) return null;
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sort(nums,i,mid);
        root.right=sort(nums,mid+1,j);
        return root;
    }
}