// Last updated: 3/24/2026, 11:26:11 AM
class MyLinkedList {
    MyLinkedList head=null;
    MyLinkedList tail=null;
        int val;
        MyLinkedList next;
 public MyLinkedList() {

    }
    
    public int get(int index) {
    MyLinkedList current = head;
    for (int i = 0; i < index; i++) {
        if (current == null) return -1;
        current = current.next;
    }
    return (current != null) ? current.val : -1;
}

    
    public void addAtHead(int val) {
         MyLinkedList newNode = new MyLinkedList();
        newNode.val = val;
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }
    
    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList();
        newNode.val = val;
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add at specific index
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        MyLinkedList current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) return; // Index out of bounds

        MyLinkedList newNode = new MyLinkedList();
        newNode.val = val;
        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Delete at specific index
    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            if (head == null) tail = null; // List became empty
            return;
        }

        MyLinkedList current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) return; // Index out of bounds

        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */