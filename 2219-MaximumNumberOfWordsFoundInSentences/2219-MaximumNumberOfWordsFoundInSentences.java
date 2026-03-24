// Last updated: 3/24/2026, 11:23:04 AM
class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            String ans[]=s[i].split(" ");
            max=Math.max(ans.length,max);
        }
        return max;
    }
}