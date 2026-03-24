// Last updated: 3/24/2026, 11:26:26 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<len;i++){
                Node cur=q.poll();
                for(int j=0;j<cur.children.size();j++){
                    q.offer(cur.children.get(j));
                }
                temp.add(cur.val);
            }
            list.add(temp);
        }
        return list;
    }
}