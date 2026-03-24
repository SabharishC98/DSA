// Last updated: 3/24/2026, 11:30:37 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<>();
        if(root==null) return root;
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                Node cur=q.poll();
                if(i==len-1) cur.next=null;
                else cur.next=q.peek();
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
        }
        return root;
    }
}