// Last updated: 9/25/2026, 2:36:09 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n!=m) return false;
        Set<Character> set=new HashSet<>();

        int[] w1=new int[26];
        int[] w2=new int[26];
        for(char ch:word1.toCharArray()){
            w1[ch-'a']++;
            set.add(ch);
        }
        for(char ch:word2.toCharArray()){
            w2[ch-'a']++;
            if(!set.contains(ch)) return false;
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        for(int i=0;i<26;i++) if(w1[i]!=w2[i]) return false;
        return true;
    }
}