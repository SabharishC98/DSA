// Last updated: 3/24/2026, 11:21:22 AM
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