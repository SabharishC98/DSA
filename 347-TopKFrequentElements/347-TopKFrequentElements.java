// Last updated: 7/21/2026, 9:48:30 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> map.get(a)-map.get(b));
8        for(int i:map.keySet()){
9            pq.add(i);
10            if(pq.size()>k){
11                pq.poll();
12            }
13        }
14        int[] ans=new int[k];
15        for(int i=0;i<k;i++){
16            ans[i]=pq.poll();
17        }
18        return ans;
19    }
20}