// Last updated: 7/22/2026, 12:01:16 AM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        Map<String,Integer> map=new HashMap<>();
4        for(String i:words){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        PriorityQueue<String> pq=new PriorityQueue<>((a, b) -> {
8                                                    if(map.get(a).equals(map.get(b)))
9                                                        return b.compareTo(a);
10                                                    return map.get(a) - map.get(b);
11                                                });
12        for(String i:map.keySet()){
13            pq.add(i);
14            if(pq.size()>k){
15                pq.poll();
16            }
17        }
18        List<String> ans=new ArrayList<>();
19        for(int i=0;i<k;i++){
20            ans.add(pq.poll());
21        }
22        Collections.reverse(ans);
23        return ans;
24    }
25}