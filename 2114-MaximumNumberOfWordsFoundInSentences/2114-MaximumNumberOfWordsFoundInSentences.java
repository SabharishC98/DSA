// Last updated: 9/25/2026, 2:33:08 PM
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