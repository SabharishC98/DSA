// Last updated: 9/25/2026, 2:43:13 PM
class MyCircularQueue {
    int k;
    int last;
    Queue<Integer> q;
    public MyCircularQueue(int k) {
        this.q=new LinkedList<>();
        this.k=k;
    }
    
    public boolean enQueue(int value) {
        if(q.size()==k) return false;
        q.offer(value);
        last=value;
        return true;
    }
    
    public boolean deQueue() {
        if(q.size()==0) return false;
        q.poll();
        return true;
    }
    
    public int Front() {
        if(q.size()==0) return -1;
        return q.peek();
    }
    
    public int Rear() {
        if(q.size()==0) return -1;
        return last;
    }
    
    public boolean isEmpty() {
        return q.isEmpty();
    }
    
    public boolean isFull() {
        return q.size()==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */