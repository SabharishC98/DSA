// Last updated: 9/25/2026, 2:37:37 PM
class ProductOfNumbers {
    List<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(num);
        if(num==1) return;
        for(int i=0;i<l.size()-1;i++){
           l.set(i,l.get(i)*num);
        }
    }
    
    public int getProduct(int k) {
        return l.get(l.size()-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */