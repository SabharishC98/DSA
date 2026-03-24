// Last updated: 3/24/2026, 11:26:10 AM
class MyCircularDeque {
int k;
int size=0;
ListNode head;
ListNode cur;
    public MyCircularDeque(int k) {
        this.k=k;
    }
    
    public boolean insertFront(int value) {
        if(size==k) return false;
        if(head==null){
            head=new ListNode(value);
            cur=head;
        }
        else{
            ListNode nn=new ListNode(value);
            head.prev=nn;
            nn.next=head;
            head=nn;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size==k) return false;
        if(head==null){
            head=new ListNode(value);
            cur=head;
        }
        else{
            ListNode nn=new ListNode(value);
            nn.prev=cur;
            cur.next=nn;
            cur=nn;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0) return false;
        head=head.next;
        if(head!=null)
        head.prev=null;
        else{
            cur=null;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size==0) return false;
        cur=cur.prev;
        if(cur!=null)
        cur.next=null;
        else{
            head=null;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(size==0) return -1;
        return head.val;
    }
    
    public int getRear() {
        if(size==0) return -1;
        return cur.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}
public class ListNode {
      int val;
      ListNode next;
      ListNode prev;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next,ListNode prev) { this.val = val; this.next = next; this.prev=prev;}
  }
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */