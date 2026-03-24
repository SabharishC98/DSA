// Last updated: 3/24/2026, 11:28:43 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuilder ans;
    void dfs(TreeNode root){
        if(root==null){
            ans.append("null,");
            return;
        }
        ans.append(root.val).append(",");
        dfs(root.left);
        dfs(root.right);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ans=new StringBuilder();
        dfs(root);
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        int[] index={0};
        return build(arr, index);
    }

    TreeNode build(String[] arr, int[] index){
        if(arr[index[0]].equals("null")){
            index[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(arr[index[0]]));
        index[0]++;
        node.left=build(arr, index);
        node.right=build(arr, index);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));