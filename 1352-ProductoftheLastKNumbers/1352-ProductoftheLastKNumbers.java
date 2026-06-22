// Last updated: 6/22/2026, 11:44:24 AM
1class ProductOfNumbers {
2    List<Integer> l;
3    public ProductOfNumbers() {
4        l=new ArrayList<>();
5    }
6    
7    public void add(int num) {
8        l.add(num);
9        if(num==1) return;
10        for(int i=0;i<l.size()-1;i++){
11           l.set(i,l.get(i)*num);
12        }
13    }
14    
15    public int getProduct(int k) {
16        return l.get(l.size()-k);
17    }
18}
19
20/**
21 * Your ProductOfNumbers object will be instantiated and called as such:
22 * ProductOfNumbers obj = new ProductOfNumbers();
23 * obj.add(num);
24 * int param_2 = obj.getProduct(k);
25 */