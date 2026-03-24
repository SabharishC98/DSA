// Last updated: 3/24/2026, 11:27:53 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
        return c;
    }
}