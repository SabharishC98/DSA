// Last updated: 5/28/2026, 4:36:45 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class CBTInserter {
17    TreeNode head;
18    Queue<TreeNode> q=new LinkedList<>();
19
20    public CBTInserter(TreeNode root) {
21        head=root;
22        Queue<TreeNode> temp=new LinkedList<>();
23        temp.add(root);
24        while(!temp.isEmpty()){
25            TreeNode del=temp.poll();
26            if(del.right==null) q.add(del);
27            if(del.left!=null) temp.add(del.left);
28            if(del.right!=null) temp.add(del.right);
29        }
30    }
31    
32    public int insert(int val) {
33        TreeNode node=new TreeNode(val);
34        TreeNode parent=q.peek();
35        if(parent.left!=null){
36            parent.right=node;
37            q.poll();
38        }
39        else{
40            parent.left=node;
41        }
42        q.add(node);
43        return parent.val;
44    }
45    
46    public TreeNode get_root() {
47        return head;
48    }
49}
50
51/**
52 * Your CBTInserter object will be instantiated and called as such:
53 * CBTInserter obj = new CBTInserter(root);
54 * int param_1 = obj.insert(val);
55 * TreeNode param_2 = obj.get_root();
56 */