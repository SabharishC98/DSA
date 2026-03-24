// Last updated: 3/24/2026, 11:26:15 AM
class MyHashSet {
    ArrayList<Integer> n=new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!n.contains(key)) n.add(key);
    }
    
    public void remove(int key) {
        if(n.indexOf(key)!=-1)
        n.remove(n.indexOf(key));
            
    }
    
    public boolean contains(int key) {
        return n.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */