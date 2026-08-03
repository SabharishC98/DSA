// Last updated: 8/4/2026, 12:05:08 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] count=new int[26];
4        Set<Character> set=new HashSet<>();
5        for(char ch:word.toCharArray()){
6            count[ch-'a']++;
7            set.add(ch);
8        }
9        List<Character> l=new ArrayList<>(set);
10        Collections.sort(l,(a,b)->count[b-'a']-count[a-'a']);
11        int ans=0,i=1,cur=0;
12        for(char ch:l){
13            ans+=count[ch-'a']*i;
14            cur++;
15            if(cur==8){
16                i++;
17                cur=0;
18            }
19        }
20        return ans;
21        
22    }
23}