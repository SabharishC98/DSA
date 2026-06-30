// Last updated: 6/30/2026, 9:34:24 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int i=0,j=0,max=0;
4        HashMap<Character,Integer> map=new HashMap<>();
5        while(j<s.length()){
6            char ch=s.charAt(j);
7            map.put(ch,map.getOrDefault(ch,0)+1);
8            while(map.size()==3){
9                max+=s.length()-(j);
10                char ch1=s.charAt(i);
11                map.put(ch1,map.get(ch1)-1);
12                if(map.get(ch1)==0) map.remove(ch1);
13                i++;
14            }
15            j++;
16        }
17        return max;
18    }
19}