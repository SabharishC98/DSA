// Last updated: 3/24/2026, 11:27:55 AM
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
    String s="";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        s+=root.val+" ";
        serialize(root.left);
        serialize(root.right);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root=null;
        if(data.length()==0) return root;
        String []arr=data.split(" ");
        root=new TreeNode(Integer.valueOf(arr[0]));
        for(int i=1;i<arr.length;i++){
            build(root,Integer.valueOf(arr[i]));
        }
        return root;
    } 

    public TreeNode build(TreeNode root,int n){
        if(root==null){
            root=new TreeNode(n);
            return root;
        }
        else if(root.val<n){
            root.right=build(root.right,n);
        }
        else{
            root.left=build(root.left,n);
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;