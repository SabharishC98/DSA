// Last updated: 9/25/2026, 2:27:49 PM
class Solution {
    public long countSubstrings(String s, char c) {
        long m=0;
        int i=0,j=s.length()-1;
        while(i<=j){
            if(i==j && s.charAt(i)==c){
                m++;
                break;
            }
            if(s.charAt(i)==c) m++;
            if(s.charAt(j)==c) m++;
            i++;
            j--;
        }
        return m*(m+1)/2;
    }
}