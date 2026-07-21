// Last updated: 7/22/2026, 12:18:01 AM
1class Solution {
2    public String frequencySort(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        for(char ch:s.toCharArray()){
5            map.put(ch,map.getOrDefault(ch,0)+1);
6        }
7        PriorityQueue<Character> pq=new PriorityQueue<>((a, b) ->{if(map.get(a).equals(map.get(b))) return b-a; return map.get(b)-map.get(a);});
8        for(Character ch:s.toCharArray()){
9            pq.add(ch);
10        }
11        StringBuilder sb=new StringBuilder("");
12        while(!pq.isEmpty()){
13            sb.append(pq.poll());
14        }
15        return sb.toString();
16    }
17}