// Last updated: 9/25/2026, 2:28:01 PM
class Solution {
    public int minimumPushes(String word) {
        int[] count=new int[26];
        Set<Character> set=new HashSet<>();
        for(char ch:word.toCharArray()){
            count[ch-'a']++;
            set.add(ch);
        }
        List<Character> l=new ArrayList<>(set);
        Collections.sort(l,(a,b)->count[b-'a']-count[a-'a']);
        int ans=0,i=1,cur=0;
        for(char ch:l){
            ans+=count[ch-'a']*i;
            cur++;
            if(cur==8){
                i++;
                cur=0;
            }
        }
        return ans;
        
    }
}