// Last updated: 9/25/2026, 2:52:17 PM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(head!=null){
            Node cur=new Node(head.val);
            map.put(head,cur);
            head=head.next;
        }
        for(Node cur:map.keySet()){
            if(map.containsKey(cur.next)){
                map.get(cur).next=map.get(cur.next);
            }
            if(map.containsKey(cur.random)){
                map.get(cur).random=map.get(cur.random);
            }
        }
        return map.get(temp);
    }
}