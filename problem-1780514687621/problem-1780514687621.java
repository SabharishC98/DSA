// Last updated: 6/4/2026, 12:54:47 AM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5        if(n!=m) return false;
6        Set<Character> set=new HashSet<>();
7
8        int[] w1=new int[26];
9        int[] w2=new int[26];
10        for(char ch:word1.toCharArray()){
11            w1[ch-'a']++;
12            set.add(ch);
13        }
14        for(char ch:word2.toCharArray()){
15            w2[ch-'a']++;
16            if(!set.contains(ch)) return false;
17        }
18        Arrays.sort(w1);
19        Arrays.sort(w2);
20        for(int i=0;i<26;i++) if(w1[i]!=w2[i]) return false;
21        return true;
22    }
23}