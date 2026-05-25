// Last updated: 5/26/2026, 1:42:00 AM
1class RandomizedSet {
2    Map<Integer, Integer> indexMap; // val -> index in list
3    List<Integer> list;
4
5    public RandomizedSet() {
6        indexMap = new HashMap<>();
7        list = new ArrayList<>();
8    }
9
10    public boolean insert(int val) {
11        if (indexMap.containsKey(val)) return false;
12        list.add(val);
13        indexMap.put(val, list.size() - 1);
14        return true;
15    }
16
17    public boolean remove(int val) {
18        if (!indexMap.containsKey(val)) return false;
19        int idx = indexMap.get(val);
20        int last = list.get(list.size() - 1);
21        list.set(idx, last);       // overwrite target with last element
22        indexMap.put(last, idx);   // update last element's index
23        list.remove(list.size() - 1); // remove last
24        indexMap.remove(val);
25        return true;
26    }
27
28    public int getRandom() {
29        int rand = (int)(Math.random() * list.size());
30        return list.get(rand);
31    }
32}
33/**
34 * Your RandomizedSet object will be instantiated and called as such:
35 * RandomizedSet obj = new RandomizedSet();
36 * boolean param_1 = obj.insert(val);
37 * boolean param_2 = obj.remove(val);
38 * int param_3 = obj.getRandom();
39 */