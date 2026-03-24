// Last updated: 3/24/2026, 11:25:20 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Map<ListNode,Integer> map=new HashMap<>();
        Stack<ListNode> st=new Stack<>();
        ListNode t=head;
        int len=0;
        while(t!=null){
            while(!st.isEmpty() && st.peek().val<t.val){
                map.put(st.pop(),t.val);
            }
            st.push(t);
            t=t.next;
            len++;
        }
        while(!st.isEmpty()) map.put(st.pop(),0);
        
        t=head;
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=map.get(t);
            t=t.next;
        }
        return arr;




        // Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        // Stack<Integer> st=new Stack<>();
        // ListNode t=head;
        // while(t!=null){
        //     while(!st.isEmpty() && st.peek()<t.val){
        //         int k=st.pop();
        //         ArrayList<Integer> temp=map.getOrDefault(k,new ArrayList<>());
        //         temp.add(t.val);
        //         map.put(k,temp);
        //     }
        //     st.push(t.val);
        //     t=t.next;
        // }
        // while(!st.isEmpty()){ int k=st.pop();
        //         ArrayList<Integer> temp=map.getOrDefault(k,new ArrayList<>());
        //         temp.add(0);
        //         map.put(k,temp);}
        // List<Integer> l=new ArrayList<>();
        // t=head;
        // while(t!=null){
        //     l.add(map.get(t.val).get(0));
        //     ArrayList<Integer> temp=map.getOrDefault(t.val,new ArrayList<>());
        //     if(temp.size()!=0){
        //         temp.remove(0);
        //         map.put(t.val,temp);
        //     }
        //     t=t.next;
        // }
        // int arr[]=new int[l.size()];
        // for(int i=0;i<l.size();i++) arr[i]=l.get(i);
        // return arr;

    }
}