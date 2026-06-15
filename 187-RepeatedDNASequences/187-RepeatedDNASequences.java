// Last updated: 6/16/2026, 5:21:28 AM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        HashMap<String,Integer> map=new HashMap<>();
4        List<String> ans=new ArrayList<>();
5        if(s.length()<=10) return ans;
6        StringBuilder sb=new StringBuilder();
7        for(int i=0;i<10;i++){
8            sb.append(s.charAt(i));
9        }
10        map.put(sb.toString(),map.getOrDefault(sb.toString(), 0)+1);
11        for(int i=10;i<s.length();i++){
12            sb.deleteCharAt(0);
13            sb.append(s.charAt(i));
14            map.put(sb.toString(),map.getOrDefault(sb.toString(), 0)+1);
15        }
16        // System.out.println(map);
17        for(String i:map.keySet()){
18            if(map.get(i)>1) ans.add(i);
19        }
20        return ans;
21    }
22}